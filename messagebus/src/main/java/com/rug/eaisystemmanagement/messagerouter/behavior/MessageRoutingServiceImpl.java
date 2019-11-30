package com.rug.eaisystemmanagement.messagerouter.behavior;

import com.rug.eaisystemmanagement.domainmodel.ContentMessage;
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
        Long receiverApplicationId = registryService.resolveReceiver(message.getReceiver());
        String receiverUrl = registryService.getUrlByApplcationId(receiverApplicationId);
        System.out.println("Send the message to application with id " + receiverApplicationId + " and url "
            + receiverUrl + " message content " + message.getMessageContent());
        //TODO: Add data structure to monitor send messages
        String result = restClient.get("http://localhost:8080/");
        System.out.println(result);
        return true;
    }
}
