package com.sdkwork.backend.model;

public class PlusShoppingCartForm {
    private String owner;
    private Integer ownerId;
    private String name;
    private String description;
    private CartGroupList groupList;
    private String status;

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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public CartGroupList getGroupList() {
        return this.groupList;
    }
    
    public void setGroupList(CartGroupList groupList) {
        this.groupList = groupList;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
