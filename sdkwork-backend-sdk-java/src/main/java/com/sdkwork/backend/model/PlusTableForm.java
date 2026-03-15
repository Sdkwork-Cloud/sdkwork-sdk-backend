package com.sdkwork.backend.model;

public class PlusTableForm {
    private String name;
    private String description;
    private String type;
    private Integer columnCount;
    private Integer rowCount;
    private String lastSyncTime;
    private String primaryKeys;
    private String engine;
    private String createSql;
    private String comment;
    private Integer schemaId;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Integer getColumnCount() {
        return this.columnCount;
    }
    
    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    public Integer getRowCount() {
        return this.rowCount;
    }
    
    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public String getLastSyncTime() {
        return this.lastSyncTime;
    }
    
    public void setLastSyncTime(String lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    public String getPrimaryKeys() {
        return this.primaryKeys;
    }
    
    public void setPrimaryKeys(String primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    public String getEngine() {
        return this.engine;
    }
    
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getCreateSql() {
        return this.createSql;
    }
    
    public void setCreateSql(String createSql) {
        this.createSql = createSql;
    }

    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getSchemaId() {
        return this.schemaId;
    }
    
    public void setSchemaId(Integer schemaId) {
        this.schemaId = schemaId;
    }
}
