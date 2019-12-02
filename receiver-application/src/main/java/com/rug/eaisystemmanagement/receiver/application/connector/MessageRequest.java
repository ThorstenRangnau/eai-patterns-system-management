package com.rug.eaisystemmanagement.receiver.application.connector;

public class MessageRequest {

    private Boolean send;
    private Long messageId;

    public MessageRequest(Boolean send, Long messageId) {
        this.send = send;
        this.messageId = messageId;
    }

    public Boolean isSend() {
        return send;
    }

    public Long getMessageId() {
        return messageId;
    }
}
