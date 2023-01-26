package br.com.kb.store.discount;

import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;

public class DiscountForMoreThan5Items extends Discount {
    public DiscountForMoreThan5Items(Discount next) {
        super(next);

    }

    public BigDecimal doCalculation(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean isShouldApply(Budget budget) {
        return budget.getQuantityItems() > 5;
    }
}
