package com.goodboss.web.controller;


import com.goodboss.basic.controller.BaseController;
import com.goodboss.domain.Dept;
import com.goodboss.mapper.DeptMapper;
import com.goodboss.query.DeptQuery;
import com.goodboss.util.JsonResult;
import com.goodboss.util.UIPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController implements BaseController<Dept> {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public JsonResult save(Dept dept) {
        try {
            deptMapper.save(dept);
        } catch (Exception e) {
            return new JsonResult(e.getMessage());
        }
        return new JsonResult();
    }

    @Override
    @RequestMapping(value = "{id}", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult update(Long id, Dept dept) {
        try {
            deptMapper.update(dept);
        } catch (Exception e) {
            return new JsonResult(e.getMessage());
        }
        return new JsonResult();
    }

    @Override
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public JsonResult delete(Long id) {
        try {
            deptMapper.delete(id);
        } catch (Exception e) {
            return new JsonResult(e.getMessage());
        }
        return new JsonResult();
    }

    @Override
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public Dept findOne(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    @RequestMapping(method = RequestMethod.PATCH)
    @ResponseBody
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public UIPage<Dept> findByQuery(DeptQuery deptQuery) {
        List<Dept> list = deptMapper.findByQuery(deptQuery);
        Long count = deptMapper.findCount(deptQuery);
        return new UIPage<Dept>().setTotal(count).setRows(list);
    }
}
