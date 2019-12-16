package com.rug.eaisystemmanagement.receiver.application.connector;

import java.util.ArrayList;
import java.util.List;

public class Header {

    private Long id;
    private Boolean success;
    private List<String> locations = new ArrayList<>();

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean isSuccess() {
        return success;
    }

    public Long getId() {
        return id;
    }

    public List<String> getLocations() {
        return locations;
    }
}
