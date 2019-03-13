package com.mikey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Program: microservicecloud
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-03-12 12:52
 * @Describe：
 **/


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.mikey.springcloud"})
//@ComponentScan("com.mikey.springcloud")
public class DeptConsumer80_Feign_App {

    public static void main(String[] args){

        SpringApplication.run(DeptConsumer80_Feign_App.class,args);

    }
}
