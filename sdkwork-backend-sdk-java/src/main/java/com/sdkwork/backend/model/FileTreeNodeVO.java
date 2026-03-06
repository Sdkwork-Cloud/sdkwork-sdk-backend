package com.sdkwork.backend.model;

public class FileTreeNodeVO {
    private Integer id;
    private String uuid;
    private String name;
    private String type;
    private Boolean isDirectory;
    private String path;
    private String relativePath;
    private Integer size;
    private String content;
    private Integer parentId;
    private List<FileTreeNodeVO> children;
    private String createdAt;
    private String updatedAt;
    private String extension;
    private String description;
    private Boolean readOnly;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Boolean getIsDirectory() {
        return this.isDirectory;
    }
    
    public void setIsDirectory(Boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }

    public String getRelativePath() {
        return this.relativePath;
    }
    
    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<FileTreeNodeVO> getChildren() {
        return this.children;
    }
    
    public void setChildren(List<FileTreeNodeVO> children) {
        this.children = children;
    }

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

    public String getExtension() {
        return this.extension;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getReadOnly() {
        return this.readOnly;
    }
    
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }
}
