package com.syx.springCloud.service;

import com.syx.springCloud.pojo.Dept;

import java.util.List;

/**
 * @author:syx
 * @date:2021/9/24 17:08
 * @version:v1.0
 */
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryDept();
}
