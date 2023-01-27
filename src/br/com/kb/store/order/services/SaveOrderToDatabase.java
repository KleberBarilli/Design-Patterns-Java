package br.com.kb.store.order.services;

import br.com.kb.store.order.Order;

public class SaveOrderToDatabase implements ActionAfterOrder {
    public void execute(Order order) {
        System.out.println("Save an database");
    }
}
