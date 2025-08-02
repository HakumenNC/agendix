package nc.kagoukoding.agendix.dto.auth;

import lombok.Data;

@Data
public class AuthRequest {
    private String login;
    private String password;
}
