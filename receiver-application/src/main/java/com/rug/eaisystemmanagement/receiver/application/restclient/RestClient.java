package com.rug.eaisystemmanagement.receiver.application.restclient;

import org.springframework.http.HttpStatus;

public interface RestClient {

    String get(String url);

    <T> T post(String url, T postObject, Class<T> responseType);

    HttpStatus getStatus();

}
