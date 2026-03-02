package com.sdkwork.backend.model;

public class PlusGetPresignedUrlForm {
    private String provider;
    private String name;
    private String scene;
    private BucketObject bucket;
    private String method;
    private Integer expirationSeconds;

    public String getProvider() {
        return this.provider;
    }
    
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getScene() {
        return this.scene;
    }
    
    public void setScene(String scene) {
        this.scene = scene;
    }

    public BucketObject getBucket() {
        return this.bucket;
    }
    
    public void setBucket(BucketObject bucket) {
        this.bucket = bucket;
    }

    public String getMethod() {
        return this.method;
    }
    
    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getExpirationSeconds() {
        return this.expirationSeconds;
    }
    
    public void setExpirationSeconds(Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }
}
