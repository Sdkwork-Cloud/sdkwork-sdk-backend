package com.sdkwork.backend.model;

public class SceneContent {
    private List<String> scenes;
    private List<SceneContent> children;

    public List<String> getScenes() {
        return this.scenes;
    }
    
    public void setScenes(List<String> scenes) {
        this.scenes = scenes;
    }

    public List<SceneContent> getChildren() {
        return this.children;
    }
    
    public void setChildren(List<SceneContent> children) {
        this.children = children;
    }
}
