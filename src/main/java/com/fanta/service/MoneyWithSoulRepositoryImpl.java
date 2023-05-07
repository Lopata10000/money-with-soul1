package com.fanta.service;

import com.fanta.repository.BudgetRepository;
import com.fanta.repository.CostCategoryRepository;
import com.fanta.repository.CostRepository;
import com.fanta.repository.EarningCategoryRepository;
import com.fanta.repository.EarningRepository;
import com.fanta.repository.ExchangeRateRepository;
import com.fanta.repository.PlanningCostRepository;
import com.fanta.repository.TransactionRepository;

public class MoneyWithSoulRepositoryImpl implements MoneyWithSoulRepositoryInterface {
    private ExchangeRateRepository exchangeRateRepository;
    private TransactionRepository transactionRepository;
    private BudgetRepository budgetRepository;
    private CostCategoryRepository costCategoryRepository;
    private EarningCategoryRepository earningCategoryRepository;
    private CostRepository costRepository;
    private EarningRepository earningRepository;
    private PlanningCostRepository planningCostRepository;


    public MoneyWithSoulRepositoryImpl() {
        exchangeRateRepository = new ExchangeRateRepositoryImpl();
        transactionRepository = new TransactionRepositoryImpl();
        budgetRepository = new BudgetRepositoryImpl();
        costCategoryRepository = new CostCategoryRepositoryImpl();
        earningCategoryRepository = new EarningCategoryRepositoryImpl();
        costRepository = new CostRepositoryImpl();
        earningRepository = new EarningRepositoryImpl();
        planningCostRepository = new PlanningCostRepositoryImpl();
    }

    @Override
    public ExchangeRateRepository getExchangeRateRepository() {
        return exchangeRateRepository;
    }

    @Override
    public TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }

    @Override
    public BudgetRepository getBudgetRepository() {
        return budgetRepository;
    }

    @Override
    public CostCategoryRepository getCostCategoryRepository() {
        return costCategoryRepository;
    }

    @Override
    public EarningCategoryRepository getEarningCategoryRepository() {
        return earningCategoryRepository;
    }

    @Override
    public CostRepository getCostRepository() {
        return costRepository;
    }

    @Override
    public EarningRepository getEarningRepository() {
        return earningRepository;
    }

    @Override
    public PlanningCostRepository getPlanningCostRepository() {
        return planningCostRepository;
    }
}





