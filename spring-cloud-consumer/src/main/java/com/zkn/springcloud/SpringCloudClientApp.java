package com.zkn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zkn
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudClientApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientApp.class, args);
    }
}
