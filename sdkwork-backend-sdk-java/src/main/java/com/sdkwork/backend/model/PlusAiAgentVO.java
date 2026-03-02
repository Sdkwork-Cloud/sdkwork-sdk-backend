package com.sdkwork.backend.model;

public class PlusAiAgentVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private ImageMediaResource faceImage;
    private VideoMediaResource faceVideo;
    private String owner;
    private Integer ownerId;
    private String channel;
    private String channelId;
    private String icon;
    private String description;
    private TagsContent tags;
    private String type;
    private String bizType;
    private String status;
    private PlusAiAgentConfig baseConfig;
    private AgentKnowledgeConfig knowledgeConfig;
    private AgentMemoryConfig memoryConfig;
    private SpeechConfig speechConfig;
    private AgentToolConfig toolConfig;
    private TeamAgentMembers members;
    private Integer knowledgeBaseId;
    private Integer promptId;
    private Integer categoryId;
    private PlusChatOptions chatOptions;
    private PlusAiAgentConfig config;
    private Integer usageCount;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public ImageMediaResource getFaceImage() {
        return this.faceImage;
    }
    
    public void setFaceImage(ImageMediaResource faceImage) {
        this.faceImage = faceImage;
    }

    public VideoMediaResource getFaceVideo() {
        return this.faceVideo;
    }
    
    public void setFaceVideo(VideoMediaResource faceVideo) {
        this.faceVideo = faceVideo;
    }

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannelId() {
        return this.channelId;
    }
    
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getBizType() {
        return this.bizType;
    }
    
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public PlusAiAgentConfig getBaseConfig() {
        return this.baseConfig;
    }
    
    public void setBaseConfig(PlusAiAgentConfig baseConfig) {
        this.baseConfig = baseConfig;
    }

    public AgentKnowledgeConfig getKnowledgeConfig() {
        return this.knowledgeConfig;
    }
    
    public void setKnowledgeConfig(AgentKnowledgeConfig knowledgeConfig) {
        this.knowledgeConfig = knowledgeConfig;
    }

    public AgentMemoryConfig getMemoryConfig() {
        return this.memoryConfig;
    }
    
    public void setMemoryConfig(AgentMemoryConfig memoryConfig) {
        this.memoryConfig = memoryConfig;
    }

    public SpeechConfig getSpeechConfig() {
        return this.speechConfig;
    }
    
    public void setSpeechConfig(SpeechConfig speechConfig) {
        this.speechConfig = speechConfig;
    }

    public AgentToolConfig getToolConfig() {
        return this.toolConfig;
    }
    
    public void setToolConfig(AgentToolConfig toolConfig) {
        this.toolConfig = toolConfig;
    }

    public TeamAgentMembers getMembers() {
        return this.members;
    }
    
    public void setMembers(TeamAgentMembers members) {
        this.members = members;
    }

    public Integer getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }
    
    public void setKnowledgeBaseId(Integer knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public Integer getPromptId() {
        return this.promptId;
    }
    
    public void setPromptId(Integer promptId) {
        this.promptId = promptId;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public PlusChatOptions getChatOptions() {
        return this.chatOptions;
    }
    
    public void setChatOptions(PlusChatOptions chatOptions) {
        this.chatOptions = chatOptions;
    }

    public PlusAiAgentConfig getConfig() {
        return this.config;
    }
    
    public void setConfig(PlusAiAgentConfig config) {
        this.config = config;
    }

    public Integer getUsageCount() {
        return this.usageCount;
    }
    
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }
}
