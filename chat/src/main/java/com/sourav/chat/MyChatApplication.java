package com.sourav.chat;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MyChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyChatApplication.class, args);
		log.info("Application started successfully.");
	}

}
