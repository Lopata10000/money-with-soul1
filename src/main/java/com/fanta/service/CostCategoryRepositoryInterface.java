package com.fanta.service;

import com.fanta.model.CostCategory;

import java.util.List;
import java.util.Optional;

public interface CostCategoryRepositoryInterface {
    Optional<CostCategory> findById(Long costCategoryId);
    List<CostCategory> findAll();
    CostCategory save(CostCategory costCategory);
    void delete(CostCategory costCategory);
}