package com.example.criteria;

import lombok.Data;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Data
public class UserCriteria extends AbstractCriteria {
    private String firstName;
    private String lastName;
    private Integer salary;
    private LocalDate birthDate;

    @Override
    protected List<Sort.Order> getDefaultOrders() {
        return Collections.emptyList();
    }
}
