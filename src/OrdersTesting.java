import java.math.BigDecimal;

import br.com.kb.store.order.MakeOrder;
import br.com.kb.store.order.MakeOrderHandler;

public class OrdersTesting {
    public static void main(String[] args) {
        String customer = args[0];
        BigDecimal amountBudget = new BigDecimal(args[1]);
        int quantityItems = Integer.parseInt(args[2]);

        MakeOrder makeOrder = new MakeOrder(customer, amountBudget, quantityItems);
        MakeOrderHandler handler = new MakeOrderHandler();
        handler.execute(makeOrder);
    }
}
