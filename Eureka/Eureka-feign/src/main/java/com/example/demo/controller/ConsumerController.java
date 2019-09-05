package com.example.demo.controller;

import com.example.demo.service.ComputeClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private ComputeClient computeClient;

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    public String hi(String name){

        return computeClient.hiService(name);
    }
}
