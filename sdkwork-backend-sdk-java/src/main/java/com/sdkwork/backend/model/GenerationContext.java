package com.sdkwork.backend.model;

public class GenerationContext {
    private Integer generationId;
    private String generationType;
    private String generationStatus;
    private String channel;
    private String requestId;
    private String channelTaskId;
    private String routingStrategy;
    private String routingProduct;
    private String routingProvider;

    public Integer getGenerationId() {
        return this.generationId;
    }
    
    public void setGenerationId(Integer generationId) {
        this.generationId = generationId;
    }

    public String getGenerationType() {
        return this.generationType;
    }
    
    public void setGenerationType(String generationType) {
        this.generationType = generationType;
    }

    public String getGenerationStatus() {
        return this.generationStatus;
    }
    
    public void setGenerationStatus(String generationStatus) {
        this.generationStatus = generationStatus;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRequestId() {
        return this.requestId;
    }
    
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getChannelTaskId() {
        return this.channelTaskId;
    }
    
    public void setChannelTaskId(String channelTaskId) {
        this.channelTaskId = channelTaskId;
    }

    public String getRoutingStrategy() {
        return this.routingStrategy;
    }
    
    public void setRoutingStrategy(String routingStrategy) {
        this.routingStrategy = routingStrategy;
    }

    public String getRoutingProduct() {
        return this.routingProduct;
    }
    
    public void setRoutingProduct(String routingProduct) {
        this.routingProduct = routingProduct;
    }

    public String getRoutingProvider() {
        return this.routingProvider;
    }
    
    public void setRoutingProvider(String routingProvider) {
        this.routingProvider = routingProvider;
    }
}
