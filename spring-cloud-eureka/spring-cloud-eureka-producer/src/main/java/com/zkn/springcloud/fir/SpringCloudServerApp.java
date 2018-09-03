package com.zkn.springcloud.fir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zkn
 * @date 2018/8/16 23:13
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudServerApp {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudServerApp.class);
    }
}
