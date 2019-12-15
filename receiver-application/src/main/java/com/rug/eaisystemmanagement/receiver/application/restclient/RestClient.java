package com.rug.eaisystemmanagement.receiver.application.restclient;

import org.springframework.http.HttpStatus;

public interface RestClient {

    String get(String url);

    <T, K> K post(String url, T postObject, Class<K> responseType);

    HttpStatus getStatus();

}
