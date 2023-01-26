package br.com.kb.store.budget.situation;

import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;

public class UnderReview extends Situation {
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return new BigDecimal("0.05");
    }

    @Override
    public void approve(Budget budget) {
        budget.setSituation(new Approved());
    }

    @Override
    public void reprove(Budget budget) {
        budget.setSituation(new Reproved());
    }

}
