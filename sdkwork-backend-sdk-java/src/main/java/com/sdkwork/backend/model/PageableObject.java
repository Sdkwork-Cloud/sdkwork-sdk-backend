package com.sdkwork.backend.model;

public class PageableObject {
    private Integer offset;
    private Boolean paged;
    private SortObject sort;
    private Integer pageNumber;
    private Integer pageSize;
    private Boolean unpaged;

    public Integer getOffset() {
        return this.offset;
    }
    
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Boolean getPaged() {
        return this.paged;
    }
    
    public void setPaged(Boolean paged) {
        this.paged = paged;
    }

    public SortObject getSort() {
        return this.sort;
    }
    
    public void setSort(SortObject sort) {
        this.sort = sort;
    }

    public Integer getPageNumber() {
        return this.pageNumber;
    }
    
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }
    
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getUnpaged() {
        return this.unpaged;
    }
    
    public void setUnpaged(Boolean unpaged) {
        this.unpaged = unpaged;
    }
}
