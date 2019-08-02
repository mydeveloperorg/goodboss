package com.goodboss.basic.service;

import com.goodboss.basic.query.BaseQuery;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface BaseService<T> {

    Long save(T employee);


    void delete(Long id);


    void update(T employee);

    T findById(Long id);

    List<T> findAll();

    List<T> findByQuery(BaseQuery baseQuery);

    Long findCount(BaseQuery baseQuery);
}
