package com.zkn.springcloud.consumer.singleton.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zkn
 * @date 2018/9/13 0:38
 **/
@RestController
@RequestMapping("hello")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("ribbon")
    public String hello(@RequestParam("name") String name) {
        //用ribbon的话，这里直接用服务名spring-cloud-eureka-producer取代 host:port
        String url = "http://spring-cloud-eureka-producer/fir/hello?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }
}
