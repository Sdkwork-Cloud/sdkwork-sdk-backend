package com.sdkwork.backend.model;

public class PlusCategoryVO {
    private String parentUuid;
    private PlusTreeParentMetadata parentMetadata;
    private Integer id;
    private String uuid;
    private String createdAt;
    private String updatedAt;
    private String name;
    private String description;
    private String type;
    private String icon;
    private Integer sortWeight;
    private Integer parentId;
    private List<String> path;
    private Integer visible;
    private String status;
    private List<PlusCategoryVO> children;
    private TagsContent tags;
    private List<Integer> attributeIds;

    public String getParentUuid() {
        return this.parentUuid;
    }
    
    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    public PlusTreeParentMetadata getParentMetadata() {
        return this.parentMetadata;
    }
    
    public void setParentMetadata(PlusTreeParentMetadata parentMetadata) {
        this.parentMetadata = parentMetadata;
    }

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

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSortWeight() {
        return this.sortWeight;
    }
    
    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<String> getPath() {
        return this.path;
    }
    
    public void setPath(List<String> path) {
        this.path = path;
    }

    public Integer getVisible() {
        return this.visible;
    }
    
    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public List<PlusCategoryVO> getChildren() {
        return this.children;
    }
    
    public void setChildren(List<PlusCategoryVO> children) {
        this.children = children;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public List<Integer> getAttributeIds() {
        return this.attributeIds;
    }
    
    public void setAttributeIds(List<Integer> attributeIds) {
        this.attributeIds = attributeIds;
    }
}
