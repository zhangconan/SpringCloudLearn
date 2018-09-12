package com.zkn.springcloud.consumer.singleton.feign.intf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zkn
 * @date 2018/9/4 0:08
 **/
@FeignClient(name = "spring-cloud-eureka-producer")
public interface HelloRemote {
    /**
     * 远程调用的第一个方法
     * get请求的话这里要加上RequestParam注解，要不然调用方会取不到值
     * 或者或出现method not support
     *
     * @param name
     * @return
     */
    @RequestMapping("fir/hello")
    public String hello(@RequestParam("name") String name);
}
