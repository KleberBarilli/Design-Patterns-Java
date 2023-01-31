package br.com.kb.store.budget;

import java.math.BigDecimal;

public class BudgetItem implements Budgetable {
    private BigDecimal amomut;

    public BudgetItem(BigDecimal amomut) {
        this.amomut = amomut;
    }

    public BigDecimal getAmount() {
        return amomut;
    }
}
