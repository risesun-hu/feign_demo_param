package com.example.feign_orders_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FeignOrdersProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignOrdersProviderApplication.class, args);
    }

}
