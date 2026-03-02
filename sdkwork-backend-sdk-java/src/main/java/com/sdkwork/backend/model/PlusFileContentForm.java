package com.sdkwork.backend.model;

public class PlusFileContentForm {
    private Integer fileId;
    private String fileUuid;
    private String prompt;
    private String encoding;
    private FileContentObject content;

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
