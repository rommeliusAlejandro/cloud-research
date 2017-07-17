package com.dharbor.set.share.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class ShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareApplication.class, args);
	}
}
