package com.zkn.springcloud.consumer.singleton.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zkn
 * @date 2018/9/13 0:35
 **/
@SpringBootApplication
public class RibbonApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "singleton");
        SpringApplication.run(RibbonApplication.class, args);
    }

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
