package nc.kagoukoding.agendix.controller;

import org.springframework.web.bind.annotation.RestController;

import nc.kagoukoding.agendix.dto.CompanyDTO;
import nc.kagoukoding.agendix.entity.Company;
import nc.kagoukoding.agendix.mapper.CompanyMapper;
import nc.kagoukoding.agendix.service.crud.CompanyService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private CompanyMapper mapper;

    @GetMapping
    public List<Company> getAll() {
        return companyService.getAll();
    }

    @GetMapping("/search")
    public Page<CompanyDTO> search(@RequestBody(required = false) Company company) {
        return companyService.search(company).map(mapper::toDTO);
    }

    @GetMapping("/{id}")
    public Company getById(@PathVariable(required = true) Long id) {
        return companyService.getById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No data found with id=" + id));
    }

    @PostMapping
    public Company create(@RequestBody Company company) {
        return companyService.create(company);
    }

    @PutMapping("/{id}")
    public Company update(@PathVariable(required = true) Long id, @RequestBody Company company) {
        if (!companyService.getById(id).isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No data found with id=" + id);
        }
        return companyService.update(id, company);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        companyService.delete(id);
    }
}