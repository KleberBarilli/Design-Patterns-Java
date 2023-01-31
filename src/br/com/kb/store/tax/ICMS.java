package br.com.kb.store.tax;

import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;

public class ICMS extends Tax {
    public ICMS(Tax other) {
        super(other);
    }

    public BigDecimal makeCalculate(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.1"));
    }
}
