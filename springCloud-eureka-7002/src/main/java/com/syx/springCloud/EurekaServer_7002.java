package com.syx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author:syx
 * @date:2021/9/26 15:05
 * @version:v1.0
 */
@SpringBootApplication
@EnableEurekaServer // 服务端的启动类，可以接收被人来注册进来
public class EurekaServer_7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7002.class,args);
    }
}
