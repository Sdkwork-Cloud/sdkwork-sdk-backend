package com.sdkwork.backend.model;

public class PlusAgentSkillForm {
    private Integer userId;
    private String skillKey;
    private String name;
    private String summary;
    private String description;
    private String icon;
    private String coverImage;
    private Integer categoryId;
    private Integer packageId;
    private String provider;
    private String version;
    private String runtime;
    private String entrypoint;
    private String manifestUrl;
    private String repositoryUrl;
    private String homepageUrl;
    private String documentationUrl;
    private String licenseName;
    private String sourceType;
    private String visibility;
    private Boolean enabled;
    private Double price;
    private String currency;
    private List<String> tags;
    private List<String> capabilities;
    private Map<String, Object> configSchema;
    private Map<String, Object> defaultConfig;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSkillKey() {
        return this.skillKey;
    }
    
    public void setSkillKey(String skillKey) {
        this.skillKey = skillKey;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getPackageId() {
        return this.packageId;
    }
    
    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getProvider() {
        return this.provider;
    }
    
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public String getRuntime() {
        return this.runtime;
    }
    
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getEntrypoint() {
        return this.entrypoint;
    }
    
    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public String getManifestUrl() {
        return this.manifestUrl;
    }
    
    public void setManifestUrl(String manifestUrl) {
        this.manifestUrl = manifestUrl;
    }

    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public String getHomepageUrl() {
        return this.homepageUrl;
    }
    
    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    public String getDocumentationUrl() {
        return this.documentationUrl;
    }
    
    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    public String getLicenseName() {
        return this.licenseName;
    }
    
    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getSourceType() {
        return this.sourceType;
    }
    
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getVisibility() {
        return this.visibility;
    }
    
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getCapabilities() {
        return this.capabilities;
    }
    
    public void setCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
    }

    public Map<String, Object> getConfigSchema() {
        return this.configSchema;
    }
    
    public void setConfigSchema(Map<String, Object> configSchema) {
        this.configSchema = configSchema;
    }

    public Map<String, Object> getDefaultConfig() {
        return this.defaultConfig;
    }
    
    public void setDefaultConfig(Map<String, Object> defaultConfig) {
        this.defaultConfig = defaultConfig;
    }
}
