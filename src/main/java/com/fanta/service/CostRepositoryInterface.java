package com.fanta.service;

import com.fanta.model.Cost;

import java.util.List;
import java.util.Optional;

public interface CostRepositoryInterface {
    Optional<Cost> findById(Long costId);
    List<Cost> findAll();
    Cost save(Cost cost);
    void delete(Cost cost);
}
