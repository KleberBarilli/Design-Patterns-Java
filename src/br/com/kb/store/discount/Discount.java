package br.com.kb.store.discount;

import java.math.BigDecimal;

import br.com.kb.store.Budget;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget) {
        if (isShouldApply(budget)) {
            return doCalculation(budget);
        } else {
            return next.calculate(budget);
        }
    }

    protected abstract BigDecimal doCalculation(Budget budget);

    protected abstract boolean isShouldApply(Budget budget);

}
