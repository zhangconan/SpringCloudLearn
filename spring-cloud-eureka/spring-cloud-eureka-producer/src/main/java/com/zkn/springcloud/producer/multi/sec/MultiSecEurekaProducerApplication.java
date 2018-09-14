package com.zkn.springcloud.producer.multi.sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zkn
 * @date 2018/9/15 0:20
 **/
@SpringBootApplication
public class MultiSecEurekaProducerApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "sec");
        SpringApplication.run(MultiSecEurekaProducerApplication.class, args);
    }
}
