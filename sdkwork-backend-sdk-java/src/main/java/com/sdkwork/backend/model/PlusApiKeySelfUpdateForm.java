package com.sdkwork.backend.model;

public class PlusApiKeySelfUpdateForm {
    private String name;
    private String expireTime;
    private Boolean clearExpireTime;
    private String description;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public Boolean getClearExpireTime() {
        return this.clearExpireTime;
    }
    
    public void setClearExpireTime(Boolean clearExpireTime) {
        this.clearExpireTime = clearExpireTime;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
