package com.sdkwork.backend.model;

public class PlusDiskForm {
    private String name;
    private String type;
    private String owner;
    private Integer ownerId;
    private Integer diskSize;
    private Integer usedSize;
    private String description;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
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
}
