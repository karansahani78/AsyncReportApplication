package com.karan.AsyncReportApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncReportApplication.class, args);
	}

}
