package restassured.auth;

import io.restassured.response.Response;
import restassured.client.Client;

import java.lang.annotation.Documented;

import static io.restassured.RestAssured.given;

public class Api {
    private static final String v1 = "/v1";
    private static final String getBearerToken = v1 + "/oauth2/token";

    //"This should ideally sign in using the username password and retrieve access token from the response"
    public static void signIn(Client client, String clientId, String clientSecret) {
        String token = "Bearer A21AALZ-UUJoiC5HRpjlfrDhaZTcJzmLlSuUc22G41tucC1ZGzugjlNj88FnGrok4E_0URy-iJv7FhLGRMe2uO-h7x_cKKqWQ";
        client.setCsrfToken(token);

    }


}
