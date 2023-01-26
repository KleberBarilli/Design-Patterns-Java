package br.com.kb.store.tax;

import java.math.BigDecimal;

import br.com.kb.store.Budget;

public class TaxCalculator {
    public BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }
}
