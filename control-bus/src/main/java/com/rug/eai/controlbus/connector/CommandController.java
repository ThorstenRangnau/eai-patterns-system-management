package com.rug.eai.controlbus.connector;

import com.rug.eai.controlbus.connector.restclient.behavior.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/command")
public class CommandController {

    @Autowired
    private RestClient restClient;
    private static final String MESSAGE_BUS_ADDRESS = "http://localhost:9090/command";

    @PostMapping
    public String receiveCommand(@RequestBody String command) {
        return restClient.post(MESSAGE_BUS_ADDRESS, command, String.class);
    }

}
