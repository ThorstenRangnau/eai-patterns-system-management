package com.rug.eai.controlbus.connector.restclient.behavior;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClientImpl implements RestClient {

    private RestTemplate rest;
    private HttpHeaders headers;
    private HttpStatus status;

    @Autowired
    public RestClientImpl() {
        this.rest = new RestTemplate();
        this.headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
    }

    @Override
    public String get(String url) {
        Validate.notBlank(url, "url is blank");
        HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
        ResponseEntity<String> responseEntity = rest.exchange(url, HttpMethod.GET, requestEntity, String.class);
        this.setStatus(responseEntity.getStatusCode());
        return responseEntity.getBody();
    }

    @Override
    public <T, K> K post(String url, T postObject, Class<K> responseType) {
        Validate.notBlank(url, "url is blank");
        HttpEntity<T> requestEntity = new HttpEntity<T>(postObject, headers);
        ResponseEntity<K> responseEntity = rest.exchange(url, HttpMethod.POST, requestEntity, responseType);
        this.setStatus(responseEntity.getStatusCode());
        return responseEntity.getBody();
    }

    @Override
    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
