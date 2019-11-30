package com.rug.eaisystemmanagement.receiver.application;

public class RegisteredApplication {

    private Long id = 0L;
    private String applicationName = null;
    private String url = null;

    public RegisteredApplication() {
        // required by for Jackson
    }

    public RegisteredApplication(String applicationName, String url) {
        this.applicationName = applicationName;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getUrl() {
        return url;
    }
}
