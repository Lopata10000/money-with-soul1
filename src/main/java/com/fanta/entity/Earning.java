package com.fanta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Earning {
    private Long earningId;
    private Long userId;
    private Long earningCategoryId;
    private LocalDateTime earningDate;
    private BigDecimal earningAmount;
    private Long transactionId;
    private Long budgetId;

    public static class Builder {
        private final Earning earning = new Earning();

        public Builder earningId(Long earningId) {
            earning.setEarningId(earningId);
            return this;
        }

        public Builder userId(Long userId) {
            earning.setUserId(userId);
            return this;
        }

        public Builder earningCategoryId(Long earningCategoryId) {
            earning.setEarningCategoryId(earningCategoryId);
            return this;
        }

        public Builder earningDate(LocalDateTime earningDate) {
            earning.setEarningDate(earningDate);
            return this;
        }

        public Builder earningAmount(BigDecimal earningAmount) {
            earning.setEarningAmount(earningAmount);
            return this;
        }

        public Builder transactionId(Long transactionId) {
            earning.setTransactionId(transactionId);
            return this;
        }

        public Builder budgetId(Long budgetId) {
            earning.setBudgetId(budgetId);
            return this;
        }

        public Earning build() {
            return earning;
        }
    }

    public Long getEarningId() {
        return earningId;
    }

    public void setEarningId(Long earningId) {
        this.earningId = earningId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getEarningCategoryId() {
        return earningCategoryId;
    }

    public void setEarningCategoryId(Long earningCategoryId) {
        this.earningCategoryId = earningCategoryId;
    }

    public LocalDateTime getEarningDate() {
        return earningDate;
    }

    public void setEarningDate(LocalDateTime earningDate) {
        this.earningDate = earningDate;
    }

    public BigDecimal getEarningAmount() {
        return earningAmount;
    }

    public void setEarningAmount(BigDecimal earningAmount) {
        this.earningAmount = earningAmount;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }
}
// Getters and setters
