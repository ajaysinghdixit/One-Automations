package services.paypal.orders;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import restassured.client.HTTPStatus;
import restassured.paypal.orders.*;
import services.paypal.PayPalBaseTest;

import java.util.ArrayList;
import java.util.List;

public class GetOrdersTest extends PayPalBaseTest {
    OrdersV2 orders = new OrdersV2(cl);
    @BeforeClass
    public void beforeAll(){

    }
    @Test
    public void t1() {
        Amount amt = Amount.builder().currency_code("USD").value("100.00").build();
        Payee payee = Payee.builder().merchant_id("ER87FV8ER63HJ").email_address("etondoze-facilitator@gmail.com").build();
        PurchaseUnit purchaseUnit = PurchaseUnit.builder().reference_id("default").amount(amt).payee(payee).build();
        List<PurchaseUnit> lstPu = new ArrayList<>();
        lstPu.add(purchaseUnit);
        OrderRequestDto requestDto  = OrderRequestDto.builder().intent("CAPTURE").purchaseUnits(lstPu).build();
        System.out.printf(requestDto.toString());
        ValidatableResponse data = orders.createOrder(requestDto,400);

        ValidatableResponse resp12 = orders.getOrder1("oneeee","twooo", "three", "four", 404);
//
//
//        OrderResponseDto resp = orders.getOrder("45E05420SE3729133");
//        OrderResponseDto resp2 = orders.getOrder("45E05420SE3729133");
//        ValidatableResponse resp1 = orders.getOrder("4R377122FY529181811", HTTPStatus.NOT_FOUND.getValue());



//        System.out.printf(String.valueOf(resp));
    }
}
