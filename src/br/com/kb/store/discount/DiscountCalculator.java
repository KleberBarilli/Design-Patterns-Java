package br.com.kb.store.discount;

import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        Discount discount = new DiscountForMoreThan5Items(new DiscountForAmountOver500(new WithoutDiscount()));

        return discount.calculate(budget);

    }
}
