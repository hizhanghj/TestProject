package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @EnableEurekaServer 启用EurekaServer
 * @SpringBootApplication 是一个复合注解，包括@ComponentScan，和@SpringBootConfiguration，@EnableAutoConfiguration
 */
@EnableEurekaServer
@SpringBootApplication
public class RunEurekaServer {
	public static void main(String[] args) {
		SpringApplication.run(RunEurekaServer.class, args);
	}
}
