package com.sdkwork.backend.model;

public class GenerationInputParams {
    private ImageGenerationInput image;
    private VideoGenerationInput video;
    private AudioGenerationInput audio;
    private MusicGenerationInput music;
    private VoiceSpeakerGenerationInput voice;
    private CharacterGenerationInput character;
    private AudioEffectGenerationInput audioEffect;

    public ImageGenerationInput getImage() {
        return this.image;
    }
    
    public void setImage(ImageGenerationInput image) {
        this.image = image;
    }

    public VideoGenerationInput getVideo() {
        return this.video;
    }
    
    public void setVideo(VideoGenerationInput video) {
        this.video = video;
    }

    public AudioGenerationInput getAudio() {
        return this.audio;
    }
    
    public void setAudio(AudioGenerationInput audio) {
        this.audio = audio;
    }

    public MusicGenerationInput getMusic() {
        return this.music;
    }
    
    public void setMusic(MusicGenerationInput music) {
        this.music = music;
    }

    public VoiceSpeakerGenerationInput getVoice() {
        return this.voice;
    }
    
    public void setVoice(VoiceSpeakerGenerationInput voice) {
        this.voice = voice;
    }

    public CharacterGenerationInput getCharacter() {
        return this.character;
    }
    
    public void setCharacter(CharacterGenerationInput character) {
        this.character = character;
    }

    public AudioEffectGenerationInput getAudioEffect() {
        return this.audioEffect;
    }
    
    public void setAudioEffect(AudioEffectGenerationInput audioEffect) {
        this.audioEffect = audioEffect;
    }
}
