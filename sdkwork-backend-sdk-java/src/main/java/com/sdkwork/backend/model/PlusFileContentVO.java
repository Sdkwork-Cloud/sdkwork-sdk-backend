package com.sdkwork.backend.model;

public class PlusFileContentVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer fileId;
    private String fileUuid;
    private String prompt;
    private String encoding;
    private FileContentObject content;

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

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getEncoding() {
        return this.encoding;
    }
    
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public FileContentObject getContent() {
        return this.content;
    }
    
    public void setContent(FileContentObject content) {
        this.content = content;
    }
}
