package com.sdkwork.backend.model;

public class PlusArticleForm {
    private String title;
    private String subtitle;
    private String content;
    private Integer categoryId;
    private Integer wordCount;
    private Integer readingTime;
    private ImageMediaResourceList coverImages;
    private AuthorInfo author;
    private String source;
    private String status;
    private List<String> keywords;
    private String summary;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }
    
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getWordCount() {
        return this.wordCount;
    }
    
    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public Integer getReadingTime() {
        return this.readingTime;
    }
    
    public void setReadingTime(Integer readingTime) {
        this.readingTime = readingTime;
    }

    public ImageMediaResourceList getCoverImages() {
        return this.coverImages;
    }
    
    public void setCoverImages(ImageMediaResourceList coverImages) {
        this.coverImages = coverImages;
    }

    public AuthorInfo getAuthor() {
        return this.author;
    }
    
    public void setAuthor(AuthorInfo author) {
        this.author = author;
    }

    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getKeywords() {
        return this.keywords;
    }
    
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }
}
