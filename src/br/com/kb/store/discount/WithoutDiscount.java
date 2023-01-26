package br.com.kb.store.discount;

import java.math.BigDecimal;

import br.com.kb.store.Budget;

public class WithoutDiscount extends Discount {

    public WithoutDiscount() {
        super(null);

    }

    public BigDecimal calculate(Budget budget) {

        return BigDecimal.ZERO;
    }

    @Override
    public boolean isShouldApply(Budget budget) {
        return true;
    }

    @Override
    protected BigDecimal doCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }

}
