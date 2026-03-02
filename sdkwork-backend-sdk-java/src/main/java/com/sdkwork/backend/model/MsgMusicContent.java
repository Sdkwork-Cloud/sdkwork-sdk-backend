package com.sdkwork.backend.model;

public class MsgMusicContent {
    private String content;
    private MusicMediaResource resource;
    private String title;
    private String artist;
    private String album;
    private Integer duration;

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public MusicMediaResource getResource() {
        return this.resource;
    }
    
    public void setResource(MusicMediaResource resource) {
        this.resource = resource;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return this.album;
    }
    
    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
