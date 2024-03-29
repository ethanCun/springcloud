package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Feign是一个声明式的Web Service客户端，它使得编写Web Serivce客户端变得更加简单。
 * 我们只需要使用Feign来创建一个接口并用注解来配置它既可完成。
 * 它具备可插拔的注解支持，包括Feign注解和JAX-RS注解。
 * Feign也支持可插拔的编码器和解码器。
 * Spring Cloud为Feign增加了对Spring MVC注解的支持，还整合了Ribbon和Eureka来提供均衡负载的HTTP客户端实现。
 * */

@SpringBootApplication
@EnableDiscoveryClient //标注提供服务 将服务注册到服务中心
@EnableFeignClients //@EnableFeignClients注解开启Feign功能
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
