package com.sdkwork.backend.model;

public class GetUrlResult {
    private String url;
    private String previewUrl;
    private String objectKey;

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }
    
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getObjectKey() {
        return this.objectKey;
    }
    
    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }
}
