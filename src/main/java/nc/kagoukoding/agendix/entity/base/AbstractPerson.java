package nc.kagoukoding.agendix.entity.base;

import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@MappedSuperclass
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractPerson extends AbstractContactInfo {

    private String firstName;
    private String lastName;

}
