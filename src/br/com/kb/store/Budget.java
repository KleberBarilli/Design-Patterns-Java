package br.com.kb.store;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal amount;
    private int quantityItems;
    private String situation;

    public Budget(BigDecimal amount, int quantityItems) {
        this.amount = amount;
        this.quantityItems = quantityItems;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getQuantityItems() {
        return quantityItems;
    }

    public void makeExtraDiscount() {
        BigDecimal extraAmount = BigDecimal.ZERO;
        if (situation.equals("UNDER_REVIEW")) {
            extraAmount = new BigDecimal("0.05");
        } else if (situation.equals("APPROVED")) {
            extraAmount = new BigDecimal("0.02");
        }
        this.amount = this.amount.subtract(extraAmount);
    }

    public void approve() {
        this.situation = "APPROVED";
    }

}
