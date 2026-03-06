package com.sdkwork.backend.model;

public class PlusNotesForm {
    private Integer id;
    private String title;
    private String content;
    private Integer userId;
    private Integer categoryId;
    private String tags;
    private String accessScope;
    private String password;
    private ImageMediaResource coverImage;
    private String status;
    private String remark;
    private Integer diskId;
    private Integer parentId;
    private String type;
    private TagsContent tagsAsTagsContent;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTags() {
        return this.tags;
    }
    
    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getAccessScope() {
        return this.accessScope;
    }
    
    public void setAccessScope(String accessScope) {
        this.accessScope = accessScope;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public ImageMediaResource getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(ImageMediaResource coverImage) {
        this.coverImage = coverImage;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(Integer diskId) {
        this.diskId = diskId;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public TagsContent getTagsAsTagsContent() {
        return this.tagsAsTagsContent;
    }
    
    public void setTagsAsTagsContent(TagsContent tagsAsTagsContent) {
        this.tagsAsTagsContent = tagsAsTagsContent;
    }
}
