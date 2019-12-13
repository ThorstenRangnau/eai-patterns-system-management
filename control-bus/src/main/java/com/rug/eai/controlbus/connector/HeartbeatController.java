package com.rug.eai.controlbus.connector;

import com.rug.eai.controlbus.heartbeatmanagement.behavior.HeartbeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class HeartbeatController {

    @Autowired
    private HeartbeatService heartbeatService;

    @PostMapping
    public String receiveHeartbeat(Long id) {
        return heartbeatService.receiveHeartbeat(id);
    }

}
