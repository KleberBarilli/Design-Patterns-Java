package br.com.kb.store.tax;

import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;

public class ICSS implements Tax {
    public BigDecimal calculate(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.06"));
    }
}
