package com.sdkwork.backend.model;

public class PPTBaseElement {
    private String id;
    private Integer left;
    private Integer top;
    private Boolean lock;
    private String groupId;
    private Integer width;
    private Integer height;
    private Integer rotate;
    private PPTElementLink link;
    private String name;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public Integer getLeft() {
        return this.left;
    }
    
    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getTop() {
        return this.top;
    }
    
    public void setTop(Integer top) {
        this.top = top;
    }

    public Boolean getLock() {
        return this.lock;
    }
    
    public void setLock(Boolean lock) {
        this.lock = lock;
    }

    public String getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getWidth() {
        return this.width;
    }
    
    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return this.height;
    }
    
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getRotate() {
        return this.rotate;
    }
    
    public void setRotate(Integer rotate) {
        this.rotate = rotate;
    }

    public PPTElementLink getLink() {
        return this.link;
    }
    
    public void setLink(PPTElementLink link) {
        this.link = link;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
