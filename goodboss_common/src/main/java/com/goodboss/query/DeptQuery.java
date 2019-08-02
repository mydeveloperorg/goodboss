package com.goodboss.query;


import com.goodboss.basic.query.BaseQuery;


public class DeptQuery extends BaseQuery {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeptQuery{" + super.toString() + "," +
                "name='" + name + '\'' +
                '}';
    }
}
