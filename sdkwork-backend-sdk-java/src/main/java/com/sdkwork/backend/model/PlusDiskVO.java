package com.sdkwork.backend.model;

public class PlusDiskVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String name;
    private String owner;
    private Integer ownerId;
    private Integer diskSize;
    private Integer usedSize;
    private String description;
    private Integer remainingSize;
    private Double usageRate;

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

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getDiskSize() {
        return this.diskSize;
    }
    
    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public Integer getUsedSize() {
        return this.usedSize;
    }
    
    public void setUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRemainingSize() {
        return this.remainingSize;
    }
    
    public void setRemainingSize(Integer remainingSize) {
        this.remainingSize = remainingSize;
    }

    public Double getUsageRate() {
        return this.usageRate;
    }
    
    public void setUsageRate(Double usageRate) {
        this.usageRate = usageRate;
    }
}
