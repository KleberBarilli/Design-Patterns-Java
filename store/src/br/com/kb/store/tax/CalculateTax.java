package br.com.kb.store.tax;

import java.math.BigDecimal;

import br.com.kb.store.Budget;

public class CalculateTax {
    public BigDecimal calculate(Budget budget, TaxType taxTYpe) {
        switch (taxTYpe) {
            case ICMS:
                return budget.getAmount().multiply(new BigDecimal("0.1"));
            case ICSS:
                return budget.getAmount().multiply(new BigDecimal("0.06"));

            default:
                return BigDecimal.ZERO;
        }
    }
}
