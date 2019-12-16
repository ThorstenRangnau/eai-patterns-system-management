package com.rug.eaisystemmanagement.connector.provided;

import com.rug.eaisystemmanagement.messageprocessor.behavior.MessageProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/command")
public class CommandController {

    private static final String MESSAGE_HISTORY = "MessageHistory";
    @Autowired
    private MessageProcessingService messageProcessingService;

    @PostMapping
    public String receiveCommand(@RequestBody String command) {
        if (command.contains(MESSAGE_HISTORY)) {
            messageProcessingService.toggleMessageHistory();
        }
        return "OK";
    }


}
