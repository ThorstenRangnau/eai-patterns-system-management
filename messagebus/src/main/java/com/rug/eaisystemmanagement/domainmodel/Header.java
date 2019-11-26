package com.rug.eaisystemmanagement.domainmodel;

import org.apache.commons.lang3.Validate;

import java.time.LocalDateTime;

public class Header {

    private Long messageId;
    private String originator;
    private String receiver;
    private LocalDateTime creationTime;
    private LocalDateTime expirationTime;

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        Validate.notNull(messageId, "messageId is null");
        this.messageId = messageId;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        Validate.notBlank(originator, "originator is blank");
        this.originator = originator;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        Validate.notBlank(receiver, "receiver is blank");
        this.receiver = receiver;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        Validate.notNull(creationTime, "creationTime is null");
        this.creationTime = creationTime;
    }

    public LocalDateTime getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(LocalDateTime expirationTime) {
        Validate.notNull(expirationTime, "expirationTime is null");
        this.expirationTime = expirationTime;
    }
}
