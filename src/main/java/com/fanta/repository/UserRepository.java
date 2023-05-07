package com.fanta.repository;

import com.fanta.model.User;

import java.util.List;
import java.util.Optional;

public class UserRepository implements Repository<User>{
    @Override
    public List<User> getAll() {
        return null;
    }


    @Override
    public Optional<User> getById(Long id) {
        // implementation
        return null;
    }

    @Override
    public User save(User user) {
        // implementation
        return null;
    }

    @Override
    public void delete(User user) {
        // implementation
    }
}

