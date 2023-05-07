package com.fanta.service;

import com.fanta.model.ExchangeRate;

import java.util.List;
import java.util.Optional;

public interface ExchangeRateRepositoryInterface {
    Optional<ExchangeRate> findById(Long exchangeId);
    List<ExchangeRate> findAll();
    ExchangeRate save(ExchangeRate exchangeRate);
    void delete(ExchangeRate exchangeRate);
}
