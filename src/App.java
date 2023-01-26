import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;
import br.com.kb.store.discount.DiscountCalculator;
import br.com.kb.store.tax.ICMS;
import br.com.kb.store.tax.ICSS;
import br.com.kb.store.tax.TaxCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculate(budget, new ICSS()));
        System.out.println(taxCalculator.calculate(budget, new ICMS()));

        Budget budgetDiscount = new Budget(new BigDecimal("500"), 6);
        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.calculate(budgetDiscount));
    }
}
