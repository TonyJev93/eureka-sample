package com.tonyjev.eureka.eurekasample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // Eureka 서버로서 동작하도록 함
public class EurekaSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSampleApplication.class, args);
    }

}
