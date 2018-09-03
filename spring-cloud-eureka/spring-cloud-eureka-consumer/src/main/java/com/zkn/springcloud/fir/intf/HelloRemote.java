package com.zkn.springcloud.fir.intf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zkn
 * @date 2018/9/4 0:08
 **/
@FeignClient(name = "spring-cloud-eureka-producer")
public interface HelloRemote {
    /**
     * 远程调用的第一个方法
     *
     * @param name
     * @return
     */
    @RequestMapping("fir/hello")
    public String hello(String name);
}
