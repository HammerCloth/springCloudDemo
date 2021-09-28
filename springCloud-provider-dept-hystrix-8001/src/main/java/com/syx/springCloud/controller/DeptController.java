package com.syx.springCloud.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.syx.springCloud.pojo.Dept;
import com.syx.springCloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:syx
 * @date:2021/9/24 17:12
 * @version:v1.0
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "queryByIdHystrix")
    public Dept queryById(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if (dept==null){
            throw new RuntimeException("id=>"+id+"，不存在该用户，或者信息无法找到");
        }
        return dept;
    }

    //备选方法
    public Dept queryByIdHystrix(@PathVariable("id") Long id){
        return new Dept().setDeptno(id)
                .setDname("id=>"+id+"，不存在该用户，或者信息无法找到")
                .setDb_source("no this datasource");
    }
}
