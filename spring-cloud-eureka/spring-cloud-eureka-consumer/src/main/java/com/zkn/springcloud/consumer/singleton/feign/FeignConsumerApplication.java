package com.zkn.springcloud.consumer.singleton.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * EnableFeignClients启用feign进行远程调用
 * EnableDiscoveryClient启用服务注册与发现
 *
 * @author zkn
 */
@EnableFeignClients
@SpringBootApplication
public class FeignConsumerApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "singleton");
        SpringApplication.run(FeignConsumerApplication.class, args);
    }
}
