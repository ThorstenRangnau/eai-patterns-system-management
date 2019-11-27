package com.rug.eaisystemmanagement.registry.behavior;

import com.rug.eaisystemmanagement.registry.structure.RegisteredApplication;

import java.util.Map;

public interface RegistryService {

    RegisteredApplication register(String applicationName, String url);

    Boolean deregister(Long id);

    Map<Long, RegisteredApplication> getTargets();

    Long resolveReceiver(String receiver);

    String getUrlByApplcationId(Long receiverApplicationId);
}
