package com.sdkwork.backend.model;

public class OfficialAccountConfig {
    private Integer id;
    private String uuid;
    private String region;
    private Integer weight;
    private String channel;
    private String product;
    private List<String> functions;
    private AccountConfigMetadata metadata;
    private Map<String, Object> properties;
    private String authProvider;
    private String appId;
    private String appSecret;
    private String token;
    private String redirectUri;
    private String scope;
    private Boolean isServiceAccount;
    private String teamId;
    private String keyId;
    private String privateKey;
    private String publicKey;
    private String secret;
    private String aesKey;
    private String qrCodeUrl;
    private String originalId;
    private String notifyUrl;
    private Boolean securityModeEnabled;
    private String accessToken;
    private Integer accessTokenExpiresIn;
    private Integer accessTokenFetchTime;
    private Boolean jsSdkEnabled;
    private String jsApiDomain;
    private String encodingAESKey;

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

    public String getAuthProvider() {
        return this.authProvider;
    }
    
    public void setAuthProvider(String authProvider) {
        this.authProvider = authProvider;
    }

    public String getAppId() {
        return this.appId;
    }
    
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return this.appSecret;
    }
    
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }

    public String getRedirectUri() {
        return this.redirectUri;
    }
    
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getScope() {
        return this.scope;
    }
    
    public void setScope(String scope) {
        this.scope = scope;
    }

    public Boolean getIsServiceAccount() {
        return this.isServiceAccount;
    }
    
    public void setIsServiceAccount(Boolean isServiceAccount) {
        this.isServiceAccount = isServiceAccount;
    }

    public String getTeamId() {
        return this.teamId;
    }
    
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getKeyId() {
        return this.keyId;
    }
    
    public void setKeyId(String keyId) {
        this.keyId = keyId;
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

    public String getSecret() {
        return this.secret;
    }
    
    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getAesKey() {
        return this.aesKey;
    }
    
    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }
    
    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }

    public String getOriginalId() {
        return this.originalId;
    }
    
    public void setOriginalId(String originalId) {
        this.originalId = originalId;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }
    
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Boolean getSecurityModeEnabled() {
        return this.securityModeEnabled;
    }
    
    public void setSecurityModeEnabled(Boolean securityModeEnabled) {
        this.securityModeEnabled = securityModeEnabled;
    }

    public String getAccessToken() {
        return this.accessToken;
    }
    
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getAccessTokenExpiresIn() {
        return this.accessTokenExpiresIn;
    }
    
    public void setAccessTokenExpiresIn(Integer accessTokenExpiresIn) {
        this.accessTokenExpiresIn = accessTokenExpiresIn;
    }

    public Integer getAccessTokenFetchTime() {
        return this.accessTokenFetchTime;
    }
    
    public void setAccessTokenFetchTime(Integer accessTokenFetchTime) {
        this.accessTokenFetchTime = accessTokenFetchTime;
    }

    public Boolean getJsSdkEnabled() {
        return this.jsSdkEnabled;
    }
    
    public void setJsSdkEnabled(Boolean jsSdkEnabled) {
        this.jsSdkEnabled = jsSdkEnabled;
    }

    public String getJsApiDomain() {
        return this.jsApiDomain;
    }
    
    public void setJsApiDomain(String jsApiDomain) {
        this.jsApiDomain = jsApiDomain;
    }

    public String getEncodingAESKey() {
        return this.encodingAESKey;
    }
    
    public void setEncodingAESKey(String encodingAESKey) {
        this.encodingAESKey = encodingAESKey;
    }
}
