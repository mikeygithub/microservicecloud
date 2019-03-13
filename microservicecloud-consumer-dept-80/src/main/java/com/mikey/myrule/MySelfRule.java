package com.mikey.myrule;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Program: micro service cloud
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-03-13 16:01
 * @Describe：自定义负载均衡配置类
 **/
//public class MySelfRule implements IRule {
//    @Override
//    public Server choose(Object o) {
//        return null;
//    }
//
//    @Override
//    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
//
//    }
//
//    @Override
//    public ILoadBalancer getLoadBalancer() {
//        return null;
//    }
//}
@Configuration
public class MySelfRule  {
    @Bean
    public IRule myRule(){
//        return new RandomRule();
//        return new RoundRobinRule();
        return new RandomRule_ZY();//自定义的负载均衡
    }
}