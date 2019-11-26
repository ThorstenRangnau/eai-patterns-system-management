package com.rug.eaisystemmanagement.domainmodel;

import org.apache.commons.lang3.Validate;

public abstract class Message {

    private Header header;
    private Body body;

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
}
