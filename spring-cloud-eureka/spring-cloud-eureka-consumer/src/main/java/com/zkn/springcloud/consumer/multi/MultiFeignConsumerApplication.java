package com.zkn.springcloud.consumer.multi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zkn
 * @date 2018/9/15 0:54
 **/
@EnableFeignClients
@SpringBootApplication
public class MultiFeignConsumerApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "singleton");
        SpringApplication.run(MultiFeignConsumerApplication.class, args);
    }
}
