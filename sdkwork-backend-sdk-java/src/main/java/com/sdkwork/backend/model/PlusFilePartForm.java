package com.sdkwork.backend.model;

public class PlusFilePartForm {
    private Integer fileId;
    private Integer chunkIndex;
    private Integer chunkSize;
    private Integer totalSize;
    private String checksum;
    private Integer status;
    private String storagePath;

    public Integer getFileId() {
        return this.fileId;
    }
    
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getChunkIndex() {
        return this.chunkIndex;
    }
    
    public void setChunkIndex(Integer chunkIndex) {
        this.chunkIndex = chunkIndex;
    }

    public Integer getChunkSize() {
        return this.chunkSize;
    }
    
    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    public Integer getTotalSize() {
        return this.totalSize;
    }
    
    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public String getChecksum() {
        return this.checksum;
    }
    
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStoragePath() {
        return this.storagePath;
    }
    
    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }
}
