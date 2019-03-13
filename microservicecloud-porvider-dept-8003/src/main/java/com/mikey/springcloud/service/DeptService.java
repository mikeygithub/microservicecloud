package com.mikey.springcloud.service;

import com.mikey.springcloud.entity.Dept;

import java.util.List;

/**
 * @Program: microservicecloud
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-03-12 08:53
 * @Describe：
 **/
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
