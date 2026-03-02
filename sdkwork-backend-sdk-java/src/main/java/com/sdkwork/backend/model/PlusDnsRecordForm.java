package com.sdkwork.backend.model;

public class PlusDnsRecordForm {
    private Integer domainId;
    private String recordName;
    private String fileName;
    private String fileContent;
    private String recordType;
    private DnsRecordValue recordValue;
    private Integer ttl;
    private Integer priority;
    private Boolean enabled;

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
}
