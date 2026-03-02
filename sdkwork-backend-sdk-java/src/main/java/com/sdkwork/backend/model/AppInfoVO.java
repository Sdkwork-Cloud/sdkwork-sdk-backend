package com.sdkwork.backend.model;

public class AppInfoVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private String version;
    private String description;
    private Integer projectId;
    private ImageMediaResource icon;
    private AssetMediaResourceList resourceList;
    private String iconUrl;
    private String accessUrl;
    private String status;
    private String appType;
    private AppPlatforms platforms;
    private String packageName;
    private String bundleId;
    private String storeUrl;
    private String downloadUrl;
    private String buildTime;
    private String startTime;
    private String environment;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public ImageMediaResource getIcon() {
        return this.icon;
    }
    
    public void setIcon(ImageMediaResource icon) {
        this.icon = icon;
    }

    public AssetMediaResourceList getResourceList() {
        return this.resourceList;
    }
    
    public void setResourceList(AssetMediaResourceList resourceList) {
        this.resourceList = resourceList;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }
    
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getAccessUrl() {
        return this.accessUrl;
    }
    
    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppType() {
        return this.appType;
    }
    
    public void setAppType(String appType) {
        this.appType = appType;
    }

    public AppPlatforms getPlatforms() {
        return this.platforms;
    }
    
    public void setPlatforms(AppPlatforms platforms) {
        this.platforms = platforms;
    }

    public String getPackageName() {
        return this.packageName;
    }
    
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getBundleId() {
        return this.bundleId;
    }
    
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public String getStoreUrl() {
        return this.storeUrl;
    }
    
    public void setStoreUrl(String storeUrl) {
        this.storeUrl = storeUrl;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getBuildTime() {
        return this.buildTime;
    }
    
    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEnvironment() {
        return this.environment;
    }
    
    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
