package com.zkn.springcloud.mul.fir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zkn
 * @date 2018/9/12 23:26
 **/
@EnableEurekaServer
@SpringBootApplication
public class MultisFirEurekaApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "multis-1");
        SpringApplication.run(MultisFirEurekaApplication.class, args);
    }
}
