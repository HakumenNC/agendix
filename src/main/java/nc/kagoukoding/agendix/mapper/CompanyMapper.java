package nc.kagoukoding.agendix.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import nc.kagoukoding.agendix.entity.Company;
import nc.kagoukoding.agendix.dto.CompanyDTO;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    CompanyDTO toDTO(Company provider);
    Company toEntity(CompanyDTO dto);
}
