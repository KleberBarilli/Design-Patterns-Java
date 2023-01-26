package br.com.kb.store.tax;

import java.math.BigDecimal;

import br.com.kb.store.Budget;

public interface Tax {
    BigDecimal calculate(Budget budget);
}
