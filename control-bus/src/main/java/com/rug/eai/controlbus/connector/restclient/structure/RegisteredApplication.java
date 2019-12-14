package com.rug.eai.controlbus.connector.restclient.structure;

import org.apache.commons.lang3.Validate;

public class RegisteredApplication {

    private static Long idCount = 0L;

    private final Long id;
    private String applicationName;
    private String url;

    public RegisteredApplication() {
        this.id = idCount++;
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
