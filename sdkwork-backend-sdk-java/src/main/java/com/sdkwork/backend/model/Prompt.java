package com.sdkwork.backend.model;

public class Prompt {
    private String contents;
    private ChatOptions options;
    private List<Message> instructions;
    private Message lastUserOrToolResponseMessage;
    private List<UserMessage> userMessages;
    private UserMessage userMessage;
    private List<SystemMessage> systemMessages;
    private SystemMessage systemMessage;

    public String getContents() {
        return this.contents;
    }
    
    public void setContents(String contents) {
        this.contents = contents;
    }

    public ChatOptions getOptions() {
        return this.options;
    }
    
    public void setOptions(ChatOptions options) {
        this.options = options;
    }

    public List<Message> getInstructions() {
        return this.instructions;
    }
    
    public void setInstructions(List<Message> instructions) {
        this.instructions = instructions;
    }

    public Message getLastUserOrToolResponseMessage() {
        return this.lastUserOrToolResponseMessage;
    }
    
    public void setLastUserOrToolResponseMessage(Message lastUserOrToolResponseMessage) {
        this.lastUserOrToolResponseMessage = lastUserOrToolResponseMessage;
    }

    public List<UserMessage> getUserMessages() {
        return this.userMessages;
    }
    
    public void setUserMessages(List<UserMessage> userMessages) {
        this.userMessages = userMessages;
    }

    public UserMessage getUserMessage() {
        return this.userMessage;
    }
    
    public void setUserMessage(UserMessage userMessage) {
        this.userMessage = userMessage;
    }

    public List<SystemMessage> getSystemMessages() {
        return this.systemMessages;
    }
    
    public void setSystemMessages(List<SystemMessage> systemMessages) {
        this.systemMessages = systemMessages;
    }

    public SystemMessage getSystemMessage() {
        return this.systemMessage;
    }
    
    public void setSystemMessage(SystemMessage systemMessage) {
        this.systemMessage = systemMessage;
    }
}
