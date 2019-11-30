package com.rug.eaisystemmanagement.receiver.application.connector;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageEndpointController {

    @PostMapping
    public MessageRequest receiveMessage(Message message) {
        Header header = message.getHeader();
        Body body = message.getBody();
        System.out.println("INFO - Receive Message -> " + header.getId() + " with content:  \n"
            + body.getContent());
        return new MessageRequest(true, header.getId());
    }
}
