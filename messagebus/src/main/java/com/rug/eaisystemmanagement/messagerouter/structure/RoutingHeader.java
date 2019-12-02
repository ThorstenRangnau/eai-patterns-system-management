package com.rug.eaisystemmanagement.messagerouter.structure;

public class RoutingHeader {

    private Long id;
    private Boolean success;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
