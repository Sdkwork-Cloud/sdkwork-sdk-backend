package com.sdkwork.backend.model;

public class PlusAiAgentForm {
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
    private Integer cateId;
    private Integer knowledgeBaseId;
    private PlusChatOptions chatOptions;
    private AiAgentSystemPrompt prompt;

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

    public Integer getCateId() {
        return this.cateId;
    }
    
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }
    
    public void setKnowledgeBaseId(Integer knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public PlusChatOptions getChatOptions() {
        return this.chatOptions;
    }
    
    public void setChatOptions(PlusChatOptions chatOptions) {
        this.chatOptions = chatOptions;
    }

    public AiAgentSystemPrompt getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(AiAgentSystemPrompt prompt) {
        this.prompt = prompt;
    }
}
