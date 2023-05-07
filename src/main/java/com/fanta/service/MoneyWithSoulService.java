package com.fanta.service;

import com.fanta.model.Budget;
import com.fanta.model.Cost;
import com.fanta.model.CostCategory;
import com.fanta.model.Earning;
import com.fanta.model.EarningCategory;
import com.fanta.model.ExchangeRate;
import com.fanta.model.PlanningCost;
import com.fanta.model.Transaction;

import java.util.List;

public class MoneyWithSoulService {
    private MoneyWithSoulRepositoryInterface repository;

    public MoneyWithSoulService() {
        repository = new MoneyWithSoulRepositoryImpl();
    }

    public void addExchangeRate(ExchangeRate exchangeRate) {
        repository.getExchangeRateRepository().add(exchangeRate);
    }

    public ExchangeRate getExchangeRate(int id) {
        return repository.getExchangeRateRepository().getById(id);
    }

    public void updateExchangeRate(ExchangeRate exchangeRate) {
        repository.getExchangeRateRepository().update(exchangeRate);
    }

    public void deleteExchangeRate(ExchangeRate exchangeRate) {
        repository.getExchangeRateRepository().delete(exchangeRate);
    }

    public void addTransaction(Transaction transaction) {
        repository.getTransactionRepository().add(transaction);
    }

    public Transaction getTransaction(int id) {
        return repository.getTransactionRepository().getById(id);
    }

    public void updateTransaction(Transaction transaction) {
        repository.getTransactionRepository().update(transaction);
    }

    public void deleteTransaction(Transaction transaction) {
        repository.getTransactionRepository().delete(transaction);
    }

    public void addBudget(Budget budget) {
        repository.getBudgetRepository().add(budget);
    }

    public Budget getBudget(int id) {
        return repository.getBudgetRepository().getById(id);
    }

    public void updateBudget(Budget budget) {
        repository.getBudgetRepository().update(budget);
    }

    public void deleteBudget(Budget budget) {
        repository.getBudgetRepository().delete(budget);
    }

    public void addCostCategory(CostCategory costCategory) {
        repository.getCostCategoryRepository().add(costCategory);
    }

    public CostCategory getCostCategory(int id) {
        return repository.getCostCategoryRepository().getById(id);
    }

    public void updateCostCategory(CostCategory costCategory) {
        repository.getCostCategoryRepository().update(costCategory);
    }

    public void deleteCostCategory(CostCategory costCategory) {
        repository.getCostCategoryRepository().delete(costCategory);
    }

    public void addEarningCategory(EarningCategory earningCategory) {
        repository.getEarningCategoryRepository().add(earningCategory);
    }

    public EarningCategory getEarningCategory(int id) {
        return repository.getEarningCategoryRepository().getById(id);
    }

    public void updateEarningCategory(EarningCategory earningCategory) {
        repository.getEarningCategoryRepository().update(earningCategory);
    }

    public void deleteEarningCategory(EarningCategory earningCategory) {
        repository.getEarningCategoryRepository().delete(earningCategory);
    }

    public void addCost(Cost cost) {
        repository.getCostRepository().add(cost);
    }

    public Cost getCost(int id) {
        return repository.getCostRepository().getById(id);
    }

    public void updateCost(Cost cost) {
        repository.getCostRepository().update(cost);
    }

    public void deleteCost(Cost cost) {
        repository.getCostRepository().delete(cost);
    }

    public void addEarning(Earning earning) {
        repository.getEarningRepository().add(earning);
    }

    public Earning getEarning(int id) {
        return repository.getEarningRepository().getById(id);
    }

    public void updateEarning(Earning earning) {
        repository.getEarningRepository().update(earning);
    }

    public void deleteEarning(Earning earning) {
        repository.getEarningRepository().delete(earning);
    }

    public void addPlanningCost(PlanningCost planningCost) {
        repository.getPlanningCostRepository().add(planningCost);
    }

    public PlanningCost getPlanningCost(int id) {
        return repository.getPlanningCostRepository().getById(id);
    }

    public void updatePlanningCost(PlanningCost planningCost) {
        repository.getPlanningCostRepository().update(planningCost);
    }

    public void deletePlanningCost(PlanningCost planningCost) {
        repository.getPlanningCostRepository().delete(planningCost);
    }

    public List<ExchangeRate> getAllExchangeRates() {
        return repository.getExchangeRateRepository().getAll();
    }

    public List<Transaction> getAllTransactions() {
        return repository.getTransactionRepository().getAll();
    }

    public List<Budget> getAllBudgets() {
        return repository.getBudgetRepository().getAll();
    }

    public List<CostCategory> getAllCostCategories() {
        return repository.getCostCategoryRepository().getAll();
    }

    public List<EarningCategory> getAllEarningCategories() {
        return repository.getEarningCategoryRepository().getAll();
    }

    public List<Cost> getAllCosts() {
        return repository.getCostRepository().getAll();
    }

    public List<Earning> getAllEarnings() {
        return repository.getEarningRepository().getAll();
    }

    public List<PlanningCost> getAllPlanningCosts() {
        return repository.getPlanningCostRepository().getAll();
    }

}