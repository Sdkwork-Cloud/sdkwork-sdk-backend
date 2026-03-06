package com.sdkwork.backend.model;

public class PlusAppForm {
    private String name;
    private ImageMediaResource icon;
    private AssetMediaResourceList resourceList;
    private Integer projectId;
    private String description;
    private String version;
    private String iconUrl;
    private String accessUrl;
    private AppConfig config;
    private String status;
    private String appType;
    private AppPlatforms platforms;
    private AppPlatforms installPlatforms;
    private AppInstallSkill installSkill;
    private AppInstallConfig installConfig;
    private String packageName;
    private String bundleId;
    private String storeUrl;
    private String downloadUrl;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
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

    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
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

    public AppConfig getConfig() {
        return this.config;
    }
    
    public void setConfig(AppConfig config) {
        this.config = config;
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

    public AppPlatforms getInstallPlatforms() {
        return this.installPlatforms;
    }
    
    public void setInstallPlatforms(AppPlatforms installPlatforms) {
        this.installPlatforms = installPlatforms;
    }

    public AppInstallSkill getInstallSkill() {
        return this.installSkill;
    }
    
    public void setInstallSkill(AppInstallSkill installSkill) {
        this.installSkill = installSkill;
    }

    public AppInstallConfig getInstallConfig() {
        return this.installConfig;
    }
    
    public void setInstallConfig(AppInstallConfig installConfig) {
        this.installConfig = installConfig;
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
}
