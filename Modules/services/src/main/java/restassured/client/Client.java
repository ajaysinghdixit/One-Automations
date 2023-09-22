package restassured.client;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Header;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import lombok.Getter;

import static io.restassured.RestAssured.given;

@Getter
public class Client {
    private String url;
    private Header header;

    private RequestSpecBuilder specBuilder;


    @Getter
    private String csrfToken;

    public Client(String url) {
        this.url = url;
        RestAssured.baseURI = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public void setAuth(String token) {
        //specBuilder.setAuth(CsrfTokenFinder)

    }

    public void setCsrfToken(String token) {
        this.csrfToken = token;
    }

    public ValidatableResponse get(RequestSpecBuilder spec, int status) {
        return given().spec(spec.build()).get().then().statusCode(status);
    }

    public ValidatableResponse post(RequestSpecBuilder spec, int status) {
        return given().spec(spec.build()).post().then().statusCode(status);
    }

    public <T> T extractDto(ValidatableResponse resp, Class<T> t){
        return resp.extract().as(t, ObjectMapperType.JACKSON_2);
    }

}
