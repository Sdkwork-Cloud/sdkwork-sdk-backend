package com.sdkwork.backend.model;

public class AgentDefinition {
    private Integer id;
    private String uuid;
    private String name;
    private String instructions;
    private String description;
    private String type;
    private String bizType;
    private TeamAgentMembers agents;
    private AgentToolConfig toolConfig;
    private PlusAiAgentConfig baseConfig;
    private AgentKnowledgeConfig knowledgeConfig;
    private AgentMemoryConfig memoryConfig;
    private SpeechConfig speechConfig;
    private ChatOptions chatOptions;

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

    public String getInstructions() {
        return this.instructions;
    }
    
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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

    public TeamAgentMembers getAgents() {
        return this.agents;
    }
    
    public void setAgents(TeamAgentMembers agents) {
        this.agents = agents;
    }

    public AgentToolConfig getToolConfig() {
        return this.toolConfig;
    }
    
    public void setToolConfig(AgentToolConfig toolConfig) {
        this.toolConfig = toolConfig;
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

    public ChatOptions getChatOptions() {
        return this.chatOptions;
    }
    
    public void setChatOptions(ChatOptions chatOptions) {
        this.chatOptions = chatOptions;
    }
}
