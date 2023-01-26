package br.com.kb.store.discount;

import java.math.BigDecimal;

import br.com.kb.store.Budget;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public abstract BigDecimal calculate(Budget budget);

}
