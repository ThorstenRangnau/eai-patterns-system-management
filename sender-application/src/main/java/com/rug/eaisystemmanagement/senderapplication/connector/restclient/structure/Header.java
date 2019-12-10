package com.rug.eaisystemmanagement.senderapplication.connector.restclient.structure;

public class Header {

    private String originator;
    private String receiver;

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
