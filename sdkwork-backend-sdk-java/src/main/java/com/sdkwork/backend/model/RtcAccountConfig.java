package com.sdkwork.backend.model;

public class RtcAccountConfig {
    private Integer id;
    private String uuid;
    private String region;
    private Integer weight;
    private String channel;
    private String product;
    private List<String> functions;
    private AccountConfigMetadata metadata;
    private Map<String, Object> properties;
    private String baseUrl;
    private String appId;
    private String accessKey;
    private String secretKey;
    private String signName;
    private String senderId;

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

    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getWeight() {
        return this.weight;
    }
    
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }

    public List<String> getFunctions() {
        return this.functions;
    }
    
    public void setFunctions(List<String> functions) {
        this.functions = functions;
    }

    public AccountConfigMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(AccountConfigMetadata metadata) {
        this.metadata = metadata;
    }

    public Map<String, Object> getProperties() {
        return this.properties;
    }
    
    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }
    
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getAppId() {
        return this.appId;
    }
    
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAccessKey() {
        return this.accessKey;
    }
    
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return this.secretKey;
    }
    
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getSignName() {
        return this.signName;
    }
    
    public void setSignName(String signName) {
        this.signName = signName;
    }

    public String getSenderId() {
        return this.senderId;
    }
    
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
}
