package com.zkn.springcloud.producer.multi.fir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zkn
 * @date 2018/9/15 0:20
 **/
@SpringBootApplication
public class MultiFirEurekaProducerApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "fir");
        SpringApplication.run(MultiFirEurekaProducerApplication.class, args);
    }
}
