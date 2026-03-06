package com.sdkwork.backend.model;

public class AppStoreListingConfig {
    private String platform;
    private String storeAppId;
    private String packageName;
    private String bundleId;
    private String releaseTrack;
    private String privacyPolicyUrl;
    private String termsOfServiceUrl;
    private String supportUrl;
    private String supportEmail;
    private String marketingUrl;
    private String category;
    private String subcategory;
    private String contentRating;
    private List<String> languages;
    private List<String> countries;
    private List<String> screenshotUrls;

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getStoreAppId() {
        return this.storeAppId;
    }
    
    public void setStoreAppId(String storeAppId) {
        this.storeAppId = storeAppId;
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

    public String getReleaseTrack() {
        return this.releaseTrack;
    }
    
    public void setReleaseTrack(String releaseTrack) {
        this.releaseTrack = releaseTrack;
    }

    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }
    
    public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    public String getTermsOfServiceUrl() {
        return this.termsOfServiceUrl;
    }
    
    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getSupportUrl() {
        return this.supportUrl;
    }
    
    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    public String getSupportEmail() {
        return this.supportEmail;
    }
    
    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    public String getMarketingUrl() {
        return this.marketingUrl;
    }
    
    public void setMarketingUrl(String marketingUrl) {
        this.marketingUrl = marketingUrl;
    }

    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return this.subcategory;
    }
    
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getContentRating() {
        return this.contentRating;
    }
    
    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public List<String> getLanguages() {
        return this.languages;
    }
    
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getCountries() {
        return this.countries;
    }
    
    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getScreenshotUrls() {
        return this.screenshotUrls;
    }
    
    public void setScreenshotUrls(List<String> screenshotUrls) {
        this.screenshotUrls = screenshotUrls;
    }
}
