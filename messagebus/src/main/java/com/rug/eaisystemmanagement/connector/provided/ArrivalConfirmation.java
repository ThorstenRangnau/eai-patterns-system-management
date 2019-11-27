package com.rug.eaisystemmanagement.connector.provided;

public class ArrivalConfirmation {

    private Long messageId;

    public ArrivalConfirmation(Long messageId) {
        this.messageId = messageId;
    }

    public Long getMessageId() {
        return messageId;
    }
}
