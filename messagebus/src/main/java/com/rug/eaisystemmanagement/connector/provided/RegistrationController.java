package com.rug.eaisystemmanagement.connector.provided;

import com.rug.eaisystemmanagement.registry.behavior.RegistryService;
import com.rug.eaisystemmanagement.registry.structure.RegisteredApplication;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * RegistrationController forges the RegistrationAPI
 */

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

    @GetMapping
    public Map<Long, RegisteredApplication> readTargets() {
        return registryService.getTargets();
    }

    @DeleteMapping("/{id}")
    public void deregisterApplication(@PathVariable Long id) {
        Boolean success = registryService.deregister(id);
        //TODO: throw Exception if deregistration was unsuccessful
    }

}
