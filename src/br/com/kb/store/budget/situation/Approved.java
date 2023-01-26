package br.com.kb.store.budget.situation;

import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;

public class Approved extends Situation {
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return new BigDecimal("0.10");
    }

    @Override
    public void done(Budget budget) {
        budget.setSituation(new Done());
    }
}
