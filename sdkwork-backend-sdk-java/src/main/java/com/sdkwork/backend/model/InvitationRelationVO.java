package com.sdkwork.backend.model;

public class InvitationRelationVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer inviterUserId;
    private Integer inviteeUserId;
    private String inviteCode;
    private String usedTime;
    private Integer relationLevel;
    private String rewardStatus;
    private Double rewardAmount;
    private String rewardType;

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

    public Integer getInviterUserId() {
        return this.inviterUserId;
    }
    
    public void setInviterUserId(Integer inviterUserId) {
        this.inviterUserId = inviterUserId;
    }

    public Integer getInviteeUserId() {
        return this.inviteeUserId;
    }
    
    public void setInviteeUserId(Integer inviteeUserId) {
        this.inviteeUserId = inviteeUserId;
    }

    public String getInviteCode() {
        return this.inviteCode;
    }
    
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getUsedTime() {
        return this.usedTime;
    }
    
    public void setUsedTime(String usedTime) {
        this.usedTime = usedTime;
    }

    public Integer getRelationLevel() {
        return this.relationLevel;
    }
    
    public void setRelationLevel(Integer relationLevel) {
        this.relationLevel = relationLevel;
    }

    public String getRewardStatus() {
        return this.rewardStatus;
    }
    
    public void setRewardStatus(String rewardStatus) {
        this.rewardStatus = rewardStatus;
    }

    public Double getRewardAmount() {
        return this.rewardAmount;
    }
    
    public void setRewardAmount(Double rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    public String getRewardType() {
        return this.rewardType;
    }
    
    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }
}
