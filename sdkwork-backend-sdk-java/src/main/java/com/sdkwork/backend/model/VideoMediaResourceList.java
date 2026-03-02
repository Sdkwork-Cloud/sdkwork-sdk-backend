package com.sdkwork.backend.model;

public class VideoMediaResourceList {
    private List<VideoMediaResource> videos;
    private List<AssetMediaResource> resources;

    public List<VideoMediaResource> getVideos() {
        return this.videos;
    }
    
    public void setVideos(List<VideoMediaResource> videos) {
        this.videos = videos;
    }

    public List<AssetMediaResource> getResources() {
        return this.resources;
    }
    
    public void setResources(List<AssetMediaResource> resources) {
        this.resources = resources;
    }
}
