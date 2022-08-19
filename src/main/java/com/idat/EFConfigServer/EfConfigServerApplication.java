package com.idat.EFConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfConfigServerApplication.class, args);
	}

}
