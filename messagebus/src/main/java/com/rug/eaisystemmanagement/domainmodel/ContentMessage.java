package com.rug.eaisystemmanagement.domainmodel;

import com.rug.eaisystemmanagement.messageprocessor.structure.MessageExpirationTime;

public class ContentMessage extends Message {

    @Override
    public void setSendingStatus(Boolean isSend) {
        getHeader().setIsSend(isSend);
    }

    @Override
    public Long registerMessage(MessageExpirationTime messageExpirationTime) {
        return getHeader().getMessageId() != null ? getHeader().getMessageId() : getHeader().initiateMessageId(messageExpirationTime);
    }
}
