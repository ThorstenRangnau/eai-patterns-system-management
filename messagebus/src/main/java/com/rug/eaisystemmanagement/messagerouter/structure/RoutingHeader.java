package com.rug.eaisystemmanagement.messagerouter.structure;

import java.util.ArrayList;
import java.util.List;

public class RoutingHeader {

    private Long id;
    private Boolean success;
    private List<String> locations = new ArrayList<>();

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

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public List<String> getLocations() {
        return locations;
    }
}
