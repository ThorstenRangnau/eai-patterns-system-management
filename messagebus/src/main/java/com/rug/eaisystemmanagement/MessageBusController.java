package com.rug.eaisystemmanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MessageBusController {

    @GetMapping
    public String helloGradle() {
        return "Hello Gradle!";
    }

}
