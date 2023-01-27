package br.com.kb.store.budget;

import java.util.Map;

import br.com.kb.store.DomainException;
import br.com.kb.store.http.HttpAdapter;

public class Register {

    private HttpAdapter http;

    public Register(HttpAdapter http) {
        this.http = http;
    }

    public void register(Budget budget) {

        if (!budget.isDone()) {
            throw new DomainException("Budget needs to be done");
        }

        String url = "http://localhost:3331";
        Map<String, Object> data = Map.of("amount", budget.getAmount(), "quantityItems", budget.getQuantityItems());

        http.post(url, data);
    }
}
