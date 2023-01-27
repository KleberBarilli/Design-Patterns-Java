package br.com.kb.store.order;

import java.time.LocalDateTime;
import java.util.List;

import br.com.kb.store.budget.Budget;
import br.com.kb.store.order.services.ActionAfterOrder;

public class MakeOrderHandler {

    private List<ActionAfterOrder> actions;

    public MakeOrderHandler(List<ActionAfterOrder> actions) {
        this.actions = actions;
    }

    public void execute(MakeOrder data) {
        Budget budget = new Budget(data.getAmountBudget(), data.getQuantityItems());

        Order order = new Order(data.getCustomer(), LocalDateTime.now(), budget);

        actions.forEach(a -> a.execute(order));

    }
}
