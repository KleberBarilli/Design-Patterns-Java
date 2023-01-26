package br.com.kb.store.budget;

import java.math.BigDecimal;

import br.com.kb.store.budget.situation.Situation;
import br.com.kb.store.budget.situation.UnderReview;

public class Budget {

    private BigDecimal amount;
    private int quantityItems;
    private Situation situation;

    public Budget(BigDecimal amount, int quantityItems) {
        this.amount = amount;
        this.quantityItems = quantityItems;
        this.situation = new UnderReview();
    }

    public BigDecimal calculateExtraDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getQuantityItems() {
        return quantityItems;
    }

    public void makeExtraDiscount() {
        BigDecimal extraAmount = this.situation.calculateExtraDiscount(this);

        this.amount = this.amount.subtract(extraAmount);
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }

    public void approve() {
        this.situation.approve(this);
    }

    public void reprove() {
        this.situation.reprove(this);
    }

    public void done() {
        this.situation.done(this);
    }

}
