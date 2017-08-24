package com.shareknowledge.user;

import com.shareknowledge.util.BaseDao;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Emon Hossain on 8/24/2017.
 */
@Repository
public class UserDao implements BaseDao{

    @Autowired
    private EntityManager manager;

    private Session getSession(){
        return this.manager.unwrap(Session.class);
    }

    @Override
    public <T> List<T> findAll(Class<?> clazz) {
        return null;
    }

    @Override
    public <T> Object findOne(T id) {
        return null;
    }

    @Override
    public <T> void saveEntity(T entity) {

    }

    @Override
    public <T> void updateEntity(T entity) {

    }

    @Override
    public <T> void deleteEntity(T id) {

    }

    @Override
    public <T> List<T> findByPropertyName(Class<T> clazz, String propertyName, T value) {
        return null;
    }
}
