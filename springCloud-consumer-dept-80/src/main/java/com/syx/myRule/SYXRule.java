package com.syx.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:syx
 * @date:2021/9/27 21:23
 * @version:v1.0
 */
@Configuration
public class SYXRule {

    @Bean
    public IRule irule(){
        return new RandomRule();
    }

}
