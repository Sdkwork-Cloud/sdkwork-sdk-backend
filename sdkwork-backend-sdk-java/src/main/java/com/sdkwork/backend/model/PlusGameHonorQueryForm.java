package com.sdkwork.backend.model;

public class PlusGameHonorQueryForm {
    private Integer userId;
    private String seasonKey;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSeasonKey() {
        return this.seasonKey;
    }
    
    public void setSeasonKey(String seasonKey) {
        this.seasonKey = seasonKey;
    }
}
