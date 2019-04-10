import com.bdqn.pojo.Dept;
import com.bdqn.tools.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.List;


public class TestDept {
    public static void main(String[] args){
        Session session=HibernateUtils.getSession();
        Transaction tr= session.beginTransaction();
        //查全部
        String hql="from Dept";
        Query q=session.createQuery(hql);
        List<Dept> list=q.list();
        for (Dept dept:list) {
            System.out.println(dept);
        }
        tr.commit();
        HibernateUtils.closeAll();
    }
}
