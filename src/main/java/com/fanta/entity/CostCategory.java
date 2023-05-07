package com.fanta.entity;

public class CostCategory {
    private Long costCategoryId;
    private String costCategoryName;

    public static class Builder {
        private final CostCategory costCategory = new CostCategory();

        public Builder costCategoryId(Long costCategoryId) {
            costCategory.setCostCategoryId(costCategoryId);
            return this;
        }

        public Builder costCategoryName(String costCategoryName) {
            costCategory.setCostCategoryName(costCategoryName);
            return this;
        }

        public CostCategory build() {
            return costCategory;
        }
    }

    public Long getCostCategoryId() {
        return costCategoryId;
    }

    public void setCostCategoryId(Long costCategoryId) {
        this.costCategoryId = costCategoryId;
    }

    public String getCostCategoryName() {
        return costCategoryName;
    }

    public void setCostCategoryName(String costCategoryName) {
        this.costCategoryName = costCategoryName;
    }
}
