package br.com.kb.store.order;

import java.time.LocalDateTime;

import br.com.kb.store.budget.Budget;

public class Order {

    private String customer;
    private LocalDateTime date;
    private Budget budget;

    public Order(String customer, LocalDateTime date, Budget budget) {
        this.customer = customer;
        this.date = date;
        this.budget = budget;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

}
