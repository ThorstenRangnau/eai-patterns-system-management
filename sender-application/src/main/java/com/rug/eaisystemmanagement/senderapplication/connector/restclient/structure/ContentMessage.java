package com.rug.eaisystemmanagement.senderapplication.connector.restclient.structure;

import org.apache.commons.lang3.Validate;

public class ContentMessage {

    private Header header;
    private Body body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
