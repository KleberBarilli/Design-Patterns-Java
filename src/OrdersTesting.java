import java.math.BigDecimal;
import java.util.Arrays;

import br.com.kb.store.order.MakeOrder;
import br.com.kb.store.order.MakeOrderHandler;
import br.com.kb.store.order.services.SaveOrderToDatabase;
import br.com.kb.store.order.services.SendOrderMail;

public class OrdersTesting {
    public static void main(String[] args) {
        String customer = "Kleber";
        BigDecimal amountBudget = new BigDecimal("500");
        int quantityItems = Integer.parseInt("3");

        MakeOrder makeOrder = new MakeOrder(customer, amountBudget, quantityItems);
        MakeOrderHandler handler = new MakeOrderHandler(Arrays.asList(new SaveOrderToDatabase(), new SendOrderMail()));
        handler.execute(makeOrder);
    }
}
