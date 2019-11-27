package com.rug.eaisystemmanagement.domainmodel;

import org.apache.commons.lang3.Validate;

import java.time.LocalDateTime;

public class Header {

    private static Long idCount = 0L;

    private Long messageId;
    private String originator;
    private String receiver;
    private LocalDateTime creationTime;
    private LocalDateTime expirationTime;
    private Boolean isSend;

    public Long getMessageId() {
        return messageId;
    }

    public Long initiateMessageId() {
        this.messageId = idCount++;
        return messageId;
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

    public void setIsSend(Boolean isSend) {
        this.isSend = isSend;
    }

    public boolean isSend() {
        return isSend;
    }
}
