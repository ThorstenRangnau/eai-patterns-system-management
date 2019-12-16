package com.rug.eaisystemmanagement.messagerouter.structure;

import java.util.ArrayList;
import java.util.List;

public class RoutingMessage {

    private RoutingHeader header;
    private RoutingBody body;

    public RoutingMessage() {
        // need for Jackson
    }

    public RoutingMessage(Long messageId, String messageContent, List<String> locations) {
        this.header = new RoutingHeader();
        header.setId(messageId);
        this.body = new RoutingBody();
        body.setContent(messageContent);
        this.header.setLocations(locations);
    }

    public RoutingHeader getHeader() {
        return header;
    }

    public void setHeader(RoutingHeader header) {
        this.header = header;
    }

    public RoutingBody getBody() {
        return body;
    }

    public void setBody(RoutingBody body) {
        this.body = body;
    }
}
