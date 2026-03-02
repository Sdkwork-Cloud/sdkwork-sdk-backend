package com.sdkwork.backend.model;

public class PlusDnsRecordVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer domainId;
    private String recordName;
    private String fileName;
    private String fileContent;
    private String recordType;
    private DnsRecordValue recordValue;
    private Integer ttl;
    private Integer priority;
    private Boolean enabled;
    private String firstRecordValue;
    private List<String> recordValues;

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

    public Integer getDomainId() {
        return this.domainId;
    }
    
    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public String getRecordName() {
        return this.recordName;
    }
    
    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileContent() {
        return this.fileContent;
    }
    
    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public String getRecordType() {
        return this.recordType;
    }
    
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public DnsRecordValue getRecordValue() {
        return this.recordValue;
    }
    
    public void setRecordValue(DnsRecordValue recordValue) {
        this.recordValue = recordValue;
    }

    public Integer getTtl() {
        return this.ttl;
    }
    
    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public Integer getPriority() {
        return this.priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getFirstRecordValue() {
        return this.firstRecordValue;
    }
    
    public void setFirstRecordValue(String firstRecordValue) {
        this.firstRecordValue = firstRecordValue;
    }

    public List<String> getRecordValues() {
        return this.recordValues;
    }
    
    public void setRecordValues(List<String> recordValues) {
        this.recordValues = recordValues;
    }
}
