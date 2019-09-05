package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @EnableDiscoveryClient与@EnableEurekaClient区别:https://www.jianshu.com/p/f6db3117864f
 * */
@EnableDiscoveryClient //向服务中心注册服务 服务提供商
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    //定义bean
    @Bean
    //开启负载均衡的注解 @LoadBalanced注解开启均衡负载能力。
    //在使用springcloud ribbon客户端负载均衡的时候，
    //可以给RestTemplate bean 加一个@LoadBalanced注解，就能让这个RestTemplate在请求时拥有客户端负载均衡的能力。
    @LoadBalanced
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
