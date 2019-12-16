package com.rug.eaisystemmanagement.messagerouter.behavior;

import com.rug.eaisystemmanagement.domainmodel.ContentMessage;
import com.rug.eaisystemmanagement.messagerouter.structure.RoutingMessage;
import com.rug.eaisystemmanagement.messagerouter.structure.restclient.RestClient;
import com.rug.eaisystemmanagement.registry.behavior.RegistryService;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageRoutingServiceImpl implements MessageRoutingService {

    private static Long sendingCount = 0L;

    @Autowired
    private RegistryService registryService;

    @Autowired
    private RestClient restClient;

    @Override
    public Boolean sendMessage(ContentMessage message) {
        Validate.notNull(message, "message is null");
        if (message.hasHistory()) {
            message.addLocation("MessageRoutingServiceImpl");
        }
        Long receiverApplicationId = registryService.resolveReceiver(message.getReceiver());
        String receiverUrl = registryService.getUrlByApplcationId(receiverApplicationId);
        System.out.println("INFO: Attempt to route message to " + receiverUrl + " with sending history " + (message.hasHistory() ? "on" : "off"));
        //TODO: Add data structure to monitor send messages
        RoutingMessage routingMessage = new RoutingMessage(message.getMessageId(), message.getMessageContent(), message.getHistories());
        routingMessage = restClient.post(receiverUrl, routingMessage, RoutingMessage.class);
        System.out.println("INFO: send message to receiver application with id " + receiverApplicationId + " the message was send " + routingMessage.getHeader().isSuccess());
        return routingMessage.getHeader().isSuccess();
    }


}
