package nc.kagoukoding.agendix.dto;

import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import nc.kagoukoding.agendix.dto.base.AbstractContactInfoDTO;
import nc.kagoukoding.agendix.entity.WeeklyAvailability;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CompanyDTO extends AbstractContactInfoDTO {

    private Set<WeeklyAvailability> WeeklyAvailabilities;
}
