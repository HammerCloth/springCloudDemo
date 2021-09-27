package com.syx.springCloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author:syx
 * @date:2021/9/25 16:42
 * @version:v1.0
 */
@Configuration
public class ConfigBean {

    //配置负载均衡RestTemplate
    //IRule
    @Bean
    @LoadBalanced //ribbon
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
