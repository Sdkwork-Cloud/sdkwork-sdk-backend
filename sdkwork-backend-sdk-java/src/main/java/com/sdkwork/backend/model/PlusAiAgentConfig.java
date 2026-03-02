package com.sdkwork.backend.model;

public class PlusAiAgentConfig {
    private String welcome;
    private List<String> questions;
    private Boolean saveFiles;
    private Boolean enableMemory;
    private Integer maxHistoryMessages;
    private Boolean useKnowledgeBase;
    private Map<String, Object> properties;

    public String getWelcome() {
        return this.welcome;
    }
    
    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public List<String> getQuestions() {
        return this.questions;
    }
    
    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public Boolean getSaveFiles() {
        return this.saveFiles;
    }
    
    public void setSaveFiles(Boolean saveFiles) {
        this.saveFiles = saveFiles;
    }

    public Boolean getEnableMemory() {
        return this.enableMemory;
    }
    
    public void setEnableMemory(Boolean enableMemory) {
        this.enableMemory = enableMemory;
    }

    public Integer getMaxHistoryMessages() {
        return this.maxHistoryMessages;
    }
    
    public void setMaxHistoryMessages(Integer maxHistoryMessages) {
        this.maxHistoryMessages = maxHistoryMessages;
    }

    public Boolean getUseKnowledgeBase() {
        return this.useKnowledgeBase;
    }
    
    public void setUseKnowledgeBase(Boolean useKnowledgeBase) {
        this.useKnowledgeBase = useKnowledgeBase;
    }

    public Map<String, Object> getProperties() {
        return this.properties;
    }
    
    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
}
