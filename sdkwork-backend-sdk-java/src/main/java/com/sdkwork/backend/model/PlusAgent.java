package com.sdkwork.backend.model;

public class PlusAgent {
    private String name;
    private Integer id;
    private AgentDefinition definition;
    private String description;
    private AgentMetadata metadata;
    private String uuid;
    private Prompt systemPrompt;
    private LlmAccountConfig accountConfig;
    private List<PromptToolDescription> tools;
    private AgentExecutionContext executionContext;
    private ChatContext chatContext;
    private ChatOptions chatOptions;
    private List<String> instructions;
    private String faceURL;
    private Map<String, Prompt> prompts;
    private ToolCallbackProvider toolCallbackProvider;
    private String promptPath;
    private PromptContextOptimizer promptContextOptimizer;
    private List<String> nextActions;
    private IPlusChatMemory chatMemory;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public AgentDefinition getDefinition() {
        return this.definition;
    }
    
    public void setDefinition(AgentDefinition definition) {
        this.definition = definition;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public AgentMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(AgentMetadata metadata) {
        this.metadata = metadata;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Prompt getSystemPrompt() {
        return this.systemPrompt;
    }
    
    public void setSystemPrompt(Prompt systemPrompt) {
        this.systemPrompt = systemPrompt;
    }

    public LlmAccountConfig getAccountConfig() {
        return this.accountConfig;
    }
    
    public void setAccountConfig(LlmAccountConfig accountConfig) {
        this.accountConfig = accountConfig;
    }

    public List<PromptToolDescription> getTools() {
        return this.tools;
    }
    
    public void setTools(List<PromptToolDescription> tools) {
        this.tools = tools;
    }

    public AgentExecutionContext getExecutionContext() {
        return this.executionContext;
    }
    
    public void setExecutionContext(AgentExecutionContext executionContext) {
        this.executionContext = executionContext;
    }

    public ChatContext getChatContext() {
        return this.chatContext;
    }
    
    public void setChatContext(ChatContext chatContext) {
        this.chatContext = chatContext;
    }

    public ChatOptions getChatOptions() {
        return this.chatOptions;
    }
    
    public void setChatOptions(ChatOptions chatOptions) {
        this.chatOptions = chatOptions;
    }

    public List<String> getInstructions() {
        return this.instructions;
    }
    
    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public String getFaceURL() {
        return this.faceURL;
    }
    
    public void setFaceURL(String faceURL) {
        this.faceURL = faceURL;
    }

    public Map<String, Prompt> getPrompts() {
        return this.prompts;
    }
    
    public void setPrompts(Map<String, Prompt> prompts) {
        this.prompts = prompts;
    }

    public ToolCallbackProvider getToolCallbackProvider() {
        return this.toolCallbackProvider;
    }
    
    public void setToolCallbackProvider(ToolCallbackProvider toolCallbackProvider) {
        this.toolCallbackProvider = toolCallbackProvider;
    }

    public String getPromptPath() {
        return this.promptPath;
    }
    
    public void setPromptPath(String promptPath) {
        this.promptPath = promptPath;
    }

    public PromptContextOptimizer getPromptContextOptimizer() {
        return this.promptContextOptimizer;
    }
    
    public void setPromptContextOptimizer(PromptContextOptimizer promptContextOptimizer) {
        this.promptContextOptimizer = promptContextOptimizer;
    }

    public List<String> getNextActions() {
        return this.nextActions;
    }
    
    public void setNextActions(List<String> nextActions) {
        this.nextActions = nextActions;
    }

    public IPlusChatMemory getChatMemory() {
        return this.chatMemory;
    }
    
    public void setChatMemory(IPlusChatMemory chatMemory) {
        this.chatMemory = chatMemory;
    }
}
