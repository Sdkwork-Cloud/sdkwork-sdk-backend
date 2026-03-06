package com.sdkwork.backend.model;

public class AppInstallPackage {
    private String id;
    private String name;
    private String sourceType;
    private String packageFormat;
    private String platform;
    private String url;
    private String repositoryUrl;
    private String branch;
    private String tag;
    private String commitId;
    private String checksumAlgorithm;
    private String checksum;
    private String architecture;
    private Integer sizeBytes;
    private Boolean enabled;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSourceType() {
        return this.sourceType;
    }
    
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getPackageFormat() {
        return this.packageFormat;
    }
    
    public void setPackageFormat(String packageFormat) {
        this.packageFormat = packageFormat;
    }

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public String getBranch() {
        return this.branch;
    }
    
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getTag() {
        return this.tag;
    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCommitId() {
        return this.commitId;
    }
    
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public String getChecksumAlgorithm() {
        return this.checksumAlgorithm;
    }
    
    public void setChecksumAlgorithm(String checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm;
    }

    public String getChecksum() {
        return this.checksum;
    }
    
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getArchitecture() {
        return this.architecture;
    }
    
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public Integer getSizeBytes() {
        return this.sizeBytes;
    }
    
    public void setSizeBytes(Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
