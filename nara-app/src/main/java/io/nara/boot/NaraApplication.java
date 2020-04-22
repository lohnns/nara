package io.nara.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.nara")
public class NaraApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaraApplication.class, args);
	}

}
