package com.example.criteria;

import net.n2oapp.platform.jaxrs.RestCriteria;

public abstract class AbstractCriteria extends RestCriteria {
    private static final int DEFAULT_PAGE = 0;
    private static final int DEFAULT_PAGE_SIZE = 10;

    public AbstractCriteria() {
        super(DEFAULT_PAGE, DEFAULT_PAGE_SIZE);
    }
}
