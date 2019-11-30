package com.rug.eaisystemmanagement.receiver.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ReceiverApplicationController {

    @GetMapping
    public String helloGradle() {
        return "Hello Gradle!";
    }

}