package br.com.kb.store.budget.situation;

import java.math.BigDecimal;

import br.com.kb.store.DomainException;
import br.com.kb.store.budget.Budget;

public abstract class Situation {

    public BigDecimal calculateExtraDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget) {
        throw new DomainException("Budget cannot be approved");
    }

    public void reprove(Budget budget) {
        throw new DomainException("Budget cannot be reproved");
    }

    public void done(Budget budget) {
        throw new DomainException("Budget cannot be done");
    }

}
