package br.com.kb.store.budget;

import java.math.BigDecimal;

public class BudgetProxy extends Budget {
    public BudgetProxy(BigDecimal amount, int quantityItems) {
        super(amount, quantityItems);
    }

    private BigDecimal amount;
    private Budget budget;

    @Override
    public BigDecimal getAmount() {
        if (amount == null) {
            this.amount = budget.getAmount();
        }
        return this.amount;
    }
}
