package com.zkn.springcloud.consumer.singleton.loadbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zkn
 * @date 2018/9/14 23:28
 **/
@SpringBootApplication
public class LoadBalancerApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "singleton");
        SpringApplication.run(LoadBalancerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
