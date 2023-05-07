package com.fanta.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Cost {
    private Long costId;
    private Long userId;
    private Long costCategoryId;
    private Long budgetId;
    private Long transactionId;
    private LocalDateTime costDate;
    private BigDecimal costAmount;
    private String costDescription;

    public static class Builder {
        private final Cost cost = new Cost();

        public Builder costId(Long costId) {
            cost.setCostId(costId);
            return this;
        }

        public Builder userId(Long userId) {
            cost.setUserId(userId);
            return this;
        }

        public Builder costCategoryId(Long costCategoryId) {
            cost.setCostCategoryId(costCategoryId);
            return this;
        }

        public Builder budgetId(Long budgetId) {
            cost.setBudgetId(budgetId);
            return this;
        }

        public Builder transactionId(Long transactionId) {
            cost.setTransactionId(transactionId);
            return this;
        }

        public Builder costDate(LocalDateTime costDate) {
            cost.setCostDate(costDate);
            return this;
        }

        public Builder costAmount(BigDecimal costAmount) {
            cost.setCostAmount(costAmount);
            return this;
        }

        public Builder costDescription(String costDescription) {
            cost.setCostDescription(costDescription);
            return this;
        }

        public Cost build() {
            return cost;
        }
    }

    public Long getCostId() {
        return costId;
    }

    public void setCostId(Long costId) {
        this.costId = costId;
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

    public Long getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDateTime getCostDate() {
        return costDate;
    }

    public void setCostDate(LocalDateTime costDate) {
        this.costDate = costDate;
    }

    public BigDecimal getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
    }

    public String getCostDescription() {
        return costDescription;
    }

    public void setCostDescription(String costDescription) {
        this.costDescription = costDescription;
    }
}
