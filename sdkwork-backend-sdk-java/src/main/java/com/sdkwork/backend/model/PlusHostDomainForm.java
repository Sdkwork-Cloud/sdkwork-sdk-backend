package com.sdkwork.backend.model;

public class PlusHostDomainForm {
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
}
