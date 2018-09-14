package com.zkn.springcloud.producer.singleton.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8001/fir/hello?name=zan
 * @author zkn
 * @date 2018/9/3 23:37
 **/
@RestController
@RequestMapping("fir")
public class FirProducerHelloController {

    /**
     * 第一个请求
     *
     * @param name
     * @return
     */
    @RequestMapping("hello")
    public String index(String name) {
        return "hello:" + name + ",this is first message";
    }
}