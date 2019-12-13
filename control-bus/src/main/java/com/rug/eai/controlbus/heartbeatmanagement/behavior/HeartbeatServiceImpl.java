package com.rug.eai.controlbus.heartbeatmanagement.behavior;

import org.apache.commons.lang3.Validate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HeartbeatServiceImpl implements HeartbeatService {

    public static final String OK = "OK";
    private Map<Long, String> services = new HashMap<>();

    @Override
    public String receiveHeartbeat(Long id) {
        Validate.notNull(id, "id is null");
        if (!services.containsKey(id)) {

        }
        System.out.println("Receive heartbeat from ");
        return OK;
    }
}
