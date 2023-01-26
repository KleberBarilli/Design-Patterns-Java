package br.com.kb.store;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal amount;
    private int quantityItems;

    public Budget(BigDecimal amount, int quantityItems) {
        this.amount = amount;
        this.quantityItems = quantityItems;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getQuantityItems() {
        return quantityItems;
    }

}
