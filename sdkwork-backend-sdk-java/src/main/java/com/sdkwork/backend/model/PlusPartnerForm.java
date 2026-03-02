package com.sdkwork.backend.model;

public class PlusPartnerForm {
    private String name;
    private String level;
    private String status;
    private String contactName;
    private String contactPhone;
    private String contactEmail;
    private String companyAddress;
    private String businessLicense;
    private String settlementAccount;
    private Double commissionRate;
    private Double totalCommission;
    private Double withdrawableCommission;
    private Double withdrawnCommission;
    private String promotionCode;
    private Integer parentId;
    private PlusTreeParentMetadata parentMetadata;
    private String parentUuid;
    private String cooperationStartTime;
    private String cooperationEndTime;
    private String remark;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return this.level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getContactName() {
        return this.contactName;
    }
    
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }
    
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }
    
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getCompanyAddress() {
        return this.companyAddress;
    }
    
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getBusinessLicense() {
        return this.businessLicense;
    }
    
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getSettlementAccount() {
        return this.settlementAccount;
    }
    
    public void setSettlementAccount(String settlementAccount) {
        this.settlementAccount = settlementAccount;
    }

    public Double getCommissionRate() {
        return this.commissionRate;
    }
    
    public void setCommissionRate(Double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Double getTotalCommission() {
        return this.totalCommission;
    }
    
    public void setTotalCommission(Double totalCommission) {
        this.totalCommission = totalCommission;
    }

    public Double getWithdrawableCommission() {
        return this.withdrawableCommission;
    }
    
    public void setWithdrawableCommission(Double withdrawableCommission) {
        this.withdrawableCommission = withdrawableCommission;
    }

    public Double getWithdrawnCommission() {
        return this.withdrawnCommission;
    }
    
    public void setWithdrawnCommission(Double withdrawnCommission) {
        this.withdrawnCommission = withdrawnCommission;
    }

    public String getPromotionCode() {
        return this.promotionCode;
    }
    
    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public PlusTreeParentMetadata getParentMetadata() {
        return this.parentMetadata;
    }
    
    public void setParentMetadata(PlusTreeParentMetadata parentMetadata) {
        this.parentMetadata = parentMetadata;
    }

    public String getParentUuid() {
        return this.parentUuid;
    }
    
    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    public String getCooperationStartTime() {
        return this.cooperationStartTime;
    }
    
    public void setCooperationStartTime(String cooperationStartTime) {
        this.cooperationStartTime = cooperationStartTime;
    }

    public String getCooperationEndTime() {
        return this.cooperationEndTime;
    }
    
    public void setCooperationEndTime(String cooperationEndTime) {
        this.cooperationEndTime = cooperationEndTime;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
