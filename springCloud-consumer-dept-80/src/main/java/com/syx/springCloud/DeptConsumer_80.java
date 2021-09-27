package com.syx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:syx
 * @date:2021/9/25 17:02
 * @version:v1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class DeptConsumer_80 {
    //ribbon和eureka整合以后，客户短可以直接调用服务，不用关心ip地址和端口号
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}
