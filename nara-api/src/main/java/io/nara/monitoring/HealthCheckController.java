package io.nara.monitoring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hc")
public interface HealthCheckController {

    @GetMapping("ping")
    ResponseEntity<String> ping();

}
