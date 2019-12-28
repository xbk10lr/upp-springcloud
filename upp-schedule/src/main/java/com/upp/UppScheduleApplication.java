package com.upp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan("com.upp.dao")
@EnableFeignClients
@EnableEurekaClient
public class UppScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UppScheduleApplication.class, args);
	}
}
