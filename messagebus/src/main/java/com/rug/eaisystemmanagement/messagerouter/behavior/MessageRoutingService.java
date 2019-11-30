package com.rug.eaisystemmanagement.messagerouter.behavior;

import com.rug.eaisystemmanagement.domainmodel.ContentMessage;

public interface MessageRoutingService {

    Boolean sendMessage(ContentMessage message);
}
