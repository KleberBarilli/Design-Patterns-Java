package br.com.kb.store.order;

import java.time.LocalDateTime;

import br.com.kb.store.budget.Budget;

public class MakeOrderHandler {
    public void execute(MakeOrder data) {
        Budget budget = new Budget(data.getAmountBudget(), data.getQuantityItems());
        String customer = data.getCustomer();
        LocalDateTime date = LocalDateTime.now();

        new Order(customer, date, budget);
    }
}
