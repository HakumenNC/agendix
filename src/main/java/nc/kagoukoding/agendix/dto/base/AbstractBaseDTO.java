package nc.kagoukoding.agendix.dto.base;

import javax.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class AbstractBaseDTO {

    private Long id;

    private String code;
    private String label;
}
