package com.fanta.repository;

import com.fanta.model.Budget;

import java.util.List;
import java.util.Optional;

public class BudgetRepository implements Repository<Budget> {
    @Override
    public List<Budget> getAll() {
        return null;
    }

    @Override
    public Optional<Budget> getById(Long id) {
        return null;
    }

    @Override
    public Budget save(Budget budget) {
        return null;
    }

    @Override
    public void delete(Budget budget) {
        // implementation
    }
}