package io.nara.monitoring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class HealthCheckControllerImpl implements HealthCheckController {

    @Override
    public ResponseEntity<String> ping() {
        log.debug("ping called");
        return ResponseEntity.ok("pong");
    }

}
