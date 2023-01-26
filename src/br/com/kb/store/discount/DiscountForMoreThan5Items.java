package br.com.kb.store.discount;

import java.math.BigDecimal;

import br.com.kb.store.Budget;

public class DiscountForMoreThan5Items extends Discount {
    public DiscountForMoreThan5Items(Discount next) {
        super(next);

    }

    public BigDecimal calculate(Budget budget) {
        if (budget.getQuantityItems() > 5) {
            return budget.getAmount().multiply(new BigDecimal("0.1"));
        }

        return next.calculate(budget);
    }
}
