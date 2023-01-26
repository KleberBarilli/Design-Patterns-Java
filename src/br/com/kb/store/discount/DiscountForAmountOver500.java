package br.com.kb.store.discount;

import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;

public class DiscountForAmountOver500 extends Discount {
    public DiscountForAmountOver500(Discount next) {
        super(next);
    }

    public BigDecimal doCalculation(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.7"));
    }

    @Override
    public boolean isShouldApply(Budget budget) {
        return budget.getAmount().compareTo(new BigDecimal("500")) > 0;

    }
}
