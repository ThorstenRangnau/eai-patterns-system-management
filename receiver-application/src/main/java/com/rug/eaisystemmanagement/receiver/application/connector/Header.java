package com.rug.eaisystemmanagement.receiver.application.connector;

public class Header {

    private Long id;
    private Boolean success;

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean isSuccess() {
        return success;
    }

    public Long getId() {
        return id;
    }
}
