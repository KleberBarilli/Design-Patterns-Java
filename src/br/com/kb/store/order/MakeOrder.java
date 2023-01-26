package br.com.kb.store.order;

import java.math.BigDecimal;

public class MakeOrder {

    private String customer;
    private BigDecimal amountBudget;
    private int quantityItems;

    public MakeOrder(String customer, BigDecimal amountBudget, int quantityItems) {
        this.customer = customer;
        this.amountBudget = amountBudget;
        this.quantityItems = quantityItems;
    }

    public String getCustomer() {
        return customer;
    }

    public BigDecimal getAmountBudget() {
        return amountBudget;
    }

    public int getQuantityItems() {
        return quantityItems;
    }

}
