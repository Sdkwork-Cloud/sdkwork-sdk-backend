package com.sdkwork.backend.model;

public class TagsContent {
    private List<String> tags;
    private List<TagsContent> children;

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<TagsContent> getChildren() {
        return this.children;
    }
    
    public void setChildren(List<TagsContent> children) {
        this.children = children;
    }
}
