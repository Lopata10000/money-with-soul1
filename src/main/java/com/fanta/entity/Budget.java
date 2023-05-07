package com.fanta.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Budget {
    private Long budgetId;
    private Long userId;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal amount;

    public Long getBudgetId() {
        return budgetId;
    }

    public static class Builder {
        private final Budget budget = new Budget();

        public Builder budgetId(Long budgetId) {
            budget.setBudgetId(budgetId);
            return this;
        }

        public Builder userId(Long userId) {
            budget.setUserId(userId);
            return this;
        }

        public Builder name(String name) {
            budget.setName(name);
            return this;
        }

        public Builder startDate(LocalDate startDate) {
            budget.setStartDate(startDate);
            return this;
        }

        public Builder endDate(LocalDate endDate) {
            budget.setEndDate(endDate);
            return this;
        }

        public Builder amount(BigDecimal amount) {
            budget.setAmount(amount);
            return this;
        }

        public Budget build() {
            return budget;
        }
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
