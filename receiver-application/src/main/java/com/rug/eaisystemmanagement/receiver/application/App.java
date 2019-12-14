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
    private static final String CONTROL_BUS_ADDRESS = "http://localhost:6060/registration";
    private static final String MY_OWN_ADDRESS = "http://localhost:8080/messages";
    public static final String RECEIVER_APPLICATION = "ReceiverApplication";

    @Autowired
    private RestClient restClient;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void registerAtAllServicesAfterStartup() {
        registerAt(MESSAGE_BUS_ADDRESS, "message bus");
        registerAt(CONTROL_BUS_ADDRESS, "control bus");
    }

    private void registerAt(String address, String bus) {
        System.out.println("INFO - attempt to register ReceiverApplication to " + bus);
        RegisteredApplication registeredApplication =
            new RegisteredApplication(RECEIVER_APPLICATION, MY_OWN_ADDRESS);
        registeredApplication = restClient.post(address, registeredApplication, RegisteredApplication.class);
        System.out.println("INFO - register Application and running under id " + registeredApplication.getId());
    }

}
