package readers;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
@Data
@Builder
@Jacksonized
public class Environment {
    String base_url;
    String admin_user;
    String admin_password;
    List<Services> services;
}
