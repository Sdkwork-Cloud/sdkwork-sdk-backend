package com.sdkwork.backend.model;

public class HttpApiDefinition {
    private String apiName;
    private String description;
    private String baseUrl;
    private String path;
    private String method;
    private Map<String, String> headers;
    private Map<String, Object> parameters;
    private String requestFormat;
    private String responseFormat;
    private Boolean authenticated;
    private Integer timeoutMillis;
    private String requestBodyFormat;
    private Map<String, Object> requestBody;
    private String authType;
    private Map<String, Object> authParams;

    public String getApiName() {
        return this.apiName;
    }
    
    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }
    
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }

    public String getMethod() {
        return this.method;
    }
    
    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }
    
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }
    
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public String getRequestFormat() {
        return this.requestFormat;
    }
    
    public void setRequestFormat(String requestFormat) {
        this.requestFormat = requestFormat;
    }

    public String getResponseFormat() {
        return this.responseFormat;
    }
    
    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public Boolean getAuthenticated() {
        return this.authenticated;
    }
    
    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    public Integer getTimeoutMillis() {
        return this.timeoutMillis;
    }
    
    public void setTimeoutMillis(Integer timeoutMillis) {
        this.timeoutMillis = timeoutMillis;
    }

    public String getRequestBodyFormat() {
        return this.requestBodyFormat;
    }
    
    public void setRequestBodyFormat(String requestBodyFormat) {
        this.requestBodyFormat = requestBodyFormat;
    }

    public Map<String, Object> getRequestBody() {
        return this.requestBody;
    }
    
    public void setRequestBody(Map<String, Object> requestBody) {
        this.requestBody = requestBody;
    }

    public String getAuthType() {
        return this.authType;
    }
    
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public Map<String, Object> getAuthParams() {
        return this.authParams;
    }
    
    public void setAuthParams(Map<String, Object> authParams) {
        this.authParams = authParams;
    }
}
