package com.fanta.service;

import com.fanta.model.EarningCategory;

import java.util.List;
import java.util.Optional;

public interface EarningCategoryRepositoryInterface {
    Optional<EarningCategory> findById(Long earningCategoryId);
    List<EarningCategory> findAll();
    EarningCategory save(EarningCategory earningCategory);
    void delete(EarningCategory earningCategory);
}
