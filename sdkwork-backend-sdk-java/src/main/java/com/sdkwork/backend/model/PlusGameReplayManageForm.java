package com.sdkwork.backend.model;

public class PlusGameReplayManageForm {
    private String title;
    private Boolean publicVisible;
    private Boolean allowShare;
    private String status;
    private String coverUrl;
    private String expiredAt;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getPublicVisible() {
        return this.publicVisible;
    }
    
    public void setPublicVisible(Boolean publicVisible) {
        this.publicVisible = publicVisible;
    }

    public Boolean getAllowShare() {
        return this.allowShare;
    }
    
    public void setAllowShare(Boolean allowShare) {
        this.allowShare = allowShare;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }
    
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getExpiredAt() {
        return this.expiredAt;
    }
    
    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }
}
