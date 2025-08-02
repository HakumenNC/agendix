package nc.kagoukoding.agendix.specification;

import java.lang.reflect.Field;

import org.springframework.data.jpa.domain.Specification;

import nc.kagoukoding.agendix.entity.Company;

public class CompanySpecification {

    public static Specification<Company> byObject(Company filter) {
        return (root, query, cb) -> {
            javax.persistence.criteria.Predicate predicate = cb.conjunction();
            for (Field field : Company.class.getDeclaredFields()) {
                field.setAccessible(true);
                try {
                    Object value = field.get(filter);
                    if (value != null) {
                        if (value instanceof String) {
                            String str = (String) value;
                            if (!str.isEmpty()) {
                                predicate = cb.and(predicate, cb.like(cb.lower(root.get(field.getName())), "%" + str.toLowerCase() + "%"));
                            }
                        } else {
                            predicate = cb.and(predicate, cb.equal(root.get(field.getName()), value));
                        }
                    }
                } catch (IllegalAccessException ignored) {}
            }
            return predicate;
        };
    }


    public static Specification<Company> hasCompanyName(String companyName) {
        return (root, query, cb) -> companyName == null ? null : cb.equal(root.get("companyName"), companyName);
    }
}
