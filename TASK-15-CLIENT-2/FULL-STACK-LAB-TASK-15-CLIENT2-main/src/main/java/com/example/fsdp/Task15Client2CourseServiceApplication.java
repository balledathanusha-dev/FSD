package com.example.fsdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Task15Client2CourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task15Client2CourseServiceApplication.class, args);
	}

}
