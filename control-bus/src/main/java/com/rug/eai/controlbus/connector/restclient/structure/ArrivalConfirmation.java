package com.rug.eai.controlbus.connector.restclient.structure;

public class ArrivalConfirmation {

    private Long messageId;

    public ArrivalConfirmation() {
    }

    public ArrivalConfirmation(Long messageId) {
        this.messageId = messageId;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }
}
