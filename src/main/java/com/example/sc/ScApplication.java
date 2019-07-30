package com.example.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//表示开启Eurake Server
@EnableEurekaServer
@SpringBootApplication
public class ScApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScApplication.class, args);
    }

}
