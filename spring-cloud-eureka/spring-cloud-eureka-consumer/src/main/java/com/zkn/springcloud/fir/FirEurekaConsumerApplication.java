package com.zkn.springcloud.fir;

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
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FirEurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirEurekaConsumerApplication.class, args);
    }
}
