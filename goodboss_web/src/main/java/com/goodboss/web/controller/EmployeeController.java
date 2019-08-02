package com.goodboss.web.controller;


import com.goodboss.basic.controller.BaseController;
import com.goodboss.domain.Employee;
import com.goodboss.query.EmployeeQuery;
import com.goodboss.service.EmployeeService;
import com.goodboss.util.JsonResult;
import com.goodboss.util.UIPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/employee")
public class EmployeeController implements BaseController<Employee> {
    @Autowired
    EmployeeService employeeService;

    @Override
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public JsonResult save(@RequestBody Employee employee) {
        try {
            System.out.println(employee);
            employeeService.save(employee);
        } catch (Exception e) {
            return new JsonResult(e.getMessage());
        }
        return new JsonResult();
    }

    @Override
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    @ResponseBody
    public JsonResult update(@PathVariable Long id, @RequestBody Employee employee) {
        try {
            employeeService.update(employee);
        } catch (Exception e) {
            return new JsonResult(e.getMessage());
        }
        return new JsonResult();
    }

    @Override
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public JsonResult delete(@PathVariable Long id) {

        try {
            employeeService.delete(id);
        } catch (Exception e) {
            return new JsonResult(e.getMessage());
        }
        return new JsonResult();
    }

    @Override
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public Employee findOne(@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @Override
    @RequestMapping(method = RequestMethod.PATCH)
    @ResponseBody
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public UIPage<Employee> findByQuery(@RequestBody EmployeeQuery employeeQuery) {
        List<Employee> list = employeeService.findByQuery(employeeQuery);
        Long count = employeeService.findCount(employeeQuery);
        return new UIPage<Employee>().setRows(list).setTotal(count);
    }
}
