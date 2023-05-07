package com.fanta.service;

import com.fanta.model.Budget;

import java.util.List;
import java.util.Optional;

public interface BudgetRepositoryInterface {
    Optional<Budget> findById(Long budgetId);
    List<Budget> findAll();
    Budget save(Budget budget);
    void delete(Budget budget);
}
