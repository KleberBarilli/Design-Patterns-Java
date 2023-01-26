import java.math.BigDecimal;

import br.com.kb.store.Budget;
import br.com.kb.store.tax.CalculateTax;
import br.com.kb.store.tax.TaxType;

public class App {
    public static void main(String[] args) throws Exception {
        Budget budget = new Budget(new BigDecimal("100"));
        CalculateTax calculateTax = new CalculateTax();
        System.out.println(calculateTax.calculate(budget, TaxType.ICSS));
    }
}
