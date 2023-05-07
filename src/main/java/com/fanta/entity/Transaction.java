package com.fanta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private Long transactionId;
    private Long userId;
    private String transactionType;
    private LocalDateTime transactionDate;
    private BigDecimal transactionAmount;
    private String description;
    private Long exchangeId;

    public static class Builder {
        private final Transaction transaction = new Transaction();

        public Builder transactionId(Long transactionId) {
            transaction.setTransactionId(transactionId);
            return this;
        }

        public Builder userId(Long userId) {
            transaction.setUserId(userId);
            return this;
        }

        public Builder transactionType(String transactionType) {
            transaction.setTransactionType(transactionType);
            return this;
        }

        public Builder transactionDate(LocalDateTime transactionDate) {
            transaction.setTransactionDate(transactionDate);
            return this;
        }

        public Builder transactionAmount(BigDecimal transactionAmount) {
            transaction.setTransactionAmount(transactionAmount);
            return this;
        }

        public Builder description(String description) {
            transaction.setDescription(description);
            return this;
        }

        public Builder exchangeId(Long exchangeId) {
            transaction.setExchangeId(exchangeId);
            return this;
        }

        public Transaction build() {
            return transaction;
        }
    }

    // Getters and setters

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Long exchangeId) {
        this.exchangeId = exchangeId;
    }
}
