package com.whoszus.model.FirstModel.DAO.impl;

import com.whoszus.model.FirstModel.DAO.IFirstModelDao;
import com.whoszus.model.FirstModel.entity.ClassCatcher;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2015/10/29.
 */
@Repository("firstModelDao")
public class IFirstModelDaoImpl implements IFirstModelDao {

    @Resource
    protected SessionFactory sessionFactory;


    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<ClassCatcher> getCc() {
//        Session session = this.getSession();
//        List<ClassCatcher> list ;
//
//        Query query = session.createQuery("from ClassCatcher");
//        list =query.list();
        return null;
    }

    @Override
    public void setCc(ClassCatcher cc) {
        Session session = this.getSession();
        session.save(cc);
    }

}
