package br.com.kb.store.budget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.kb.store.budget.situation.Done;
import br.com.kb.store.budget.situation.Situation;
import br.com.kb.store.budget.situation.UnderReview;

public class Budget implements Budgetable {

    private BigDecimal amount;
    private Situation situation;
    private List<Budgetable> items;

    public Budget(BigDecimal amount, int quantityItems) {
        this.amount = BigDecimal.ZERO;
        this.items = new ArrayList<>();
        this.situation = new UnderReview();
    }

    public BigDecimal calculateExtraDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getQuantityItems() {
        return items.size();
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

    public boolean isDone() {
        return situation instanceof Done;
    }

    public void addItem(Budgetable item) {
        this.amount = amount.add(item.getAmount());
        this.items.add(item);
    }

}
