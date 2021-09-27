package com.syx.springCloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:syx
 * @date:2021/9/26 15:41
 * @version:v1.0
 */
@RestController
public class DiscoverController {

    @Autowired
    private DiscoveryClient client;//获取一些配置信息，得到具体的微服务

    @RequestMapping("/dept/discovery")
    //注册进来的一些微服务，获取一些信息
    public Object discovery(){
        //获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discovery=>services:");
        services.forEach(System.out::println);
        System.out.println("*****************************");
        // 得到一个具体的微服务信息，通过具体的微服务id
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        instances.forEach((instance)->{
            System.out.println(
                    instance.getHost()+"\t"+
                            instance.getPort()+"\t"+
                            instance.getUri()+"\t"+
                            instance.getServiceId()+"\t"
            );
        });
        return client;

    }


}
