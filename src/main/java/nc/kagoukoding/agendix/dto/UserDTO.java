package nc.kagoukoding.agendix.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import nc.kagoukoding.agendix.dto.base.AbstractPersonDTO;
import nc.kagoukoding.agendix.entity.enums.UserRole;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserDTO extends AbstractPersonDTO {

    private String login;
    private String password;
    private UserRole role;

    private CompanyDTO company;
}
