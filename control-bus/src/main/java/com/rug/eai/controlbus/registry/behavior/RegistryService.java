package com.rug.eai.controlbus.registry.behavior;

import com.rug.eai.controlbus.connector.restclient.structure.RegisteredApplication;

public interface RegistryService {

    RegisteredApplication register(String applicationName, String url);

    String resolve(Long id);
}
