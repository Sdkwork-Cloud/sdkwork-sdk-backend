package com.sdkwork.backend.model;

public class PlusCommentsReplyForm {
    private String content;
    private Integer userId;

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
