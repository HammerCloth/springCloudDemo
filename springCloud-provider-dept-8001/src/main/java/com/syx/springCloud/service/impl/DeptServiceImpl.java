package com.syx.springCloud.service.impl;

import com.syx.springCloud.dao.DeptDAO;
import com.syx.springCloud.pojo.Dept;
import com.syx.springCloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:syx
 * @date:2021/9/24 17:08
 * @version:v1.0
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDAO deptDAO;

    @Override
    public boolean addDept(Dept dept) {
        return deptDAO.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDAO.queryById(id);
    }

    @Override
    public List<Dept> queryDept() {
        return deptDAO.queryDept();
    }
}
