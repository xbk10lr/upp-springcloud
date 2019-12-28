package com.upp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.upp.dao")
@EnableFeignClients
@EnableEurekaClient
public class UppFundprocessApplication {

	public static void main(String[] args) {
		SpringApplication.run(UppFundprocessApplication.class, args);
	}
}
