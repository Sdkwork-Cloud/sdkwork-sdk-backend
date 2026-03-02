package com.sdkwork.backend.model;

public class PlusPptProject {
    private String id;
    private String uuid;
    private String type;
    private String screenType;
    private String name;
    private String title;
    private String owner;
    private Integer ownerId;
    private Integer diskId;
    private List<PlusFileObject> files;
    private String author;
    private String createdAt;
    private String lastModifiedTime;
    private String version;
    private String prompt;
    private String description;
    private TagsContent tags;
    private Double width;
    private Double height;
    private List<PlusPptSlide> slides;
    private PlusPptTheme theme;
    private PlusPptContext context;
    private String subtitle;
    private Boolean includePageNumbers;
    private Boolean includeFooter;
    private String footerText;
    private String exportFormat;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getScreenType() {
        return this.screenType;
    }
    
    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(Integer diskId) {
        this.diskId = diskId;
    }

    public List<PlusFileObject> getFiles() {
        return this.files;
    }
    
    public void setFiles(List<PlusFileObject> files) {
        this.files = files;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    
    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public Double getWidth() {
        return this.width;
    }
    
    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }
    
    public void setHeight(Double height) {
        this.height = height;
    }

    public List<PlusPptSlide> getSlides() {
        return this.slides;
    }
    
    public void setSlides(List<PlusPptSlide> slides) {
        this.slides = slides;
    }

    public PlusPptTheme getTheme() {
        return this.theme;
    }
    
    public void setTheme(PlusPptTheme theme) {
        this.theme = theme;
    }

    public PlusPptContext getContext() {
        return this.context;
    }
    
    public void setContext(PlusPptContext context) {
        this.context = context;
    }

    public String getSubtitle() {
        return this.subtitle;
    }
    
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Boolean getIncludePageNumbers() {
        return this.includePageNumbers;
    }
    
    public void setIncludePageNumbers(Boolean includePageNumbers) {
        this.includePageNumbers = includePageNumbers;
    }

    public Boolean getIncludeFooter() {
        return this.includeFooter;
    }
    
    public void setIncludeFooter(Boolean includeFooter) {
        this.includeFooter = includeFooter;
    }

    public String getFooterText() {
        return this.footerText;
    }
    
    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public String getExportFormat() {
        return this.exportFormat;
    }
    
    public void setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
    }
}
