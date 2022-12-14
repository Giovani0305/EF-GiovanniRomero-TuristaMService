package com.idat.TuristaMService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfGiovanniRomeroTuristaMServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfGiovanniRomeroTuristaMServiceApplication.class, args);
	}

}
