package com.sdkwork.backend.model;

public class PlusSchemaVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private String description;
    private Integer status;
    private Integer tableCount;
    private String lastSyncTime;
    private Boolean isDefault;
    private Integer datasourceId;
    private List<Integer> tableIds;

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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTableCount() {
        return this.tableCount;
    }
    
    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    public String getLastSyncTime() {
        return this.lastSyncTime;
    }
    
    public void setLastSyncTime(String lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }
    
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getDatasourceId() {
        return this.datasourceId;
    }
    
    public void setDatasourceId(Integer datasourceId) {
        this.datasourceId = datasourceId;
    }

    public List<Integer> getTableIds() {
        return this.tableIds;
    }
    
    public void setTableIds(List<Integer> tableIds) {
        this.tableIds = tableIds;
    }
}
