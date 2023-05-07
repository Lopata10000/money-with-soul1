package com.fanta.service;

import com.fanta.model.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionRepositoryInterface {
    Optional<Transaction> findById(Long transactionId);
    List<Transaction> findAll();
    Transaction save(Transaction transaction);
    void delete(Transaction transaction);
}
