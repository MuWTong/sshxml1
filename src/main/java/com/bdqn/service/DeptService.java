package com.bdqn.service;

import com.bdqn.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {
    public List<Dept> findAll();
}
