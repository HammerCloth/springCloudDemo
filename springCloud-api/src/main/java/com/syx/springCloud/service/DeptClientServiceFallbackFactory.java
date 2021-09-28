package com.syx.springCloud.service;

import com.syx.springCloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author:syx
 * @date:2021/9/28 20:32
 * @version:v1.0
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept queryById(Long id) {
                return new Dept().setDeptno(id)
                        .setDname("id=>"+id+"，没有对应的信息，客户端提供了降级的信息，这个服务现在已经被关闭了")
                        .setDb_source("no this datasource");
            }

            @Override
            public List<Dept> queryDept() {
                return null;
            }
        };
    }
}