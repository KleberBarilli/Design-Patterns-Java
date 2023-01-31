package br.com.kb.store.tax;

import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;

public abstract class Tax {

    private Tax other;

    public Tax(Tax other) {
        this.other = other;
    }

    protected abstract BigDecimal makeCalculate(Budget budget);

    public BigDecimal calculate(Budget budget) {
        BigDecimal taxAmount = makeCalculate(budget);
        BigDecimal otherAmountTax = BigDecimal.ZERO;
        if (other != null) {
            otherAmountTax = other.makeCalculate(budget);
        }

        return taxAmount.add(otherAmountTax);

    }
}
