package com.sdkwork.backend.model;

public class CreateChapterForm {
    private Integer contentWorkId;
    private Integer parentDirectoryId;
    private String fileName;
    private Boolean isDirectory;
    private String content;

    public Integer getContentWorkId() {
        return this.contentWorkId;
    }
    
    public void setContentWorkId(Integer contentWorkId) {
        this.contentWorkId = contentWorkId;
    }

    public Integer getParentDirectoryId() {
        return this.parentDirectoryId;
    }
    
    public void setParentDirectoryId(Integer parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
    }

    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Boolean getIsDirectory() {
        return this.isDirectory;
    }
    
    public void setIsDirectory(Boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
}
