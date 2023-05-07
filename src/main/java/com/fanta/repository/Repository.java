package com.fanta.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    List<T> getAll();
    Optional<T> getById(Long id);
    T save(T entity);
    void delete(T entity);
}
