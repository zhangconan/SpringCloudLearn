package com.zkn.springcloud.consumer.multi.controller;

import com.zkn.springcloud.consumer.multi.intf.HelloFeignRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8002/fir/hello/ansss
 *
 * @author zkn
 * @date 2018/9/4 0:10
 **/
@RestController
@RequestMapping("fir")
public class MultiFirConsumerHelloController {

    @Autowired
    private HelloFeignRemote helloRemote;

    @RequestMapping("hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
