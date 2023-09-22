package restassured.paypal.login;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class LoginResponseDto {
    String username;
    String password;
    String token;
}
