package br.com.kb.store.tax;

import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;

public interface Tax {
    BigDecimal calculate(Budget budget);
}
