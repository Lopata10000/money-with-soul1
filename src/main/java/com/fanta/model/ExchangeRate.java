package com.fanta.model;

import java.math.BigDecimal;

public class ExchangeRate {
        private Long exchangeId;
        private String nameCurrency;
        private BigDecimal rate;

        public static class Builder {
            private final ExchangeRate exchangeRate = new ExchangeRate();

            public Builder exchangeId(Long exchangeId) {
                exchangeRate.setExchangeId(exchangeId);
                return this;
            }

            public Builder nameCurrency(String nameCurrency) {
                exchangeRate.setNameCurrency(nameCurrency);
                return this;
            }

            public Builder rate(BigDecimal rate) {
                exchangeRate.setRate(rate);
                return this;
            }

            public ExchangeRate build() {
                return exchangeRate;
            }
        }

        public Long getExchangeId() {
            return exchangeId;
        }

        public void setExchangeId(Long exchangeId) {
            this.exchangeId = exchangeId;
        }

        public String getNameCurrency() {
            return nameCurrency;
        }

        public void setNameCurrency(String nameCurrency) {
            this.nameCurrency = nameCurrency;
        }

        public BigDecimal getRate() {
            return rate;
        }

        public void setRate(BigDecimal rate) {
            this.rate = rate;
        }
        // Getters and setters
    }
