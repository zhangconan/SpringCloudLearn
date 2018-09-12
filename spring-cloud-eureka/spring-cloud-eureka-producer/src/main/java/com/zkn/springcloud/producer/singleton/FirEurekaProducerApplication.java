package com.zkn.springcloud.producer.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * EnableDiscoveryClient可以不再使用了
 *
 * @author zkn
 * @date 2018/8/16 23:13
 **/
@SpringBootApplication
public class FirEurekaProducerApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "singleton");
        SpringApplication.run(FirEurekaProducerApplication.class);
    }
}
