package com.sdkwork.backend.model;

public class VoiceSpeakerInfo {
    private String channel;
    private String provider;
    private String product;
    private String id;
    private List<String> models;
    private String speakerId;
    private String displayName;
    private TagsContent tags;
    private VoiceMotion motion;
    private VoiceStyle style;
    private String description;

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getProvider() {
        return this.provider;
    }
    
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public List<String> getModels() {
        return this.models;
    }
    
    public void setModels(List<String> models) {
        this.models = models;
    }

    public String getSpeakerId() {
        return this.speakerId;
    }
    
    public void setSpeakerId(String speakerId) {
        this.speakerId = speakerId;
    }

    public String getDisplayName() {
        return this.displayName;
    }
    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public VoiceMotion getMotion() {
        return this.motion;
    }
    
    public void setMotion(VoiceMotion motion) {
        this.motion = motion;
    }

    public VoiceStyle getStyle() {
        return this.style;
    }
    
    public void setStyle(VoiceStyle style) {
        this.style = style;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
