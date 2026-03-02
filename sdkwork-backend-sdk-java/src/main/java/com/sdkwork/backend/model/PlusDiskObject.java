package com.sdkwork.backend.model;

public class PlusDiskObject {
    private Integer id;
    private String uuid;
    private String owner;
    private Integer ownerId;
    private String name;
    private String type;
    private String description;
    private Integer diskSize;
    private Integer usedSize;

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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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
}
