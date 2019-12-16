package com.rug.eaisystemmanagement.messageprocessor.behavior;

import com.rug.eaisystemmanagement.domainmodel.ContentMessage;

public interface MessageProcessingService {

    ContentMessage processContentMessage(ContentMessage message);

    void toggleMessageHistory();
}
