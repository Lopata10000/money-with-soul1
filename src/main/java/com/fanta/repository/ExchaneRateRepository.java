package com.fanta.repository;

import com.fanta.model.ExchangeRate;

import java.util.List;
import java.util.Optional;

public class ExchangeRateRepository implements Repository<ExchangeRate> {
    @Override
    public List<ExchangeRate> getAll() {
        return null;
    }


    @Override
    public Optional<ExchangeRate> getById(Long id) {
        return null;
    }

    public ExchangeRate save(ExchangeRate exchangeRate) {
        return null;
    }

    @Override
    public void delete(ExchangeRate exchangeRate) {
        // implementation
    }
}