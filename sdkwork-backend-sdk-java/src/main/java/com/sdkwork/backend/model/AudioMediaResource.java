package com.sdkwork.backend.model;

public class AudioMediaResource {
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
    private String format;
    private Integer bitRate;
    private Integer sampleRate;
    private Integer channels;
    private Integer duration;

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

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getBitRate() {
        return this.bitRate;
    }
    
    public void setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
    }

    public Integer getSampleRate() {
        return this.sampleRate;
    }
    
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    public Integer getChannels() {
        return this.channels;
    }
    
    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
