package com.fanta.entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Table(name = "earning_categories")
public class EarningCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "earning_category_id")
    private Long earningCategoryId;

    @Column(name = "earning_category_name")
    private String earningCategoryName;

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
