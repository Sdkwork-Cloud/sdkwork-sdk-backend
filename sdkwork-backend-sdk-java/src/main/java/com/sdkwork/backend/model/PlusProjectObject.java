package com.sdkwork.backend.model;

public class PlusProjectObject {
    private String name;
    private String id;
    private String type;
    private String owner;
    private String lastModifiedTime;
    private String version;
    private TagsContent tags;
    private String description;
    private String author;
    private Integer diskId;
    private String title;
    private String uuid;
    private Integer ownerId;
    private String createdAt;
    private List<PlusFileObject> files;
    private String screenType;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
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

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    
    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(Integer diskId) {
        this.diskId = diskId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<PlusFileObject> getFiles() {
        return this.files;
    }
    
    public void setFiles(List<PlusFileObject> files) {
        this.files = files;
    }

    public String getScreenType() {
        return this.screenType;
    }
    
    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }
}
