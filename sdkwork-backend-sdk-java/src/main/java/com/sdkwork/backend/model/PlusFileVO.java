package com.sdkwork.backend.model;

public class PlusFileVO {
    private String parentUuid;
    private PlusTreeParentMetadata parentMetadata;
    private Integer id;
    private Integer parentId;
    private String name;
    private String path;
    private String fullPath;
    private String objectKey;
    private Integer size;
    private String contentType;
    private String extension;
    private String storageClass;
    private String versionId;
    private FileMediaResource resource;
    private String url;
    private String uploadTime;
    private String lastAccessTime;
    private String description;
    private TagsContent tags;
    private String fileType;
    private String fileCategory;
    private FilePermission permission;
    private Boolean isPublic;
    private String pinnedAt;
    private String status;
    private FileContentObject content;
    private String etag;

    public String getParentUuid() {
        return this.parentUuid;
    }
    
    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    public PlusTreeParentMetadata getParentMetadata() {
        return this.parentMetadata;
    }
    
    public void setParentMetadata(PlusTreeParentMetadata parentMetadata) {
        this.parentMetadata = parentMetadata;
    }

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }

    public String getFullPath() {
        return this.fullPath;
    }
    
    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public String getObjectKey() {
        return this.objectKey;
    }
    
    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getExtension() {
        return this.extension;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getStorageClass() {
        return this.storageClass;
    }
    
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public String getVersionId() {
        return this.versionId;
    }
    
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public FileMediaResource getResource() {
        return this.resource;
    }
    
    public void setResource(FileMediaResource resource) {
        this.resource = resource;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUploadTime() {
        return this.uploadTime;
    }
    
    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getLastAccessTime() {
        return this.lastAccessTime;
    }
    
    public void setLastAccessTime(String lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public String getFileType() {
        return this.fileType;
    }
    
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileCategory() {
        return this.fileCategory;
    }
    
    public void setFileCategory(String fileCategory) {
        this.fileCategory = fileCategory;
    }

    public FilePermission getPermission() {
        return this.permission;
    }
    
    public void setPermission(FilePermission permission) {
        this.permission = permission;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getPinnedAt() {
        return this.pinnedAt;
    }
    
    public void setPinnedAt(String pinnedAt) {
        this.pinnedAt = pinnedAt;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public FileContentObject getContent() {
        return this.content;
    }
    
    public void setContent(FileContentObject content) {
        this.content = content;
    }

    public String getEtag() {
        return this.etag;
    }
    
    public void setEtag(String etag) {
        this.etag = etag;
    }
}
