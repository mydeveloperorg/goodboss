package com.goodboss.util;

import java.util.List;

public class UIPage<T> {
    private Long total;
    private List<T> rows;

    public Long getTotal() {
        return total;
    }

    public UIPage setTotal(Long total) {
        this.total = total;
        return this;
    }

    public List<T> getRows() {
        return rows;
    }

    public UIPage setRows(List<T> rows) {
        this.rows = rows;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}

