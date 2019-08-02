package com.goodboss.query;


import com.goodboss.basic.query.BaseQuery;

public class EmployeeQuery extends BaseQuery {
    private String name;

    public String getName() {
        return name;
    }

    public EmployeeQuery setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EmployeeQuery setCurrentPage(int currentPage) {
        super.setCurrentPage(currentPage);
        return this;
    }

    @Override
    public EmployeeQuery setPageSize(int pageSize) {
        super.setPageSize(pageSize);
        return this;
    }

    @Override
    public EmployeeQuery setSortFiled(String sortFiled) {
        super.setSortFiled(sortFiled);
        return this;
    }

    @Override
    public EmployeeQuery setSortRule(String sortRule) {
        super.setSortRule(sortRule);
        return this;
    }

    @Override
    public String toString() {
        return "EmployeeQuery{" + super.toString() + "," +
                "name='" + name + '\'' +
                '}';
    }
}
