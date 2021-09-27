package com.syx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:syx
 * @date:2021/9/24 17:16
 * @version:v1.0
 */
@SpringBootApplication
@EnableEurekaClient //在服务启动后自动注册到eureka
@EnableDiscoveryClient //服务发现
public class DeptProvider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8002.class,args);
    }
}
