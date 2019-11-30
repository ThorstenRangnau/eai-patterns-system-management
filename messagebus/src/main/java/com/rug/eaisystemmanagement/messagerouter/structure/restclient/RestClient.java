package com.rug.eaisystemmanagement.messagerouter.structure.restclient;

import org.springframework.http.HttpStatus;

public interface RestClient {

    String get(String url);

    String post(String url, String json);

    HttpStatus getStatus();

}
