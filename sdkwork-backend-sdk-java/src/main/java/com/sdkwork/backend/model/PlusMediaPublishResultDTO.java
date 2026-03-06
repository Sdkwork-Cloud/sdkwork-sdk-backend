package com.sdkwork.backend.model;

public class PlusMediaPublishResultDTO {
    private String batchId;
    private String platform;
    private String action;
    private Boolean success;
    private Integer errcode;
    private String errmsg;
    private String draftMediaId;
    private String publishId;
    private String articleId;
    private Object previewData;
    private List<PlusMediaPublishItemResultDTO> items;

    public String getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(String batchId) {
        this.batchId = batchId;
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

    public Object getPreviewData() {
        return this.previewData;
    }
    
    public void setPreviewData(Object previewData) {
        this.previewData = previewData;
    }

    public List<PlusMediaPublishItemResultDTO> getItems() {
        return this.items;
    }
    
    public void setItems(List<PlusMediaPublishItemResultDTO> items) {
        this.items = items;
    }
}
