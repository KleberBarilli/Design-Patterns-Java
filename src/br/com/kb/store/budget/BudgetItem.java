package br.com.kb.store.budget;

import java.math.BigDecimal;

public class BudgetItem implements Budgetable {
    private BigDecimal amount;

    public BudgetItem(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
