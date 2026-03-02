package com.sdkwork.backend.model;

public class PlusInvokeRecordVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String type;
    private String apiEndpoint;
    private String functionName;
    private Map<String, Object> requestParams;
    private Map<String, Object> headers;
    private String status;
    private Integer duration;
    private String errorMsg;
    private Integer userId;
    private String clientIp;
    private String clientLocation;
    private String userAgent;
    private String browserInfo;
    private String clientId;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getApiEndpoint() {
        return this.apiEndpoint;
    }
    
    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    public String getFunctionName() {
        return this.functionName;
    }
    
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Map<String, Object> getRequestParams() {
        return this.requestParams;
    }
    
    public void setRequestParams(Map<String, Object> requestParams) {
        this.requestParams = requestParams;
    }

    public Map<String, Object> getHeaders() {
        return this.headers;
    }
    
    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }
    
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getClientIp() {
        return this.clientIp;
    }
    
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getClientLocation() {
        return this.clientLocation;
    }
    
    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    public String getUserAgent() {
        return this.userAgent;
    }
    
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getBrowserInfo() {
        return this.browserInfo;
    }
    
    public void setBrowserInfo(String browserInfo) {
        this.browserInfo = browserInfo;
    }

    public String getClientId() {
        return this.clientId;
    }
    
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
