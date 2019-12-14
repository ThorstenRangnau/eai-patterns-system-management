package com.rug.eai.controlbus.heartbeatmanagement.behavior;

import com.rug.eai.controlbus.registry.behavior.RegistryService;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HeartbeatServiceImpl implements HeartbeatService {

    public static final String OK = "OK";
    private Map<Long, String> services = new HashMap<>();

    @Autowired
    private RegistryService registryService;

    @Override
    public String receiveHeartbeat(Long id) {
        Validate.notNull(id, "id is null");
        String heartbeatSender = registryService.resolve(id);
        System.out.println("Receive heartbeat from " + heartbeatSender);
        return OK;
    }
}
