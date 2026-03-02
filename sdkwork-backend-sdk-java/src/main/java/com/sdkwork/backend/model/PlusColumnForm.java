package com.sdkwork.backend.model;

public class PlusColumnForm {
    private String name;
    private String description;
    private String dataType;
    private String columnType;
    private Integer ordinalPosition;
    private Boolean isNullable;
    private Boolean isPrimaryKey;
    private Boolean isAutoIncrement;
    private String defaultValue;
    private String comment;
    private String characterSet;
    private String collationRule;
    private Integer tableId;

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

    public String getDataType() {
        return this.dataType;
    }
    
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getColumnType() {
        return this.columnType;
    }
    
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }
    
    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public Boolean getIsNullable() {
        return this.isNullable;
    }
    
    public void setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
    }

    public Boolean getIsPrimaryKey() {
        return this.isPrimaryKey;
    }
    
    public void setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }

    public Boolean getIsAutoIncrement() {
        return this.isAutoIncrement;
    }
    
    public void setIsAutoIncrement(Boolean isAutoIncrement) {
        this.isAutoIncrement = isAutoIncrement;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }
    
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCharacterSet() {
        return this.characterSet;
    }
    
    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    public String getCollationRule() {
        return this.collationRule;
    }
    
    public void setCollationRule(String collationRule) {
        this.collationRule = collationRule;
    }

    public Integer getTableId() {
        return this.tableId;
    }
    
    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }
}
