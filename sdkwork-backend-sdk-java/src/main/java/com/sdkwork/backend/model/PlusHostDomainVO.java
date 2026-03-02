package com.sdkwork.backend.model;

public class PlusHostDomainVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String domainName;
    private String tld;
    private String registrar;
    private Integer ownerId;
    private String registeredAt;
    private String expiredAt;
    private String status;
    private DnsServers dnsServers;
    private String resolutionStatus;
    private Boolean autoRenew;
    private String remark;
    private List<PlusDnsRecordVO> dnsRecords;

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

    public String getDomainName() {
        return this.domainName;
    }
    
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getTld() {
        return this.tld;
    }
    
    public void setTld(String tld) {
        this.tld = tld;
    }

    public String getRegistrar() {
        return this.registrar;
    }
    
    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getRegisteredAt() {
        return this.registeredAt;
    }
    
    public void setRegisteredAt(String registeredAt) {
        this.registeredAt = registeredAt;
    }

    public String getExpiredAt() {
        return this.expiredAt;
    }
    
    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public DnsServers getDnsServers() {
        return this.dnsServers;
    }
    
    public void setDnsServers(DnsServers dnsServers) {
        this.dnsServers = dnsServers;
    }

    public String getResolutionStatus() {
        return this.resolutionStatus;
    }
    
    public void setResolutionStatus(String resolutionStatus) {
        this.resolutionStatus = resolutionStatus;
    }

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }
    
    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<PlusDnsRecordVO> getDnsRecords() {
        return this.dnsRecords;
    }
    
    public void setDnsRecords(List<PlusDnsRecordVO> dnsRecords) {
        this.dnsRecords = dnsRecords;
    }
}
