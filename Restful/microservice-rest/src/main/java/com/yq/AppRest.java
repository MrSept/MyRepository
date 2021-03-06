package com.yq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class AppRest {

	public static void main(String[] args) {
		SpringApplication.run(AppRest.class, args);
	}
	
	@Bean
	@LoadBalanced	//启动负载均衡
	public RestTemplate restTemplate() {
		
		return new RestTemplate();
	}
}
