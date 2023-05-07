package com.fanta.service;

import com.fanta.model.User;

import java.util.Optional;

public interface UserRepositoryInterface {
    Optional<User> findById(Long userId);
    Optional<User> findByEmail(String email);
    User save(User user);
    void delete(User user);
}
