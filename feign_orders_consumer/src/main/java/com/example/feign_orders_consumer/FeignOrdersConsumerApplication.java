package com.example.feign_orders_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignOrdersConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignOrdersConsumerApplication.class, args);
    }

}
