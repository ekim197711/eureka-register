package com.example.springbooteurekaregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootEurekaRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaRegistryApplication.class, args);
    }

}
