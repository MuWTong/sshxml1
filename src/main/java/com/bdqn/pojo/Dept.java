package com.bdqn.pojo;

import org.springframework.stereotype.Component;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Dept {
    private int id;
    private String dname;
    private String des;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dname", nullable = false, length = 50)
    public String getDname() {
        return dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", dname='" + dname + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Basic
    @Column(name = "des", nullable = false, length = 255)
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dept dept = (Dept) o;

        if (id != dept.id) return false;
        if (dname != null ? !dname.equals(dept.dname) : dept.dname != null) return false;
        if (des != null ? !des.equals(dept.des) : dept.des != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (des != null ? des.hashCode() : 0);
        return result;
    }
}
