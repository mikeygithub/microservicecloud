package com.mikey.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Program: microservicecloud
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-03-12 07:59
 * @Describe：
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true )
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;
}
