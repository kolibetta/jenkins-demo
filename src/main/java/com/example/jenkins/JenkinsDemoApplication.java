package com.example.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	@PostConstruct
	public void testmethode() {
		logger.info("welcome to test logger");
	}
	public static void main(String[] args) {
		logger.info("afer logging");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
