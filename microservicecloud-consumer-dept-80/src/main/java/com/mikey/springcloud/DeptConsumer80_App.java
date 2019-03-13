package com.mikey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Program: microservicecloud
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-03-12 12:52
 * @Describe：
 **/
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_App {

    public static void main(String[] args){

        SpringApplication.run(DeptConsumer80_App.class,args);

    }
}
