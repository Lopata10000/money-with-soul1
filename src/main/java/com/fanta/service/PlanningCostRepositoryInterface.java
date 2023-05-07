package com.fanta.service;

import com.fanta.model.PlanningCost;

import java.util.List;
import java.util.Optional;

public interface PlanningCostRepositoryInterface {
    Optional<PlanningCost> findById(Long planningCostId);
    List<PlanningCost> findAll();
    PlanningCost save(PlanningCost planningCost);
    void delete(PlanningCost planningCost);
}
