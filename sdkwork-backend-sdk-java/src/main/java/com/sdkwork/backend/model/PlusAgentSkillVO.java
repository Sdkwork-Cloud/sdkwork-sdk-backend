package com.sdkwork.backend.model;

public class PlusAgentSkillVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer tenantId;
    private Integer organizationId;
    private Integer userId;
    private String skillKey;
    private String name;
    private String summary;
    private String description;
    private String icon;
    private String coverImage;
    private Integer categoryId;
    private String categoryName;
    private Integer packageId;
    private String packageName;
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
    private String marketStatus;
    private String visibility;
    private String reviewStatus;
    private String reviewComment;
    private Integer reviewedBy;
    private String reviewedAt;
    private Boolean builtin;
    private Boolean enabled;
    private Boolean featured;
    private Integer recommendWeight;
    private Double price;
    private String currency;
    private Integer installCount;
    private Double ratingAvg;
    private Integer ratingCount;
    private List<String> tags;
    private List<String> capabilities;
    private Map<String, Object> configSchema;
    private Map<String, Object> defaultConfig;
    private String latestPublishedAt;

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

    public Integer getTenantId() {
        return this.tenantId;
    }
    
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getOrganizationId() {
        return this.organizationId;
    }
    
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

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

    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getPackageId() {
        return this.packageId;
    }
    
    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return this.packageName;
    }
    
    public void setPackageName(String packageName) {
        this.packageName = packageName;
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

    public String getMarketStatus() {
        return this.marketStatus;
    }
    
    public void setMarketStatus(String marketStatus) {
        this.marketStatus = marketStatus;
    }

    public String getVisibility() {
        return this.visibility;
    }
    
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getReviewStatus() {
        return this.reviewStatus;
    }
    
    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getReviewComment() {
        return this.reviewComment;
    }
    
    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    public Integer getReviewedBy() {
        return this.reviewedBy;
    }
    
    public void setReviewedBy(Integer reviewedBy) {
        this.reviewedBy = reviewedBy;
    }

    public String getReviewedAt() {
        return this.reviewedAt;
    }
    
    public void setReviewedAt(String reviewedAt) {
        this.reviewedAt = reviewedAt;
    }

    public Boolean getBuiltin() {
        return this.builtin;
    }
    
    public void setBuiltin(Boolean builtin) {
        this.builtin = builtin;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getFeatured() {
        return this.featured;
    }
    
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Integer getRecommendWeight() {
        return this.recommendWeight;
    }
    
    public void setRecommendWeight(Integer recommendWeight) {
        this.recommendWeight = recommendWeight;
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

    public Integer getInstallCount() {
        return this.installCount;
    }
    
    public void setInstallCount(Integer installCount) {
        this.installCount = installCount;
    }

    public Double getRatingAvg() {
        return this.ratingAvg;
    }
    
    public void setRatingAvg(Double ratingAvg) {
        this.ratingAvg = ratingAvg;
    }

    public Integer getRatingCount() {
        return this.ratingCount;
    }
    
    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
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

    public String getLatestPublishedAt() {
        return this.latestPublishedAt;
    }
    
    public void setLatestPublishedAt(String latestPublishedAt) {
        this.latestPublishedAt = latestPublishedAt;
    }
}
