package com.rug.eai.controlbus.registry.behavior;

import com.rug.eai.controlbus.connector.restclient.structure.RegisteredApplication;
import org.apache.commons.lang3.Validate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RegistryServiceImpl implements RegistryService {

    private Map<Long, RegisteredApplication> registeredApplications = new HashMap();
    private static final String UNKNOWN = "UNKNOWN";


    @Override
    public RegisteredApplication register(String applicationName, String url) {
        Validate.notBlank(applicationName, "applicationName is blank");
        Validate.notBlank(url, "url is blank");
        RegisteredApplication registeredApplication = new RegisteredApplication();
        registeredApplication.setApplicationName(applicationName);
        registeredApplication.setUrl(url);
        // TODO: check if application is already registered and override if so
        registeredApplications.put(registeredApplication.getId(), registeredApplication);
        System.out.println("INFO - register " + applicationName + " with id  " + registeredApplication.getId());
        return registeredApplication;
    }

    @Override
    public String resolve(Long id) {
        Validate.notNull(id, "id is null");
        if (registeredApplications.containsKey(id)) {
            return registeredApplications.get(id).getApplicationName();
        }
        return UNKNOWN;
    }
}
