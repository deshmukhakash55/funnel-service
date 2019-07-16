package com.xperphile.funnelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import javax.persistence.Entity;

@EntityScan(basePackages = {"com.xperphile.funnelservice.model"})
@ComponentScan(basePackages = {"com.xperphile.funnelservice.dao", "com.xperphile.funnelservice.model", "com.xperphile.funnelservice", "com.xperphile.funnelservice.config", "com.xperphile.funnelservice.service", "com.xperphile.funnelservice.service.impl", "com.xperphile.funnelservice.controller"})
@SpringBootApplication
public class FunnelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FunnelServiceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
