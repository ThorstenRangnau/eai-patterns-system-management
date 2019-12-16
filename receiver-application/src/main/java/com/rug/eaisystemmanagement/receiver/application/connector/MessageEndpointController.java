package com.rug.eaisystemmanagement.receiver.application.connector;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageEndpointController {

    @PostMapping
    public Message receiveMessage(@RequestBody Message message) {
        System.out.println("INFO - inside receiveMessage method");
        Validate.notNull(message, "message is null");
        Header header = message.getHeader();
        Body body = message.getBody();
        System.out.println("INFO - Receive Message -> " + header.getId() + " with content:  \n"
            + body.getContent());
        if (message.hasHistory()) {
            System.out.println("DEBUG - SYSTEM RUNS IN DEBUG MODE!");
            for (int i = 0; i < message.getHistory().size(); i++) {
                String repeated = StringUtils.repeat(" ", (i+1)*4);
                System.out.println(repeated + "--> " + message.getHistory().get(i));
            }
        }
        message.setSuccess(true);
        return message;
    }
}
