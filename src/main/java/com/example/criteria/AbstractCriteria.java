package com.example.criteria;

import lombok.Data;
import net.n2oapp.platform.jaxrs.RestCriteria;
import org.springframework.data.domain.Sort;

@Data
public abstract class AbstractCriteria extends RestCriteria {
    private static final int DEFAULT_PAGE = 0;
    private static final int DEFAULT_PAGE_SIZE = 10;

    private String sortedBy;
    private Sort.Direction sortDirection;

    public AbstractCriteria() {
        super(DEFAULT_PAGE, DEFAULT_PAGE_SIZE);
    }
}
