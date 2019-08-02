package com.goodboss.basic.mapper;


import com.goodboss.basic.query.BaseQuery;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T> {
    Long save(T t);

    void update(T t);

    void delete(Serializable id);

    T findById(Serializable id);

    List<T> findAll();

    List<T> findByQuery(BaseQuery baseQuery);

    Long findCount(BaseQuery baseQuery);
}
