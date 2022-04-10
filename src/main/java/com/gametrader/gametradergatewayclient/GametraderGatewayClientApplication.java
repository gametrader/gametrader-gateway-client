package com.gametrader.gametradergatewayclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GametraderGatewayClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GametraderGatewayClientApplication.class, args);
    }

}
