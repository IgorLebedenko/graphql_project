package com.example.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserMutation implements GraphQLMutationResolver {

    @Autowired
    private UserService service;

    public User create(User user) {
        return service.create(user);
    }

    public User create(String firstName, String lastName, LocalDate birthDate) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setBirthDate(birthDate);
        return service.create(user);
    }

    public User update(Integer id, User user) {
        user.setId(id);
        return service.update(user);
    }

    public User update(Integer id, String firstName, String lastName, LocalDate birthDate) {
        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setBirthDate(birthDate);
        return service.update(user);
    }

    public void delete(Integer id) {
        service.delete(id);
    }
}
