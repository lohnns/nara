package io.nara.monitoring;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.BDDAssertions.then;

class HealthCheckControllerImplTest {

    HealthCheckController controller = new HealthCheckControllerImpl();

    @Test
    void ping() {
        ResponseEntity<String> resp = controller.ping();
        then(resp.getBody()).isEqualTo("pong");
    }

}