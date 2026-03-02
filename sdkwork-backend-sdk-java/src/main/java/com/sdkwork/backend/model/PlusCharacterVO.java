package com.sdkwork.backend.model;

public class PlusCharacterVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String name;
    private String type;
    private ImageMediaResource avatar;
    private ImageMediaResource threeViewImage;
    private ImageMediaResource gridShotsImage;
    private VideoMediaResource avatarVideo;
    private Integer agentId;
    private String description;
    private String status;
    private String personality;
    private String background;
    private String interactionSettings;
    private String version;
    private Integer userId;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public ImageMediaResource getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(ImageMediaResource avatar) {
        this.avatar = avatar;
    }

    public ImageMediaResource getThreeViewImage() {
        return this.threeViewImage;
    }
    
    public void setThreeViewImage(ImageMediaResource threeViewImage) {
        this.threeViewImage = threeViewImage;
    }

    public ImageMediaResource getGridShotsImage() {
        return this.gridShotsImage;
    }
    
    public void setGridShotsImage(ImageMediaResource gridShotsImage) {
        this.gridShotsImage = gridShotsImage;
    }

    public VideoMediaResource getAvatarVideo() {
        return this.avatarVideo;
    }
    
    public void setAvatarVideo(VideoMediaResource avatarVideo) {
        this.avatarVideo = avatarVideo;
    }

    public Integer getAgentId() {
        return this.agentId;
    }
    
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getPersonality() {
        return this.personality;
    }
    
    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getBackground() {
        return this.background;
    }
    
    public void setBackground(String background) {
        this.background = background;
    }

    public String getInteractionSettings() {
        return this.interactionSettings;
    }
    
    public void setInteractionSettings(String interactionSettings) {
        this.interactionSettings = interactionSettings;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
