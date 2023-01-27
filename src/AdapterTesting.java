import java.math.BigDecimal;

import br.com.kb.store.budget.Budget;
import br.com.kb.store.budget.Register;
import br.com.kb.store.http.JavaHttpClient;

public class AdapterTesting {
    public static void main(String[] args) {
        Budget budget = new Budget(BigDecimal.TEN, 1);
        budget.approve();
        budget.done();

        Register register = new Register(new JavaHttpClient());
        register.register(budget);
    }
}
