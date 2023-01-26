package br.com.kb.store;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal amount;

    public Budget(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

}
