package com.sdkwork.backend.model;

public class PlusMediaPublishItemResultDTO {
    private Integer recordId;
    private Integer noteId;
    private String noteUuid;
    private String title;
    private Integer articleIndex;
    private Boolean success;
    private Integer errcode;
    private String errmsg;
    private String draftMediaId;
    private String publishId;
    private String articleId;

    public Integer getRecordId() {
        return this.recordId;
    }
    
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getNoteId() {
        return this.noteId;
    }
    
    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getNoteUuid() {
        return this.noteUuid;
    }
    
    public void setNoteUuid(String noteUuid) {
        this.noteUuid = noteUuid;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getArticleIndex() {
        return this.articleIndex;
    }
    
    public void setArticleIndex(Integer articleIndex) {
        this.articleIndex = articleIndex;
    }

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getErrcode() {
        return this.errcode;
    }
    
    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return this.errmsg;
    }
    
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getDraftMediaId() {
        return this.draftMediaId;
    }
    
    public void setDraftMediaId(String draftMediaId) {
        this.draftMediaId = draftMediaId;
    }

    public String getPublishId() {
        return this.publishId;
    }
    
    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public String getArticleId() {
        return this.articleId;
    }
    
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }
}
