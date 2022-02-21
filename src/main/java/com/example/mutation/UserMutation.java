package com.example.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMutation implements GraphQLMutationResolver {

    @Autowired
    private UserService service;

    public User create(User user) {
        return service.create(user);
    }

    public User update(User user) {
        return service.update(user);
    }

    public void delete(Integer id) {
        service.delete(id);
    }
}
