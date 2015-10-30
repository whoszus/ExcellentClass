package com.phn.dao.impl;

import com.phn.model.UserEntity;
import com.phn.service.IUserService;
import junit.framework.TestCase;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2015/10/28.
 */
public class UserDaoImplTest extends TestCase {

    @Resource
    private IUserService service;

////    @Autowired
//    @Resource
//    protected SessionFactory sessionFactory;

    private static SessionFactory sf = null;

    @BeforeClass
    public static void beforeClass() {
        try {
            sf = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }


//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    public Session getSession() {
//        return sessionFactory.getCurrentSession();
//    }

    public void testGetoneUser() throws Exception {
//        SessionFactory sf =
        Session session = sf.getCurrentSession();
        String hql = "from UserEntity";
        Query query = session.createQuery(hql);
        List<UserEntity> list = query.list();
        System.out.println(list);
    }


    @AfterClass
    public static void afterClass() {
        sf.close();
    }
}