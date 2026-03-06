package com.sdkwork.backend.model;

public class ContentStatsVO {
    private Integer wordCount;
    private Integer chapterCount;
    private Integer fileSize;

    public Integer getWordCount() {
        return this.wordCount;
    }
    
    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public Integer getChapterCount() {
        return this.chapterCount;
    }
    
    public void setChapterCount(Integer chapterCount) {
        this.chapterCount = chapterCount;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
