package com.sdkwork.backend.model;

public class PlusTenantForm {
    private String name;
    private String code;
    private String status;
    private String description;
    private Integer adminUserId;
    private String expireTime;
    private InstallAppList installAppList;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAdminUserId() {
        return this.adminUserId;
    }
    
    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public InstallAppList getInstallAppList() {
        return this.installAppList;
    }
    
    public void setInstallAppList(InstallAppList installAppList) {
        this.installAppList = installAppList;
    }
}
