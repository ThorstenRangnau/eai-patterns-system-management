package com.rug.eai.controlbus.connector.restclient.structure;

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
