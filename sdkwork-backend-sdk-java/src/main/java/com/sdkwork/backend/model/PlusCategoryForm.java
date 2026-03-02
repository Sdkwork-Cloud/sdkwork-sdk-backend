package com.sdkwork.backend.model;

public class PlusCategoryForm {
    private String name;
    private String description;
    private String type;
    private String icon;
    private Integer sortWeight;
    private Integer parentId;
    private List<String> path;
    private Integer visible;
    private String status;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSortWeight() {
        return this.sortWeight;
    }
    
    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<String> getPath() {
        return this.path;
    }
    
    public void setPath(List<String> path) {
        this.path = path;
    }

    public Integer getVisible() {
        return this.visible;
    }
    
    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
