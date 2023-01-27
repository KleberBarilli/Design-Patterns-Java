package br.com.kb.store.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            URL apiUrl = new URL(url);
            URLConnection conn = apiUrl.openConnection();
            conn.connect();
        } catch (Exception e) {
            throw new RuntimeException("Error to sent a http request", e);
        }

    }

}
