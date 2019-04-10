package com.bdqn.tools;

import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
    private static SessionFactory sessionFactory;
    private static ThreadLocal<Session> local=new ThreadLocal<Session>();

    static{
        try{
            Configuration configuration = new Configuration().configure();
            sessionFactory=configuration.buildSessionFactory();
        }catch (Throwable ex){
            throw new ExceptionInInitializerError(ex);
        }

    }
    public static Session getSession() throws HibernateException{
        Session s=local.get();
        if(s==null){
            s=sessionFactory.openSession();
        }
        local.set(s);
        return s;
    }
    public static void closeAll(){
        Session s=local.get();
        local.set(null);
        if(s!=null){
            sessionFactory.close();
        }
    }

}
