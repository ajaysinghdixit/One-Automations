package restassured.base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

import java.util.Map;

import restassured.client.Client;

import java.util.HashMap;

public class Base {
    public Client client;

    public Base(Client client) {
        this.client = client;
    }

    public RequestSpecBuilder createSpec(String path, Map<String, String> headers) {
        return new RequestSpecBuilder().addHeaders(headers)
                .setContentType(ContentType.JSON)
                .setBasePath(path);
    }

    public RequestSpecBuilder createSpec1(String path, Map<String, String> headers) {
        return new RequestSpecBuilder()
                .addHeaders(headers)
                .setBasePath(path)
                .setContentType(ContentType.JSON);
    }

    public RequestSpecBuilder createSpec1(String path, Map<String, String> pathParam, Map<String, String> headers) {
        return createSpec1(path, headers)
                .addPathParams(pathParam)
                .setContentType(ContentType.JSON);
    }

    public RequestSpecBuilder createSpec1(String path, Map<String, String> pathParams, Map<String, String> queryParams, Map<String, String> headers) {
        return createSpec1(path, pathParams, headers).addQueryParams(queryParams);
    }


    public Map<String, String> headers() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", client.getCsrfToken());
        return headers;
    }
}
