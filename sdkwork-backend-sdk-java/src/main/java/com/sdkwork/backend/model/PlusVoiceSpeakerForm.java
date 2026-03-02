package com.sdkwork.backend.model;

public class PlusVoiceSpeakerForm {
    private String name;
    private String channelSpeakerId;
    private String code;
    private String channel;
    private String gender;
    private String ageType;
    private String type;
    private List<String> models;
    private TagsContent tags;
    private String status;
    private String description;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getChannelSpeakerId() {
        return this.channelSpeakerId;
    }
    
    public void setChannelSpeakerId(String channelSpeakerId) {
        this.channelSpeakerId = channelSpeakerId;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeType() {
        return this.ageType;
    }
    
    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public List<String> getModels() {
        return this.models;
    }
    
    public void setModels(List<String> models) {
        this.models = models;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
