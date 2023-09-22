package restassured.paypal.orders;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class Link {
    String href;
    String rel;
    String method;
}
