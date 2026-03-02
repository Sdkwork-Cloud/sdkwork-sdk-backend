package com.sdkwork.backend.model;

public class PlusFileObject {
    private Integer id;
    private String uuid;
    private Integer diskId;
    private String name;
    private Integer size;
    private String path;
    private String relativePath;
    private String type;
    private String extension;
    private String lastModifiedTime;
    private String createdAt;
    private String versionId;
    private String description;
    private String projectUuid;
    private Integer projectId;
    private String owner;
    private Integer ownerId;
    private String author;
    private String prompt;
    private String content;
    private TagsContent tags;
    private Boolean readonly;
    private List<String> permission;
    private Integer referenceFileId;
    private List<PlusFileObject> children;

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

    public Integer getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(Integer diskId) {
        this.diskId = diskId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getExtension() {
        return this.extension;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    
    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getVersionId() {
        return this.versionId;
    }
    
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectUuid() {
        return this.projectUuid;
    }
    
    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
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

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public Boolean getReadonly() {
        return this.readonly;
    }
    
    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    public List<String> getPermission() {
        return this.permission;
    }
    
    public void setPermission(List<String> permission) {
        this.permission = permission;
    }

    public Integer getReferenceFileId() {
        return this.referenceFileId;
    }
    
    public void setReferenceFileId(Integer referenceFileId) {
        this.referenceFileId = referenceFileId;
    }

    public List<PlusFileObject> getChildren() {
        return this.children;
    }
    
    public void setChildren(List<PlusFileObject> children) {
        this.children = children;
    }
}
