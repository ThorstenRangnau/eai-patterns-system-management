package com.rug.eaisystemmanagement.registry.behavior;

import com.rug.eaisystemmanagement.registry.structure.RegisteredApplication;
import org.apache.commons.lang3.Validate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RegistryServiceImpl implements RegistryService {

    private Map<Long, RegisteredApplication> registeredApplications = new HashMap();

    @Override
    public RegisteredApplication register(String applicationName, String url) {
        Validate.notBlank(applicationName, "applicationName is blank");
        Validate.notBlank(url, "url is blank");
        RegisteredApplication registeredApplication = new RegisteredApplication();
        registeredApplication.setApplicationName(applicationName);
        registeredApplication.setUrl(url);
        registeredApplications.put(registeredApplication.getId(), registeredApplication);
        return registeredApplication;
    }

    @Override
    public Boolean deregister(Long id) {
        registeredApplications.remove(id);
        return !registeredApplications.containsKey(id);
    }

    @Override
    public Map<Long, RegisteredApplication> getTargets() {
        return registeredApplications;
    }

    @Override
    public Long resolveReceiver(String receiver) {
        return registeredApplications
            .entrySet()
            .stream()
            .filter(e -> e.getValue().getApplicationName().equals(receiver))
            .findFirst()
            .get()
            .getValue()
            .getId();
    }

    @Override
    public String getUrlByApplcationId(Long receiverApplicationId) {
        return registeredApplications.get(receiverApplicationId).getUrl();
    }
}
