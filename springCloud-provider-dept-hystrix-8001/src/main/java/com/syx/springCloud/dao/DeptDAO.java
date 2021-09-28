package com.syx.springCloud.dao;

import com.syx.springCloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:syx
 * @date:2021/9/24 16:57
 * @version:v1.0
 */
@Mapper
@Repository
public interface DeptDAO {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryDept();
}
