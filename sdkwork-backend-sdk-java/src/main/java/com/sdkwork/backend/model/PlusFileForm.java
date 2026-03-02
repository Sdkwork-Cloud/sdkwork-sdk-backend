package com.sdkwork.backend.model;

public class PlusFileForm {
    private String name;
    private String path;
    private String objectKey;
    private Integer size;
    private String contentType;
    private String extension;
    private String storageClass;
    private String versionId;
    private FileMediaResource resource;
    private String uploadTime;
    private String lastAccessTime;
    private String description;
    private TagsContent tags;
    private String fileType;
    private String fileCategory;
    private Boolean isPublic;
    private String status;
    private Integer parentId;
    private String etag;

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

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getEtag() {
        return this.etag;
    }
    
    public void setEtag(String etag) {
        this.etag = etag;
    }
}
