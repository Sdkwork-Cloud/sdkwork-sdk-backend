package com.sdkwork.backend.model;

public class PlusAiModelInfoQueryListForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private String keyword;
    private String channel;
    private String modelType;
    private String status;
    private String family;
    private Boolean openSource;

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

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getModelType() {
        return this.modelType;
    }
    
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getFamily() {
        return this.family;
    }
    
    public void setFamily(String family) {
        this.family = family;
    }

    public Boolean getOpenSource() {
        return this.openSource;
    }
    
    public void setOpenSource(Boolean openSource) {
        this.openSource = openSource;
    }
}
