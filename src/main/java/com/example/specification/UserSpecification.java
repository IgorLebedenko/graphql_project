package com.example.specification;

import com.example.criteria.UserCriteria;
import com.example.entity.UserEntity;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class UserSpecification implements Specification<UserEntity> {

    private UserCriteria criteria;

    public UserSpecification(UserCriteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder builder) {
        Predicate predicate = builder.and();
//        if (nonNull(criteria.getFirstName()))
//            predicate = builder.and(predicate, builder.equal(root.get(UserEntity_.firstName), "%" + criteria.getFirstName() + "%"));
//        if (nonNull(criteria.getLastName()))
//            predicate = builder.and(predicate, builder.like(root.get(UserEntity_.lastName), "%" + criteria.getLastName() + "%"));
//        if (nonNull(criteria.getSalary()))
//            predicate = builder.and(predicate, builder.gt(root.get(UserEntity_.salary), criteria.getSalary()));
//        if (nonNull(criteria.getBirthDate()))
//            predicate = builder.and(predicate, builder.gt(root.get(UserEntity_.birthDate), criteria.getBirthDate()));
        return predicate;
    }
}
