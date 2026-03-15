package com.sdkwork.backend.model;

public class PlusOrderWorkerDispatchProfileVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private Integer userId;
    private String ratingLevel;
    private Boolean enabled;
    private Integer globalMaxInProgress;
    private OrderWorkerDispatchMetadata metadata;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRatingLevel() {
        return this.ratingLevel;
    }
    
    public void setRatingLevel(String ratingLevel) {
        this.ratingLevel = ratingLevel;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getGlobalMaxInProgress() {
        return this.globalMaxInProgress;
    }
    
    public void setGlobalMaxInProgress(Integer globalMaxInProgress) {
        this.globalMaxInProgress = globalMaxInProgress;
    }

    public OrderWorkerDispatchMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(OrderWorkerDispatchMetadata metadata) {
        this.metadata = metadata;
    }
}
