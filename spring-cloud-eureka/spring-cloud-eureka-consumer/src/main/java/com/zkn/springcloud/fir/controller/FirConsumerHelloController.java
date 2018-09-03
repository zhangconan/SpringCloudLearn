package com.zkn.springcloud.fir.controller;

import com.zkn.springcloud.fir.intf.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zkn
 * @date 2018/9/4 0:10
 **/
@RestController
@RequestMapping("fir")
public class FirConsumerHelloController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
