package com.shareknowledge.util;

import java.util.List;

/**
 * Created by Emon Hossain on 8/24/2017.
 */
public interface BaseDao {
    public <T> List<T> findAll(Class<?> clazz);

    public <T> Object findOne(T id);

    public <T> void saveEntity(T entity);

    public <T> void updateEntity(T entity);

    public <T> void deleteEntity(T id);

    public <T> List<T> findByPropertyName(Class<T> clazz, String propertyName, T value);
}
