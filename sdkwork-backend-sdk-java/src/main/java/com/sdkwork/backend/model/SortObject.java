package com.sdkwork.backend.model;

public class SortObject {
    private Boolean empty;
    private Boolean sorted;
    private Boolean unsorted;

    public Boolean getEmpty() {
        return this.empty;
    }
    
    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public Boolean getSorted() {
        return this.sorted;
    }
    
    public void setSorted(Boolean sorted) {
        this.sorted = sorted;
    }

    public Boolean getUnsorted() {
        return this.unsorted;
    }
    
    public void setUnsorted(Boolean unsorted) {
        this.unsorted = unsorted;
    }
}
