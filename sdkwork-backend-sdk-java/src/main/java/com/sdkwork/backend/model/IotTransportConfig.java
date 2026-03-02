package com.sdkwork.backend.model;

public class IotTransportConfig {
    private String type;
    private String url;
    private Integer connectionTimeout;
    private Integer keepAliveInterval;
    private Integer qos;
    private String clientId;
    private String authToken;
    private String username;
    private String password;
    private Boolean sslEnabled;
    private Boolean cleanSession;
    private String willTopic;
    private String willMessage;
    private Integer willQos;
    private Boolean willRetain;
    private List<String> publishTopics;
    private List<String> subscribeTopics;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getConnectionTimeout() {
        return this.connectionTimeout;
    }
    
    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public Integer getKeepAliveInterval() {
        return this.keepAliveInterval;
    }
    
    public void setKeepAliveInterval(Integer keepAliveInterval) {
        this.keepAliveInterval = keepAliveInterval;
    }

    public Integer getQos() {
        return this.qos;
    }
    
    public void setQos(Integer qos) {
        this.qos = qos;
    }

    public String getClientId() {
        return this.clientId;
    }
    
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAuthToken() {
        return this.authToken;
    }
    
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getSslEnabled() {
        return this.sslEnabled;
    }
    
    public void setSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    public Boolean getCleanSession() {
        return this.cleanSession;
    }
    
    public void setCleanSession(Boolean cleanSession) {
        this.cleanSession = cleanSession;
    }

    public String getWillTopic() {
        return this.willTopic;
    }
    
    public void setWillTopic(String willTopic) {
        this.willTopic = willTopic;
    }

    public String getWillMessage() {
        return this.willMessage;
    }
    
    public void setWillMessage(String willMessage) {
        this.willMessage = willMessage;
    }

    public Integer getWillQos() {
        return this.willQos;
    }
    
    public void setWillQos(Integer willQos) {
        this.willQos = willQos;
    }

    public Boolean getWillRetain() {
        return this.willRetain;
    }
    
    public void setWillRetain(Boolean willRetain) {
        this.willRetain = willRetain;
    }

    public List<String> getPublishTopics() {
        return this.publishTopics;
    }
    
    public void setPublishTopics(List<String> publishTopics) {
        this.publishTopics = publishTopics;
    }

    public List<String> getSubscribeTopics() {
        return this.subscribeTopics;
    }
    
    public void setSubscribeTopics(List<String> subscribeTopics) {
        this.subscribeTopics = subscribeTopics;
    }
}
