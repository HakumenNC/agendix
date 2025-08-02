package nc.kagoukoding.agendix.dto.base;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractContactInfoDTO extends AbstractBaseDTO {

    private String phoneNumber;
    private String mobilePhoneNumber;
    private String email;
    private String address;

}
