package com.rug.eaisystemmanagement.domainmodel;

public class ContentMessage extends Message {

    @Override
    public void setSendingStatus(Boolean isSend) {
        getHeader().setIsSend(isSend);
    }

    @Override
    public Long registerMessage() {
        return getHeader().getMessageId() != null ? getHeader().getMessageId() : getHeader().initiateMessageId();
    }
}
