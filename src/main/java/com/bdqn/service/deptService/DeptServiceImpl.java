package com.bdqn.service.deptService;

import com.bdqn.dao.DeptDao;
import com.bdqn.pojo.Dept;
import com.bdqn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;
    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }

    public DeptDao getDeptDao() {
        return deptDao;
    }

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }
}
