package com.goodboss.service.impl;

import com.goodboss.BaseTest;
import com.goodboss.domain.Employee;
import com.goodboss.mapper.EmployeeMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImplTest extends BaseTest {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void save() {
        Employee employee = new Employee().setAge(19).setName("小米");
        employeeMapper.save(employee);
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findByQuery() {
    }

    @Test
    public void findCount() {
    }
}