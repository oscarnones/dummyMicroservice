package com.example.dummyMicroservice;

import org.apache.commons.text.StringEscapeUtils;
import org.owasp.encoder.Encode;
import org.owasp.esapi.ESAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DummyMicroserviceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DummyMicroserviceApplication.class, args);
	}

}
