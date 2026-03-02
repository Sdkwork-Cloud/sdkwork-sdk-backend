package com.sdkwork.backend.model;

public class CharacterMediaResource {
    private Integer id;
    private String uuid;
    private String url;
    private String bytes;
    private Object localFile;
    private String base64;
    private String type;
    private String mimeType;
    private Integer size;
    private String name;
    private String extension;
    private TagsContent tags;
    private Map<String, Object> metadata;
    private String prompt;
    private String characterType;
    private String gender;
    private String ageGroup;
    private String avatarUrl;
    private String avatarVideoUrl;
    private Integer speakerId;
    private Map<String, Object> appearanceParams;
    private Map<String, Object> animationParams;

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

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getBytes() {
        return this.bytes;
    }
    
    public void setBytes(String bytes) {
        this.bytes = bytes;
    }

    public Object getLocalFile() {
        return this.localFile;
    }
    
    public void setLocalFile(Object localFile) {
        this.localFile = localFile;
    }

    public String getBase64() {
        return this.base64;
    }
    
    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getMimeType() {
        return this.mimeType;
    }
    
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return this.extension;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getCharacterType() {
        return this.characterType;
    }
    
    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeGroup() {
        return this.ageGroup;
    }
    
    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }
    
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarVideoUrl() {
        return this.avatarVideoUrl;
    }
    
    public void setAvatarVideoUrl(String avatarVideoUrl) {
        this.avatarVideoUrl = avatarVideoUrl;
    }

    public Integer getSpeakerId() {
        return this.speakerId;
    }
    
    public void setSpeakerId(Integer speakerId) {
        this.speakerId = speakerId;
    }

    public Map<String, Object> getAppearanceParams() {
        return this.appearanceParams;
    }
    
    public void setAppearanceParams(Map<String, Object> appearanceParams) {
        this.appearanceParams = appearanceParams;
    }

    public Map<String, Object> getAnimationParams() {
        return this.animationParams;
    }
    
    public void setAnimationParams(Map<String, Object> animationParams) {
        this.animationParams = animationParams;
    }
}
