package com.rug.eaisystemmanagement.messagerouter;

import com.rug.eaisystemmanagement.domainmodel.ContentMessage;

public interface MessageRoutingService {

    Boolean sendMessage(ContentMessage message);
}
