package restassured.paypal.login;

import jsonutils.ResponseDto;

public class Login {

    public LoginResponseDto getLoginInfo() {
        String login = "{\"username\":\"ajay\",\"password\":\"passs\",\"token\":\"tokaaaan\"}";
        return ResponseDto.responseAsDto(login, LoginResponseDto.class);
    }
}
