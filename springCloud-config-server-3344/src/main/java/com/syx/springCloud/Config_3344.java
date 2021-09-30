package com.syx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author:syx
 * @date:2021/9/30 20:33
 * @version:v1.0
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344 {
    public static void main(String[] args) {
        SpringApplication.run(Config_3344.class,args);
    }
}
