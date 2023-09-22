package restassured.paypal.orders;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import restassured.base.Base;
import restassured.client.Client;
import io.restassured.response.ValidatableResponse;

import java.util.HashMap;
import java.util.Map;

public class OrdersV2 extends Base {
    private final String version = "/v2";
    private final String endpoint = "/checkout";
    private final String getOrder = version + endpoint + "/orders/{orderId}";
    private final String getOrder1 = version + endpoint + "/orders/{orderId}/{path1}";
    private final String createOrder = version + endpoint + "/orders";
    private  Map<String, String> headers;

    public OrdersV2(Client client) {
        super(client);
        this.client = client;
    }

    public ValidatableResponse getOrder(String orderId, int status) {
        return client.get(this.createSpec(getOrder, headers()), status);
    }

    public OrderResponseDto getOrder(String orderId) {
        ValidatableResponse resp = getOrder(orderId, 200);
        return client.extractDto(resp, OrderResponseDto.class);
    }

    public ValidatableResponse createOrder(OrderRequestDto request, int status) {
        RequestSpecBuilder spec = createSpec1(createOrder,headers()).setBody(request);
        return client.post(spec, status);
    }

    public OrderResponseDto createOrder(OrderRequestDto request) {
        ValidatableResponse resp = createOrder(request, 201);
        return client.extractDto(resp, OrderResponseDto.class);
    }

    public ValidatableResponse getOrder1(String one, String two, String three, String four, int status) {
        headers.put("", "");
        Map<String, String> params = new HashMap<>();
        params.put("orderId", one);
        params.put("path1", two);

        Map<String, String> queryParam = new HashMap<>();
        queryParam.put("keyone", three);
        queryParam.put("keytwo", four);
        RequestSpecBuilder spec = createSpec1(getOrder1, params, headers);
        return client.get(spec, status);
    }
}
