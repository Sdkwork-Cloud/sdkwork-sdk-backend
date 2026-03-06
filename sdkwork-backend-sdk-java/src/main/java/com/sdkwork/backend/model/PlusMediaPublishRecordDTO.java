package com.sdkwork.backend.model;

public class PlusMediaPublishRecordDTO {
    private Integer id;
    private String uuid;
    private String createdAt;
    private String updatedAt;
    private Integer version;
    private String batchId;
    private Integer userId;
    private Integer noteId;
    private String noteUuid;
    private String noteTitle;
    private String platform;
    private String action;
    private String status;
    private String draftMediaId;
    private String publishId;
    private String articleId;
    private Integer articleIndex;
    private Integer errcode;
    private String errmsg;
    private Map<String, Object> requestPayload;
    private Map<String, Object> responsePayload;
    private String startedAt;
    private String finishedAt;

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

    public Integer getVersion() {
        return this.version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getNoteTitle() {
        return this.noteTitle;
    }
    
    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
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

    public Integer getArticleIndex() {
        return this.articleIndex;
    }
    
    public void setArticleIndex(Integer articleIndex) {
        this.articleIndex = articleIndex;
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

    public Map<String, Object> getRequestPayload() {
        return this.requestPayload;
    }
    
    public void setRequestPayload(Map<String, Object> requestPayload) {
        this.requestPayload = requestPayload;
    }

    public Map<String, Object> getResponsePayload() {
        return this.responsePayload;
    }
    
    public void setResponsePayload(Map<String, Object> responsePayload) {
        this.responsePayload = responsePayload;
    }

    public String getStartedAt() {
        return this.startedAt;
    }
    
    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getFinishedAt() {
        return this.finishedAt;
    }
    
    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }
}
