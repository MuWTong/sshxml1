package com.bdqn.dao;

import com.bdqn.pojo.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

public interface DeptDao {

    public List<Dept> findAll();
}
