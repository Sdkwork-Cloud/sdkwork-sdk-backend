package com.sdkwork.backend.model;

public class PlusTempSessionVO {
    private Integer fileId;
    private String tmpAccessKeyId;
    private String tmpAccessKeySecret;
    private String sessionToken;
    private Integer expirationSeconds;
    private String uploadUrl;
    private String objectKey;
    private BucketObject bucket;
    private String createTime;

    public Integer getFileId() {
        return this.fileId;
    }
    
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getTmpAccessKeyId() {
        return this.tmpAccessKeyId;
    }
    
    public void setTmpAccessKeyId(String tmpAccessKeyId) {
        this.tmpAccessKeyId = tmpAccessKeyId;
    }

    public String getTmpAccessKeySecret() {
        return this.tmpAccessKeySecret;
    }
    
    public void setTmpAccessKeySecret(String tmpAccessKeySecret) {
        this.tmpAccessKeySecret = tmpAccessKeySecret;
    }

    public String getSessionToken() {
        return this.sessionToken;
    }
    
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Integer getExpirationSeconds() {
        return this.expirationSeconds;
    }
    
    public void setExpirationSeconds(Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    public String getUploadUrl() {
        return this.uploadUrl;
    }
    
    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public String getObjectKey() {
        return this.objectKey;
    }
    
    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public BucketObject getBucket() {
        return this.bucket;
    }
    
    public void setBucket(BucketObject bucket) {
        this.bucket = bucket;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
