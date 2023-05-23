package com.aliencode.riomagicstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.aliencode.riomagicstore.Controllers")
public class RiomagicstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiomagicstoreApplication.class, args);
	}

}
