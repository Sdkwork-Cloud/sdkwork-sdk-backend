package com.sdkwork.backend.model;

public class AssetReference {
    private Integer fileId;
    private String fileUuid;
    private String filePath;
    private String assetType;
    private String mimeType;
    private String url;

    public Integer getFileId() {
        return this.fileId;
    }
    
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileUuid() {
        return this.fileUuid;
    }
    
    public void setFileUuid(String fileUuid) {
        this.fileUuid = fileUuid;
    }

    public String getFilePath() {
        return this.filePath;
    }
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getAssetType() {
        return this.assetType;
    }
    
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getMimeType() {
        return this.mimeType;
    }
    
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
}
