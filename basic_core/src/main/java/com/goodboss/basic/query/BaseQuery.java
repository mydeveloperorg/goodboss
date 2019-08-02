package com.goodboss.basic.query;


/**
 * @author chenxin
 */
public class BaseQuery {
    /*分页查询*/
    private int currentPage = 1;
    private int pageSize = 10;
    /*排序*/
    private String sortFiled;
    private String sortRule = "ASC";

    public int getCurrentPage() {
        return currentPage - 1;
    }

    public BaseQuery setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public BaseQuery setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getSortFiled() {
        return sortFiled;
    }

    public BaseQuery setSortFiled(String sortFiled) {
        this.sortFiled = sortFiled;
        return this;
    }

    public String getSortRule() {
        return sortRule;
    }

    public BaseQuery setSortRule(String sortRule) {
        this.sortRule = sortRule;
        return this;
    }

    public int getStartPage() {
        return (currentPage - 1) * pageSize;
    }

    /*分页兼容*/
    public BaseQuery setPage(int page) {
        this.currentPage = page;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", sortFiled='" + sortFiled + '\'' +
                ", sortRule='" + sortRule + '\'' +
                '}';
    }
}
