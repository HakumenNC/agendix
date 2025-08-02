package nc.kagoukoding.agendix.entity.base;

import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@MappedSuperclass
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractContactInfo extends AbstractBaseEntity {

    private String phoneNumber;
    private String mobilePhoneNumber;
    private String email;
    private String address;

}
