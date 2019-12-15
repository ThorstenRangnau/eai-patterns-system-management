package com.rug.eaisystemmanagement.registry.structure;

import org.apache.commons.lang3.Validate;

public class RegisteredApplication {

    private static Long idCount = 0L;

    private Long id = 0L;
    private String applicationName;
    private String url;

    public RegisteredApplication() {
        this.id = idCount++;
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

    public void setApplicationName(String applicationName) {
        Validate.notBlank(applicationName, "applicationName is blank");
        this.applicationName = applicationName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        Validate.notBlank(url, "url is blank");
        this.url = url;
    }
}
