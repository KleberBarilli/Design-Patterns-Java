package br.com.kb.store.order.services;

import br.com.kb.store.order.Order;

public class OrderLog implements ActionAfterOrder {

    @Override
    public void execute(Order order) {
        System.out.println("Sent order");

    }

}
