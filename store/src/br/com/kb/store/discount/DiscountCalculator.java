package br.com.kb.store.discount;

import java.math.BigDecimal;

import br.com.kb.store.Budget;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        if (budget.getQuantityItems() > 5) {
            return budget.getAmount().multiply(new BigDecimal("0.1"));
        }
        if (budget.getAmount().compareTo(new BigDecimal("500")) > 0) {
            return budget.getAmount().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
}
