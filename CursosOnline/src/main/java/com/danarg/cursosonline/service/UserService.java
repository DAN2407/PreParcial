package com.danarg.cursosonline.service;

import com.danarg.cursosonline.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    User createUser(User user);
    User getUserById(UUID id);
    List<User> getAllUsers();
    User updateUser(UUID id, User userDetails);
    void deleteUser(UUID id);
}
