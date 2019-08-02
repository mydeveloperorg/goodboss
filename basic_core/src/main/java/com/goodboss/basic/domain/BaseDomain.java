package com.goodboss.basic.domain;

public class BaseDomain {
    private Long id;

    public Long getId() {
        return id;
    }

    public BaseDomain setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                '}';
    }
}
