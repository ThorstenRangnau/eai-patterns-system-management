package com.rug.eaisystemmanagement.receiver.application.connector;

public class MessageRequest {

    private final Boolean send;
    private final Long messageId    ;

    public MessageRequest(Boolean send, Long messageId) {
        this.send = send;
        this.messageId = messageId;
    }
}
