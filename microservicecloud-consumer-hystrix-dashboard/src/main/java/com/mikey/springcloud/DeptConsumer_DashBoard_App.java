package com.mikey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Program: microservicecloud
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-03-15 21:35
 * @Describe：
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {
    public static void main(String[] args){

        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);

    }
}
