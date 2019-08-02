package com.goodboss.basic.controller;


import com.goodboss.util.JsonResult;

import java.util.List;

public interface BaseController<T> {
    JsonResult save(T t);

    JsonResult update(Long id, T t);

    JsonResult delete(Long id);

    T findOne(Long id);

    List<T> findAll();

//    public List<T> findByQuery(BaseQuery baseQuery);
}
