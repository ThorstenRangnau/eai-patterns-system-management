package com.rug.eaisystemmanagement.connector.provided;


import com.rug.eaisystemmanagement.domainmodel.ContentMessage;
import com.rug.eaisystemmanagement.messageprocessor.behavior.MessageProcessingService;
import com.rug.eaisystemmanagement.messageprocessor.behavior.MessageProcessingServiceImpl;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MessageController exposes the MessageAPI
 */
@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageProcessingService messageProcessingService;

    @PostMapping
    public ArrivalConfirmation publish(@RequestBody ContentMessage message) {
        Validate.notNull(message, "message is null");
        message = messageProcessingService.processContentMessage(message);
        return new ArrivalConfirmation(message.isSend() ? message.getMessageId() : -1);
    }
}
