package com.rug.eaisystemmanagement.domainmodel;

import com.rug.eaisystemmanagement.messageprocessor.structure.MessageExpirationTime;

public class ControlMessage extends Message {

    @Override
    public void setSendingStatus(Boolean isSend) {

    }

    @Override
    public Long registerMessage(MessageExpirationTime messageExpirationTime) {
        return null;
    }
}
