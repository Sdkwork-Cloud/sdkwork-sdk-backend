package com.sdkwork.backend.model;

public class UseTool {
    private Integer id;
    private String name;
    private String description;
    private Boolean enable;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
