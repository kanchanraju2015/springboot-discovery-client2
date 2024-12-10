package com.briz.springboo_discovery_client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableDiscoveryClient
@RestController
@RequestMapping("/service2")
@SpringBootApplication
public class SpringbooDiscoveryClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbooDiscoveryClient2Application.class, args);
	}
	@RequestMapping("/raju")
	public String hello()
	{
		return "This is service2 calling";
	}
@RequestMapping("/one")
public String tt()
{
	return "This is from service2";
}
}
