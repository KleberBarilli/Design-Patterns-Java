package br.com.kb.store.tax;

import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;

public class ICSS extends Tax {

    public ICSS(Tax other) {
        super(other);
    }

    public BigDecimal makeCalculate(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.06"));
    }
}
