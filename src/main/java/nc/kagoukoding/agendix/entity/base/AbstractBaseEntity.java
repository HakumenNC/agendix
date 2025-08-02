package nc.kagoukoding.agendix.entity.base;

import javax.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class AbstractBaseEntity {

    private String code;
    private String label;
}
