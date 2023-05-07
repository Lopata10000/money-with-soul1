package com.fanta.model;

public class EarningCategory {
    private Long earningCategoryId;
    private String earningCategoryName;

    public static class Builder {
        private final EarningCategory earningCategory = new EarningCategory();

        public Builder earningCategoryId(Long earningCategoryId) {
            earningCategory.setEarningCategoryId(earningCategoryId);
            return this;
        }

        public Builder earningCategoryName(String earningCategoryName) {
            earningCategory.setEarningCategoryName(earningCategoryName);
            return this;
        }

        public EarningCategory build() {
            return earningCategory;
        }
    }

    public Long getEarningCategoryId() {
        return earningCategoryId;
    }

    public void setEarningCategoryId(Long earningCategoryId) {
        this.earningCategoryId = earningCategoryId;
    }

    public String getEarningCategoryName() {
        return earningCategoryName;
    }

    public void setEarningCategoryName(String earningCategoryName) {
        this.earningCategoryName = earningCategoryName;
    }
}