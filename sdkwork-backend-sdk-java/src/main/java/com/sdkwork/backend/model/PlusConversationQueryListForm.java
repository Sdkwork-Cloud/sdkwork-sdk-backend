package com.sdkwork.backend.model;

public class PlusConversationQueryListForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Boolean initDefaults;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedAtFrom() {
        return this.createdAtFrom;
    }
    
    public void setCreatedAtFrom(String createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public String getCreatedAtTo() {
        return this.createdAtTo;
    }
    
    public void setCreatedAtTo(String createdAtTo) {
        this.createdAtTo = createdAtTo;
    }

    public Boolean getInitDefaults() {
        return this.initDefaults;
    }
    
    public void setInitDefaults(Boolean initDefaults) {
        this.initDefaults = initDefaults;
    }
}
