package com.sdkwork.backend.model;

public class PagePlusNotesVO {
    private Integer totalPages;
    private Integer totalElements;
    private Integer size;
    private List<PlusNotesVO> content;
    private Integer number;
    private SortObject sort;
    private Boolean first;
    private Boolean last;
    private Integer numberOfElements;
    private PageableObject pageable;
    private Boolean empty;

    public Integer getTotalPages() {
        return this.totalPages;
    }
    
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalElements() {
        return this.totalElements;
    }
    
    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }

    public List<PlusNotesVO> getContent() {
        return this.content;
    }
    
    public void setContent(List<PlusNotesVO> content) {
        this.content = content;
    }

    public Integer getNumber() {
        return this.number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }

    public SortObject getSort() {
        return this.sort;
    }
    
    public void setSort(SortObject sort) {
        this.sort = sort;
    }

    public Boolean getFirst() {
        return this.first;
    }
    
    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Boolean getLast() {
        return this.last;
    }
    
    public void setLast(Boolean last) {
        this.last = last;
    }

    public Integer getNumberOfElements() {
        return this.numberOfElements;
    }
    
    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public PageableObject getPageable() {
        return this.pageable;
    }
    
    public void setPageable(PageableObject pageable) {
        this.pageable = pageable;
    }

    public Boolean getEmpty() {
        return this.empty;
    }
    
    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }
}
