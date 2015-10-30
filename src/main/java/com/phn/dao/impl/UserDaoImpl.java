/**
 *
 */
package com.phn.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.phn.dao.IUserDao;
import com.phn.model.UserEntity;

import java.util.List;

/**
 * @author phn
 */

@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    // extends BaseDaoImpl<UserEntity, Integer>
    @Resource
    protected SessionFactory sessionFactory;


    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean isExist(UserEntity user) {
        Session session = this.getSession();
        String hql = "from UserEntity where username =? and password = ?";
        Query query = session.createQuery(hql);
        query.setString(0, user.getUsername());
        query.setString(1, user.getPassword());
        return query.list().size() >= 1;

    }

    public List<UserEntity> getoneUser() {
        Session session = this.getSession();
        String hql = "from UserEntity where  username=? and password = ?";
        Query query = session.createQuery(hql);
        query.setString(0, "hello");
        query.setString(1, "1844");
        List<UserEntity> list = query.list();
        return list;
    }


}
