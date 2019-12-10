package com.rug.eaisystemmanagement.senderapplication.connector.restclient.behavior;

import org.springframework.http.HttpStatus;

public interface RestClient {

    String get(String url);

    <T, K> K post(String url, T postObject, Class<K> responseType);

    HttpStatus getStatus();

}
