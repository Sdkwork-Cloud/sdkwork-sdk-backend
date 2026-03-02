package com.sdkwork.backend.model;

public class PlusVipPackGroupVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer appId;
    private String name;
    private String description;
    private Integer sortWeight;
    private String status;
    private String remark;
    private List<PlusVipPackVO> packs;

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

    public Integer getAppId() {
        return this.appId;
    }
    
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSortWeight() {
        return this.sortWeight;
    }
    
    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<PlusVipPackVO> getPacks() {
        return this.packs;
    }
    
    public void setPacks(List<PlusVipPackVO> packs) {
        this.packs = packs;
    }
}
