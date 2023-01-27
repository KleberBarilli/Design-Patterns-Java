package br.com.kb.store.order.services;

import br.com.kb.store.order.Order;

public interface ActionAfterOrder {
    public void execute(Order order);
}
