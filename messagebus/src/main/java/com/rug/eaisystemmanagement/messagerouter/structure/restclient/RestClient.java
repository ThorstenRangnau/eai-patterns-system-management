package com.rug.eaisystemmanagement.messagerouter.structure.restclient;

import org.springframework.http.HttpStatus;

public interface RestClient {

    String get(String url);

    <T> T post(String url, T postObject, Class<T> responseType);

    HttpStatus getStatus();

}
