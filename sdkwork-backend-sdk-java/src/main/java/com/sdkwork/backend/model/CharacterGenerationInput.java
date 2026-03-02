package com.sdkwork.backend.model;

public class CharacterGenerationInput {
    private String title;
    private String prompt;
    private String negativePrompt;
    private List<AssetMediaResource> referenceAssets;
    private VideoStoryboard storyboard;
    private Map<String, Object> parameters;
    private Integer n;
    private Integer seed;
    private String format;
    private String name;
    private String description;
    private String appearance;
    private String personality;
    private String background;
    private String type;
    private String style;
    private String pose;
    private String expression;
    private String gender;
    private String age;
    private String clothing;
    private Integer width;
    private Integer height;
    private Boolean hd;
    private Boolean multiView;
    private Integer referenceAssetCount;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getNegativePrompt() {
        return this.negativePrompt;
    }
    
    public void setNegativePrompt(String negativePrompt) {
        this.negativePrompt = negativePrompt;
    }

    public List<AssetMediaResource> getReferenceAssets() {
        return this.referenceAssets;
    }
    
    public void setReferenceAssets(List<AssetMediaResource> referenceAssets) {
        this.referenceAssets = referenceAssets;
    }

    public VideoStoryboard getStoryboard() {
        return this.storyboard;
    }
    
    public void setStoryboard(VideoStoryboard storyboard) {
        this.storyboard = storyboard;
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }
    
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public Integer getN() {
        return this.n;
    }
    
    public void setN(Integer n) {
        this.n = n;
    }

    public Integer getSeed() {
        return this.seed;
    }
    
    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAppearance() {
        return this.appearance;
    }
    
    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getPersonality() {
        return this.personality;
    }
    
    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getBackground() {
        return this.background;
    }
    
    public void setBackground(String background) {
        this.background = background;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }

    public String getPose() {
        return this.pose;
    }
    
    public void setPose(String pose) {
        this.pose = pose;
    }

    public String getExpression() {
        return this.expression;
    }
    
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return this.age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }

    public String getClothing() {
        return this.clothing;
    }
    
    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public Integer getWidth() {
        return this.width;
    }
    
    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return this.height;
    }
    
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getHd() {
        return this.hd;
    }
    
    public void setHd(Boolean hd) {
        this.hd = hd;
    }

    public Boolean getMultiView() {
        return this.multiView;
    }
    
    public void setMultiView(Boolean multiView) {
        this.multiView = multiView;
    }

    public Integer getReferenceAssetCount() {
        return this.referenceAssetCount;
    }
    
    public void setReferenceAssetCount(Integer referenceAssetCount) {
        this.referenceAssetCount = referenceAssetCount;
    }
}
