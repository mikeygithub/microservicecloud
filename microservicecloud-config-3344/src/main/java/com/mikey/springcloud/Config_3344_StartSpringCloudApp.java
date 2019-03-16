package com.mikey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Program: microservicecloud
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-03-16 09:21
 * @Describe：
 **/
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {

    public static void main(String[] args){

        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);


    }

}
