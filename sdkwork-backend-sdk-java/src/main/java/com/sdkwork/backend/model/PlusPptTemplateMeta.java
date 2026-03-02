package com.sdkwork.backend.model;

public class PlusPptTemplateMeta {
    private String payloadUrl;
    private List<String> previewUrls;

    public String getPayloadUrl() {
        return this.payloadUrl;
    }
    
    public void setPayloadUrl(String payloadUrl) {
        this.payloadUrl = payloadUrl;
    }

    public List<String> getPreviewUrls() {
        return this.previewUrls;
    }
    
    public void setPreviewUrls(List<String> previewUrls) {
        this.previewUrls = previewUrls;
    }
}
