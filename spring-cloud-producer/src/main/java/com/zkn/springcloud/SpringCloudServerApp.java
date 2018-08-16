package com.zkn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zkn
 * @date 2018/8/16 23:13
 **/
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudServerApp {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudServerApp.class);
    }
}