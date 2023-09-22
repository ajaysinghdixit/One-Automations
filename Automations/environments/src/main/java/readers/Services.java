package readers;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class Services {
    String name;
    String url;
    String user;
    String password;
    String client_id;
    String client_secret;
    String port;
}
