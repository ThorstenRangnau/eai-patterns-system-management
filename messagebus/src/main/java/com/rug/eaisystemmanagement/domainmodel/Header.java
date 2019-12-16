package com.rug.eaisystemmanagement.domainmodel;

import com.rug.eaisystemmanagement.messageprocessor.structure.MessageExpirationTime;
import org.apache.commons.lang3.Validate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Header {

    private static Long idCount = 0L;

    private Long messageId;
    private String originator;
    private String receiver;
    private LocalDateTime creationTime;
    private LocalDateTime expirationTime;
    private Boolean isSend;
    private List<String> locations = new ArrayList<>();

    public Long getMessageId() {
        return messageId;
    }

    public Long initiateMessageId(MessageExpirationTime messageExpirationTime) {
        this.creationTime = LocalDateTime.now();
        this.expirationTime = creationTime.plus(messageExpirationTime.getDuration(), messageExpirationTime.getTimeUnit());
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

    public void addLocation(String location) {
        this.locations.add(location);
    }

    public boolean hasHistory() {
        return locations.size() > 0;
    }

    public List<String> getLocations() {
        return locations;
    }
}
