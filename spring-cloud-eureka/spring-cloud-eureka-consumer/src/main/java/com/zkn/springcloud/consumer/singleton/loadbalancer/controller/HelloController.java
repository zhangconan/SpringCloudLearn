package com.zkn.springcloud.consumer.singleton.loadbalancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zkn
 * @date 2018/9/14 23:37
 **/
@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("loadbalancer")
    public String hello(String name) {
        ServiceInstance serviceInstance = loadBalancerClient.choose("spring-cloud-eureka-producer");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/fir/hello?name=" + name + " loadbalancer";
        return restTemplate.getForObject(url, String.class);
    }
}
