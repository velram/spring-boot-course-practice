package com.springboot.practice.zuulnetflixapigatewayserver;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulNetflixApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulNetflixApiGatewayServerApplication.class, args);
	}

	@Bean
	public Sampler getDefaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}
