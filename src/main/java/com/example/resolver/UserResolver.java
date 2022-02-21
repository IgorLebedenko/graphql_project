package com.example.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.criteria.UserCriteria;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class UserResolver implements GraphQLQueryResolver {

    @Autowired
    private UserService service;

    public Page<User> findAll(UserCriteria criteria) {
        return service.findAll(criteria);
    }

    public User findOne(Integer id) {
        return service.findOne(id);
    }
}
