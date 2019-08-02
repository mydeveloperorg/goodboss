package com.goodboss.domain;


import com.goodboss.basic.domain.BaseDomain;

public class Employee extends BaseDomain {
    private String name;
    private String password;
    private Integer age;
    private Dept dept;

    @Override
    public Employee setId(Long id) {
        super.setId(id);
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Employee setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Employee setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Dept getDept() {
        return dept;
    }

    public Employee setDept(Dept dept) {
        this.dept = dept;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + "," +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                '}';
    }
}
