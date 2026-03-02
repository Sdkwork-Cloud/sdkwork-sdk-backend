package com.sdkwork.backend.model;

public class MsgPayload {
    private MsgAudioContent audio;
    private MsgFileContent file;
    private MsgImageContent image;
    private MsgLocationContent location;
    private MsgMusicContent music;
    private MsgTextContent text;
    private MsgVideoContent video;

    public MsgAudioContent getAudio() {
        return this.audio;
    }
    
    public void setAudio(MsgAudioContent audio) {
        this.audio = audio;
    }

    public MsgFileContent getFile() {
        return this.file;
    }
    
    public void setFile(MsgFileContent file) {
        this.file = file;
    }

    public MsgImageContent getImage() {
        return this.image;
    }
    
    public void setImage(MsgImageContent image) {
        this.image = image;
    }

    public MsgLocationContent getLocation() {
        return this.location;
    }
    
    public void setLocation(MsgLocationContent location) {
        this.location = location;
    }

    public MsgMusicContent getMusic() {
        return this.music;
    }
    
    public void setMusic(MsgMusicContent music) {
        this.music = music;
    }

    public MsgTextContent getText() {
        return this.text;
    }
    
    public void setText(MsgTextContent text) {
        this.text = text;
    }

    public MsgVideoContent getVideo() {
        return this.video;
    }
    
    public void setVideo(MsgVideoContent video) {
        this.video = video;
    }
}
