package com.fanta.repository;

import com.fanta.model.Transaction;

import java.util.List;
import java.util.Optional;

public class TransactionRepository implements Repository<Transaction> {
    @Override
    public List<Transaction> getAll() {
        return null;
    }
    @Override
    public Optional<Transaction> getById(Long id) {
        return null;
    }

    @Override
    public Transaction save(Transaction transaction) {
        return null;
    }

    @Override
    public void delete(Transaction transaction) {
        // implementation
    }
}
