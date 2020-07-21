package br.com.unnamed.spring_cloud_gateway_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudGatewayServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayServerApplication.class, args);
	}
}

