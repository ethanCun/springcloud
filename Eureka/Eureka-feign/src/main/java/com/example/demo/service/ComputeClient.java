package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//使用@FeignClient("server-ribbon")注解来绑定该接口对应server-ribbon服务
//通过Spring MVC的注解来配置server-ribbon服务下的具体实现。
@FeignClient("server-ribbon")
public interface ComputeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    String hiService(@RequestParam(value = "name") String name);
}
