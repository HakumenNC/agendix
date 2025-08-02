package nc.kagoukoding.agendix.service.crud;

import nc.kagoukoding.agendix.dto.CompanyDTO;
import nc.kagoukoding.agendix.entity.Company;
import nc.kagoukoding.agendix.mapper.CompanyMapper;
import nc.kagoukoding.agendix.repository.CompanyRepository;
import nc.kagoukoding.agendix.specification.CompanySpecification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CompanyService {

    private final String CLASS_NAME = this.getClass().getSimpleName();

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyMapper mapper;

    public Page<Company> search(Company company) {
        log.info("[" + CLASS_NAME + "][search] Searching by provider=[{}]", company);

        Company filter = new Company();
        filter.setCode("test");

        return companyRepository.findAll(CompanySpecification.byObject(filter), Pageable.unpaged());
    }

    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    public Optional<Company> getById(Long id) {
        return companyRepository.findById(id);
    }

    public Company create(Company provider) {
        return companyRepository.save(provider);
    }

    public Company update(Long id, Company provider) {
        return companyRepository.save(provider);
    }

    public void delete(Long id) {
        companyRepository.deleteById(id);
    }

    public CompanyDTO create(CompanyDTO providerDTO) {
        Company company = mapper.toEntity(providerDTO);
        Company saved = companyRepository.save(company);
        return mapper.toDTO(saved);
    }

    public CompanyDTO update(Long id, CompanyDTO providerDTO) {
        Company company = mapper.toEntity(providerDTO);
        company.setId(id);
        Company saved = companyRepository.save(company);
        return mapper.toDTO(saved);
    }

    public CompanyDTO getByIdDTO(Long id) {
        return companyRepository.findById(id)
                .map(mapper::toDTO)
                .orElse(null);
    }

    public List<CompanyDTO> getAllDTO() {
        return companyRepository.findAll().stream()
                .map(mapper::toDTO)
                .toList();
    }

}