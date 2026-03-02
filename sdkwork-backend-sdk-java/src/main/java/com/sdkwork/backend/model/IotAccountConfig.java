package com.sdkwork.backend.model;

public class IotAccountConfig {
    private Integer id;
    private String uuid;
    private String region;
    private Integer weight;
    private String channel;
    private String product;
    private List<String> functions;
    private AccountConfigMetadata metadata;
    private Map<String, Object> properties;
    private List<IotTransportConfig> transports;
    private String firmwareDownloadUrl;
    private String otaUpgradeUrl;
    private String deviceRegistryUrl;
    private String certificatePath;
    private String privateKeyPath;
    private String caCertificatePath;
    private Integer reportingInterval;
    private Integer maxRetryAttempts;
    private Integer retryInterval;

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

    public List<IotTransportConfig> getTransports() {
        return this.transports;
    }
    
    public void setTransports(List<IotTransportConfig> transports) {
        this.transports = transports;
    }

    public String getFirmwareDownloadUrl() {
        return this.firmwareDownloadUrl;
    }
    
    public void setFirmwareDownloadUrl(String firmwareDownloadUrl) {
        this.firmwareDownloadUrl = firmwareDownloadUrl;
    }

    public String getOtaUpgradeUrl() {
        return this.otaUpgradeUrl;
    }
    
    public void setOtaUpgradeUrl(String otaUpgradeUrl) {
        this.otaUpgradeUrl = otaUpgradeUrl;
    }

    public String getDeviceRegistryUrl() {
        return this.deviceRegistryUrl;
    }
    
    public void setDeviceRegistryUrl(String deviceRegistryUrl) {
        this.deviceRegistryUrl = deviceRegistryUrl;
    }

    public String getCertificatePath() {
        return this.certificatePath;
    }
    
    public void setCertificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
    }

    public String getPrivateKeyPath() {
        return this.privateKeyPath;
    }
    
    public void setPrivateKeyPath(String privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
    }

    public String getCaCertificatePath() {
        return this.caCertificatePath;
    }
    
    public void setCaCertificatePath(String caCertificatePath) {
        this.caCertificatePath = caCertificatePath;
    }

    public Integer getReportingInterval() {
        return this.reportingInterval;
    }
    
    public void setReportingInterval(Integer reportingInterval) {
        this.reportingInterval = reportingInterval;
    }

    public Integer getMaxRetryAttempts() {
        return this.maxRetryAttempts;
    }
    
    public void setMaxRetryAttempts(Integer maxRetryAttempts) {
        this.maxRetryAttempts = maxRetryAttempts;
    }

    public Integer getRetryInterval() {
        return this.retryInterval;
    }
    
    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }
}
