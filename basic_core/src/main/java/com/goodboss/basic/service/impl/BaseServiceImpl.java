package com.goodboss.basic.service.impl;

import com.goodboss.basic.mapper.BaseMapper;
import com.goodboss.basic.query.BaseQuery;
import com.goodboss.basic.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private BaseMapper<T> baseMapper;

    @Override
    @Transactional
    public Long save(T t) {
        return baseMapper.save(t);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        baseMapper.delete(id);

    }

    @Override
    @Transactional
    public void update(T t) {
        baseMapper.update(t);
    }

    @Override
    public T findById(Long id) {
        return baseMapper.findById(id);
    }

    @Override
    public List<T> findAll() {
        return baseMapper.findAll();
    }

    @Override
    public List<T> findByQuery(BaseQuery baseQuery) {
        return baseMapper.findByQuery(baseQuery);
    }

    @Override
    public Long findCount(BaseQuery baseQuery) {
        return baseMapper.findCount(baseQuery);
    }
}
