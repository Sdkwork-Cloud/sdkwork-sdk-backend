package com.sdkwork.backend.model;

public class PlusSchemaForm {
    private String name;
    private String description;
    private Integer status;
    private Integer tableCount;
    private String lastSyncTime;
    private Boolean isDefault;
    private Integer datasourceId;

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
}
