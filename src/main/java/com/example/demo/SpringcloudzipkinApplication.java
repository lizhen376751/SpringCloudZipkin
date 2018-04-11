package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

//@EnableZipkinServer，开启ZipkinServer的功能
@EnableZipkinServer
@SpringBootApplication
public class SpringcloudzipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudzipkinApplication.class, args);
	}
}
