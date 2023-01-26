package br.com.kb.store.tax;

import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;

public class ICMS implements Tax {
    public BigDecimal calculate(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.1"));
    }
}
