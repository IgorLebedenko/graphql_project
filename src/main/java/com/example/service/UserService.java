package com.example.service;

import com.example.criteria.UserCriteria;
import com.example.domain.User;
import com.example.entity.UserEntity;
import com.example.repository.UserRepository;
import com.example.specification.UserSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.ws.rs.NotFoundException;
import java.util.Collections;
import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public Page<User> findAll(UserCriteria criteria) {
        if (criteria.getSortedBy() != null) {
            Sort.Order order = new Sort.Order(Objects.requireNonNullElse(criteria.getSortDirection(), Sort.DEFAULT_DIRECTION) , criteria.getSortedBy());
            criteria.setOrders(Collections.singletonList(order));
        }
        final Page<UserEntity> users = repository.findAll(new UserSpecification(criteria), criteria);
        return users.map(this::model);
    }

    public User findOne(Integer id) {
        UserEntity entity = repository.findById(id).orElseThrow(NotFoundException::new);
        return model(entity);
    }

    public User create(User user) {
        UserEntity newUser = new UserEntity();
        entity(newUser, user);
        user.setId(repository.save(newUser).getId());
        return user;
    }

    public User update(User user) {
        UserEntity oldUser = repository.findById(user.getId()).orElseThrow(NotFoundException::new);
        entity(oldUser, user);
        return user;
    }

    public void delete(Integer id) {
        UserEntity user = repository.findById(id).orElseThrow(NotFoundException::new);
        repository.delete(user);
    }

    private void entity(UserEntity entity, User user) {
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());
        entity.setSalary(user.getSalary());
        entity.setBirthDate(user.getBirthDate());
    }

    private User model(UserEntity entity) {
        User user = new User();
        user.setId(entity.getId());
        user.setFirstName(entity.getFirstName());
        user.setLastName(entity.getLastName());
        user.setSalary(entity.getSalary());
        user.setBirthDate(entity.getBirthDate());
        return user;
    }
}
