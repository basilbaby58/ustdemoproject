package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudRibbon1Server1AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbon1Server1AppApplication.class, args);
	}

}
