package com.bdqn.action;

import com.bdqn.pojo.Dept;
import com.bdqn.service.DeptService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DeptAction extends ActionSupport {
    @Resource
    private DeptService deptService;
    private Dept dept;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public String findAll(){
        List<Dept> list=deptService.findAll();
        HttpServletRequest request=ServletActionContext.getRequest();
        request.setAttribute("list",list);
        this.name="张三";
        request.setAttribute("name",this.name);
        for (Dept dept:list){
            System.out.println(dept);
        }
        return "success";
    }
    public DeptService getDeptService() {
        return deptService;
    }

    public void setDeptService(DeptService deptService) {
        this.deptService = deptService;
    }
}
