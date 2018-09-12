package com.zkn.springcloud.mul.sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zkn
 * @date 2018/9/12 23:31
 **/
@EnableEurekaServer
@SpringBootApplication
public class MultisSecEurekaApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "multis-2");
        SpringApplication.run(MultisSecEurekaApplication.class, args);
    }
}
