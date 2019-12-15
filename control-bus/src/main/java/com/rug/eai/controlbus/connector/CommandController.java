package com.rug.eai.controlbus.connector;

import com.rug.eai.controlbus.connector.restclient.behavior.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class CommandController {

    @Autowired
    private RestClient restClient;

    @PostMapping
    public String receiveCommand(@RequestBody String command) {

        return 
    }

}
