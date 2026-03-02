package com.sdkwork.backend.model;

public class PlusImGroupForm {
    private String name;
    private String description;
    private ImageMediaResource avatar;
    private String announcement;
    private Integer memberCount;
    private Integer maxMembers;
    private Integer creatorId;
    private String type;
    private String status;
    private Boolean allowMemberInvite;
    private Boolean requireApproval;

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

    public ImageMediaResource getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(ImageMediaResource avatar) {
        this.avatar = avatar;
    }

    public String getAnnouncement() {
        return this.announcement;
    }
    
    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public Integer getMemberCount() {
        return this.memberCount;
    }
    
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public Integer getMaxMembers() {
        return this.maxMembers;
    }
    
    public void setMaxMembers(Integer maxMembers) {
        this.maxMembers = maxMembers;
    }

    public Integer getCreatorId() {
        return this.creatorId;
    }
    
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getAllowMemberInvite() {
        return this.allowMemberInvite;
    }
    
    public void setAllowMemberInvite(Boolean allowMemberInvite) {
        this.allowMemberInvite = allowMemberInvite;
    }

    public Boolean getRequireApproval() {
        return this.requireApproval;
    }
    
    public void setRequireApproval(Boolean requireApproval) {
        this.requireApproval = requireApproval;
    }
}
