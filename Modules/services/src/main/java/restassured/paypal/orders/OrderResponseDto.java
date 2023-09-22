package restassured.paypal.orders;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class OrderResponseDto {
    String id;
    String intent;
    String status;
    List<PurchaseUnit> purchase_units;
    String create_time;
    List<Link> links;


}
