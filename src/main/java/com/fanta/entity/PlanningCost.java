package com.fanta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PlanningCost {
    private Long planningCostId;
    private Long userId;
    private Long costCategoryId;
    private LocalDateTime planningCostDate;
    private Long budgetId;
    private BigDecimal plannedAmount;

    public static class Builder {
        private final PlanningCost planningCost = new PlanningCost();

        public Builder planningCostId(Long planningCostId) {
            planningCost.setPlanningCostId(planningCostId);
            return this;
        }

        public Builder userId(Long userId) {
            planningCost.setUserId(userId);
            return this;
        }

        public Builder costCategoryId(Long costCategoryId) {
            planningCost.setCostCategoryId(costCategoryId);
            return this;
        }

        public Builder planningCostDate(LocalDateTime planningCostDate) {
            planningCost.setPlanningCostDate(planningCostDate);
            return this;
        }

        public Builder budgetId(Long budgetId) {
            planningCost.setBudgetId(budgetId);
            return this;
        }

        public Builder plannedAmount(BigDecimal plannedAmount) {
            planningCost.setPlannedAmount(plannedAmount);
            return this;
        }

        public PlanningCost build() {
            return planningCost;
        }
    }

    public Long getPlanningCostId() {
        return planningCostId;
    }

    public void setPlanningCostId(Long planningCostId) {
        this.planningCostId = planningCostId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCostCategoryId() {
        return costCategoryId;
    }

    public void setCostCategoryId(Long costCategoryId) {
        this.costCategoryId = costCategoryId;
    }

    public LocalDateTime getPlanningCostDate() {
        return planningCostDate;
    }

    public void setPlanningCostDate(LocalDateTime planningCostDate) {
        this.planningCostDate = planningCostDate;
    }

    public Long getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }

    public BigDecimal getPlannedAmount() {
        return plannedAmount;
    }

    public void setPlannedAmount(BigDecimal plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    // Getters and setters
}
