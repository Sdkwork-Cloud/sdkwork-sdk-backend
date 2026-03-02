package com.sdkwork.backend.model;

public class FileItemVO {
    private String id;
    private String object;
    private Integer bytes;
    private Integer createdAt;
    private String filename;
    private String purpose;
    private Integer expiresAt;
    private String status;
    private String statusDetails;
    private Boolean deleted;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }

    public Integer getBytes() {
        return this.bytes;
    }
    
    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public Integer getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getPurpose() {
        return this.purpose;
    }
    
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Integer getExpiresAt() {
        return this.expiresAt;
    }
    
    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDetails() {
        return this.statusDetails;
    }
    
    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
