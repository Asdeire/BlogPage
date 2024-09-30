package com.asdeire.blog.service;

import com.asdeire.blog.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();
    private Long currentId = 1L;

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public User saveUser(User user) {
        if (user.getId() == null) {
            user.setId(currentId++);
            users.add(user); // Add new user
        } else {
            int index = users.indexOf(getUserById(user.getId()));
            if (index != -1) {
                users.set(index, user); // Update existing user
            }
        }
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id)); // Delete user by ID
    }
}
