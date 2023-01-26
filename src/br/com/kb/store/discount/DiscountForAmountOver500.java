package br.com.kb.store.discount;

import java.math.BigDecimal;

import br.com.kb.store.Budget;

public class DiscountForAmountOver500 extends Discount {
    public DiscountForAmountOver500(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget) {

        if (budget.getAmount().compareTo(new BigDecimal("500")) > 0) {
            return budget.getAmount().multiply(new BigDecimal("0.7"));
        }

        return next.calculate(budget);
    }
}
