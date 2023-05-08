package com.fanta.entity;

import java.math.BigDecimal;
import java.security.Timestamp;

import javax.persistence.JoinColumn;
import javax.persistence.Table;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "planning_costs")
public class PlanningCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "planning_cost_id")
    private Long planningCostId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_category_id")
    private CostCategory costCategory;

    @Column(name = "planning_cost_date")
    private Timestamp planningCostDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "budget_id")
    private Budget budget;

    @Column(name = "planned_amount")
    private BigDecimal plannedAmount;

    // getters and setters

    public Long getPlanningCostId() {
        return planningCostId;
    }

    public void setPlanningCostId(Long planningCostId) {
        this.planningCostId = planningCostId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CostCategory getCostCategory() {
        return costCategory;
    }

    public void setCostCategory(CostCategory costCategory) {
        this.costCategory = costCategory;
    }

    public Timestamp getPlanningCostDate() {
        return planningCostDate;
    }

    public void setPlanningCostDate(Timestamp planningCostDate) {
        this.planningCostDate = planningCostDate;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public BigDecimal getPlannedAmount() {
        return plannedAmount;
    }

    public void setPlannedAmount(BigDecimal plannedAmount) {
        this.plannedAmount = plannedAmount;
    }
}

