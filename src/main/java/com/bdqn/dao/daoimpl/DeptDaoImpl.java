package com.bdqn.dao.daoimpl;

import com.bdqn.dao.DeptDao;
import com.bdqn.pojo.Dept;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
public class DeptDaoImpl extends HibernateTemplate implements DeptDao {
    /**
     * 查找全部职位
     * @return
     */
    @Override
    public List<Dept> findAll() {
        return getSessionFactory().openSession().createQuery("from Dept").list();
    }
}
