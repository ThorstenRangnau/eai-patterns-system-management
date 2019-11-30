package com.rug.eaisystemmanagement.receiver.application;

import com.rug.eaisystemmanagement.receiver.application.restclient.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class App {

    private static final String MESSAGE_BUS_ADDRESS = "http://localhost:9090/registration";

    @Autowired
    private RestClient restClient;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void registerAtMessageBusAfterStartup() {
//        System.getenv("RECEIVER_URL");
        System.out.println("INFO - attempt to register ReceiverApplication to message bus");
        RegisteredApplication registeredApplication =
            new RegisteredApplication("ReceiverApplication", "localhost:8080/messages");
        registeredApplication = restClient.post(MESSAGE_BUS_ADDRESS, registeredApplication, RegisteredApplication.class);
        System.out.println("INFO - register Application and running under id " + registeredApplication.getId());
    }

}
