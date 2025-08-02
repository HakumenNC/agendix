package nc.kagoukoding.agendix.dto.base;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractPersonDTO extends AbstractContactInfoDTO {

    private String firstName;
    private String lastName;
}
