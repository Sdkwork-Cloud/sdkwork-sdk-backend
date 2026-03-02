package com.sdkwork.backend.model;

public class ChatCompletionCreateForm {
    private String model;
    private List<ChatCompletionMessage> messages;
    private Double temperature;
    private Integer n;
    private Boolean stream;
    private List<String> stop;
    private String user;
    private String tool;
    private Double topP;
    private Integer maxTokens;
    private Double presencePenalty;
    private Double frequencyPenalty;
    private Map<String, Integer> logitBias;
    private Boolean responseFormat;
    private String systemFingerprint;
    private ChatContext chatContext;

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public List<ChatCompletionMessage> getMessages() {
        return this.messages;
    }
    
    public void setMessages(List<ChatCompletionMessage> messages) {
        this.messages = messages;
    }

    public Double getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getN() {
        return this.n;
    }
    
    public void setN(Integer n) {
        this.n = n;
    }

    public Boolean getStream() {
        return this.stream;
    }
    
    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public List<String> getStop() {
        return this.stop;
    }
    
    public void setStop(List<String> stop) {
        this.stop = stop;
    }

    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public String getTool() {
        return this.tool;
    }
    
    public void setTool(String tool) {
        this.tool = tool;
    }

    public Double getTopP() {
        return this.topP;
    }
    
    public void setTopP(Double topP) {
        this.topP = topP;
    }

    public Integer getMaxTokens() {
        return this.maxTokens;
    }
    
    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public Double getPresencePenalty() {
        return this.presencePenalty;
    }
    
    public void setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    public Double getFrequencyPenalty() {
        return this.frequencyPenalty;
    }
    
    public void setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    public Map<String, Integer> getLogitBias() {
        return this.logitBias;
    }
    
    public void setLogitBias(Map<String, Integer> logitBias) {
        this.logitBias = logitBias;
    }

    public Boolean getResponseFormat() {
        return this.responseFormat;
    }
    
    public void setResponseFormat(Boolean responseFormat) {
        this.responseFormat = responseFormat;
    }

    public String getSystemFingerprint() {
        return this.systemFingerprint;
    }
    
    public void setSystemFingerprint(String systemFingerprint) {
        this.systemFingerprint = systemFingerprint;
    }

    public ChatContext getChatContext() {
        return this.chatContext;
    }
    
    public void setChatContext(ChatContext chatContext) {
        this.chatContext = chatContext;
    }
}
