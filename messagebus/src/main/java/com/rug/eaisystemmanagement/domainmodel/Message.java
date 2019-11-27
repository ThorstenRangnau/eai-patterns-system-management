package com.rug.eaisystemmanagement.domainmodel;

import org.apache.commons.lang3.Validate;

public abstract class Message {

    private Header header;
    private Body body;

    public boolean isSend() {
        return header.isSend();
    }

    public Long getMessageId() {
        return header.getMessageId();
    }

    public String getReceiver() {
        return header.getReceiver();
    }

    public String getMessageContent() {
        return body.getContent();
    }

    protected Header getHeader() {
        return header;
    }

    protected void setHeader(Header header) {
        Validate.notNull(header, "header is null");
        this.header = header;
    }

    protected Body getBody() {
        return body;
    }

    protected void setBody(Body body) {
        Validate.notNull(body, "body is null");
        this.body = body;
    }

    public abstract void setSendingStatus(Boolean isSend);

    public abstract Long registerMessage();
}
