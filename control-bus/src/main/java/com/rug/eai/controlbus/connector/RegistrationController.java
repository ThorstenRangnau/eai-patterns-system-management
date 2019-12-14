package com.rug.eai.controlbus.connector;

import com.rug.eai.controlbus.connector.restclient.structure.RegisteredApplication;
import com.rug.eai.controlbus.registry.behavior.RegistryService;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistryService registryService;

    @PostMapping
    public RegisteredApplication createRegistration(@RequestBody RegisteredApplicationDTO registeredApplicationDTO) {
        Validate.notBlank(registeredApplicationDTO.getApplicationName(), "applicationName is blank");
        Validate.notBlank(registeredApplicationDTO.getUrl(), "url is blank");
        return registryService.register(registeredApplicationDTO.getApplicationName(), registeredApplicationDTO.getUrl());
    }


}
