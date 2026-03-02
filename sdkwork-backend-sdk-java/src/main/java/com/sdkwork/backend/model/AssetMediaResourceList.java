package com.sdkwork.backend.model;

public class AssetMediaResourceList {
    private List<ImageMediaResource> images;
    private List<VideoMediaResource> videos;
    private List<AudioMediaResource> audios;
    private List<FileMediaResource> files;
    private List<MusicMediaResource> musics;
    private List<AssetMediaResource> resources;

    public List<ImageMediaResource> getImages() {
        return this.images;
    }
    
    public void setImages(List<ImageMediaResource> images) {
        this.images = images;
    }

    public List<VideoMediaResource> getVideos() {
        return this.videos;
    }
    
    public void setVideos(List<VideoMediaResource> videos) {
        this.videos = videos;
    }

    public List<AudioMediaResource> getAudios() {
        return this.audios;
    }
    
    public void setAudios(List<AudioMediaResource> audios) {
        this.audios = audios;
    }

    public List<FileMediaResource> getFiles() {
        return this.files;
    }
    
    public void setFiles(List<FileMediaResource> files) {
        this.files = files;
    }

    public List<MusicMediaResource> getMusics() {
        return this.musics;
    }
    
    public void setMusics(List<MusicMediaResource> musics) {
        this.musics = musics;
    }

    public List<AssetMediaResource> getResources() {
        return this.resources;
    }
    
    public void setResources(List<AssetMediaResource> resources) {
        this.resources = resources;
    }
}
