package com.sdkwork.backend.model;

public class AssetMediaResource {
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
    private ImageMediaResource image;
    private VideoMediaResource video;
    private AudioMediaResource audio;
    private MusicMediaResource music;
    private CharacterMediaResource character;
    private FileMediaResource file;
    private Map<String, Object> extraProps;

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

    public ImageMediaResource getImage() {
        return this.image;
    }
    
    public void setImage(ImageMediaResource image) {
        this.image = image;
    }

    public VideoMediaResource getVideo() {
        return this.video;
    }
    
    public void setVideo(VideoMediaResource video) {
        this.video = video;
    }

    public AudioMediaResource getAudio() {
        return this.audio;
    }
    
    public void setAudio(AudioMediaResource audio) {
        this.audio = audio;
    }

    public MusicMediaResource getMusic() {
        return this.music;
    }
    
    public void setMusic(MusicMediaResource music) {
        this.music = music;
    }

    public CharacterMediaResource getCharacter() {
        return this.character;
    }
    
    public void setCharacter(CharacterMediaResource character) {
        this.character = character;
    }

    public FileMediaResource getFile() {
        return this.file;
    }
    
    public void setFile(FileMediaResource file) {
        this.file = file;
    }

    public Map<String, Object> getExtraProps() {
        return this.extraProps;
    }
    
    public void setExtraProps(Map<String, Object> extraProps) {
        this.extraProps = extraProps;
    }
}
