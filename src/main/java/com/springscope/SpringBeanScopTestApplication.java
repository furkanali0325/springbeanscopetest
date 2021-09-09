package com.springscope;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBeanScopTestApplication {

	@PostConstruct
	public  init() {
		log.info("application is starting");
	}
	public static void main(String[] args) {
		log.info("application is under execution");
		SpringApplication.run(SpringBeanScopTestApplication.class, args);
	}

}
