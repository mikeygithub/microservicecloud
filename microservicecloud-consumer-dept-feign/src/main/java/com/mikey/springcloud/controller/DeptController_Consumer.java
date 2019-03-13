package com.mikey.springcloud.controller;

import com.mikey.springcloud.entity.Dept;
import com.mikey.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @Program: microservicecloud
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-03-12 09:51
 * @Describe：
 **/
@RestController
public class DeptController_Consumer {

//    private static final String REST_URL_PREFIX="http://localhost:8001";

    //    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @RequestMapping("/consumer/dept/add")
//    public boolean add(Dept dept){
//
//        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
//    }
//
//    @RequestMapping("/consumer/dept/get/{id}")
//    public Dept get(@PathVariable("id") Long id){
//
//        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
//    }
//
//    @RequestMapping("/consumer/dept/list")
//    public List<Dept> list(){
//
//        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
//    }
//
//    @RequestMapping("/consumer/dept/discovery")
//    public Object discovery(){
//
//        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
//    }
    @Autowired
    private DeptClientService deptClientService = null;


    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.deptClientService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return this.deptClientService.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept){
        return this.deptClientService.add(dept);
    }


}
