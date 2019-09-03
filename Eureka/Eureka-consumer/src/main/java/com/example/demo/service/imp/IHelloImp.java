package com.example.demo.service.imp;

import com.example.demo.service.IHello;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service("helloService")
public class IHelloImp implements IHello {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String hiService(String name) {

        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }
}
