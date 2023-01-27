package br.com.kb.store.http;

import java.util.Map;

public interface HttpAdapter {
    public void post(String url, Map<String, Object> data);
}
