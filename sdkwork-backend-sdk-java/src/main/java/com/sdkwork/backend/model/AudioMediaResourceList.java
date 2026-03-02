package com.sdkwork.backend.model;

public class AudioMediaResourceList {
    private List<AudioMediaResource> audios;
    private List<AssetMediaResource> resources;

    public List<AudioMediaResource> getAudios() {
        return this.audios;
    }
    
    public void setAudios(List<AudioMediaResource> audios) {
        this.audios = audios;
    }

    public List<AssetMediaResource> getResources() {
        return this.resources;
    }
    
    public void setResources(List<AssetMediaResource> resources) {
        this.resources = resources;
    }
}
