package com.example.sample.cor_pattern.handler;

/**
 * author: sundong
 * created at 2017/4/27 14:32
 */

public class PriceHandlerFactory {

    private static class SingletonHolder {
        private static final PriceHandlerFactory INSTANCE = new PriceHandlerFactory();
    }

    public static PriceHandlerFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public PriceHandler createPriceHandler() {
        Salesman salesman = new Salesman();
        SalesLead salesLead = new SalesLead();
        SalesManager salesManager = new SalesManager();
        SalesDirector salesDirector = new SalesDirector();
        SalesPresident salesPresident = new SalesPresident();
        CEO ceo = new CEO();

        salesman.setSuccessor(salesLead);
        salesLead.setSuccessor(salesManager);
        salesManager.setSuccessor(salesDirector);
        salesDirector.setSuccessor(salesPresident);
        salesPresident.setSuccessor(ceo);
        return salesman;
    }
}
