package restassured.client;

public enum HTTPStatus {
    OK(200),
    NOT_FOUND(400),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    CREATED(201),
    BAD_REQUEST(400),
    UN_PROCESSABLE(422),
    ;

    final int statusCode;

    HTTPStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getValue() {
        return statusCode;
    }

}
