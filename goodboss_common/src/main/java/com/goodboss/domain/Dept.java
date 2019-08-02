package com.goodboss.domain;


import com.goodboss.basic.domain.BaseDomain;

import java.util.ArrayList;
import java.util.List;

public class Dept extends BaseDomain {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Dept setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Dept setId(Long id) {
        super.setId(id);
        return this;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Dept setEmployees(List<Employee> employees) {
        this.employees = employees;
        return this;
    }

    @Override
    public String toString() {
        return "Dept{" + super.toString() + "," +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
