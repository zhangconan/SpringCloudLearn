package com.zkn.springcloud.fir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zkn
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringCloudClientApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientApp.class, args);
    }
}
