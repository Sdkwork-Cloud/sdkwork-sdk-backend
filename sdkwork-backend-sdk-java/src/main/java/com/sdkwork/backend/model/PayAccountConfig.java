package com.sdkwork.backend.model;

public class PayAccountConfig {
    private Integer id;
    private String uuid;
    private String region;
    private Integer weight;
    private String channel;
    private String product;
    private List<String> functions;
    private AccountConfigMetadata metadata;
    private Map<String, Object> properties;
    private String merchantId;
    private String appId;
    private String privateKey;
    private String publicKey;
    private String secretKey;
    private String notifyUrl;
    private String returnUrl;
    private String gatewayUrl;
    private String payType;

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

    public String getMerchantId() {
        return this.merchantId;
    }
    
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getAppId() {
        return this.appId;
    }
    
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }
    
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return this.publicKey;
    }
    
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getSecretKey() {
        return this.secretKey;
    }
    
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }
    
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }
    
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getGatewayUrl() {
        return this.gatewayUrl;
    }
    
    public void setGatewayUrl(String gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }

    public String getPayType() {
        return this.payType;
    }
    
    public void setPayType(String payType) {
        this.payType = payType;
    }
}
