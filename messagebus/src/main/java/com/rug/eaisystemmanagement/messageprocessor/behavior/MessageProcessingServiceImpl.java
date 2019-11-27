package com.rug.eaisystemmanagement.messageprocessor.behavior;

import com.rug.eaisystemmanagement.domainmodel.ContentMessage;
import com.rug.eaisystemmanagement.domainmodel.Message;
import com.rug.eaisystemmanagement.messagerouter.MessageRoutingService;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Component
public class MessageProcessingServiceImpl implements MessageProcessingService {

    @Autowired
    private MessageRoutingService messageRoutingService;
    private Map<Long, Message> receivedMessages = new HashMap<>();
    private Set<Long> sendMessages = new HashSet<>();


    @Override
    public ContentMessage processContentMessage(ContentMessage message) {
        Validate.notNull(message, "message is null");
        // TODO: check if message is correct, set creation date and exparation time etc.
        Long messageId = message.registerMessage();
        receivedMessages.put(messageId, message);
        Boolean isSend = messageRoutingService.sendMessage(message);
        if (isSend) {
            sendMessages.add(messageId);
            message.setSendingStatus(isSend);
        }
        return message;
    }
}
