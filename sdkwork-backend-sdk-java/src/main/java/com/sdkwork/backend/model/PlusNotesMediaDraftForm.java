package com.sdkwork.backend.model;

public class PlusNotesMediaDraftForm {
    private Integer userId;
    private String platform;
    private String product;
    private List<PlusNotesPublishArticleForm> articles;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }

    public List<PlusNotesPublishArticleForm> getArticles() {
        return this.articles;
    }
    
    public void setArticles(List<PlusNotesPublishArticleForm> articles) {
        this.articles = articles;
    }
}
