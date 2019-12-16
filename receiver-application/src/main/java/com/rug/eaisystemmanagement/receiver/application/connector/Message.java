package com.rug.eaisystemmanagement.receiver.application.connector;

import java.util.List;

public class Message {

    private Header header;
    private Body body;

    public Header getHeader() {
        return header;
    }

    public Body getBody() {
        return body;
    }

    public void setSuccess(boolean success) {
        header.setSuccess(success);
    }

    public boolean hasHistory() {
        return header.getLocations().size() > 0;
    }

    public List<String> getHistory() {
        return header.getLocations();
    }
}
