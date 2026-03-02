package com.sdkwork.backend.model;

public class Pageable {
    private Integer page;
    private Integer size;
    private List<String> sort;

    public Integer getPage() {
        return this.page;
    }
    
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }

    public List<String> getSort() {
        return this.sort;
    }
    
    public void setSort(List<String> sort) {
        this.sort = sort;
    }
}
