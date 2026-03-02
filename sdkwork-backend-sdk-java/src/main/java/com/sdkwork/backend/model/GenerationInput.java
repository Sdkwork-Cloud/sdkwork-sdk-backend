package com.sdkwork.backend.model;

public class GenerationInput {
    private String type;
    private ImageGenerationInput image;
    private VideoGenerationInput video;
    private AudioGenerationInput audio;
    private MusicGenerationInput music;
    private CharacterGenerationInput character;
    private VoiceSpeakerGenerationInput voiceSpeaker;
    private AudioEffectGenerationInput audioEffect;
    private BaseGenerationInput input;
    private String prompt;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

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

    public CharacterGenerationInput getCharacter() {
        return this.character;
    }
    
    public void setCharacter(CharacterGenerationInput character) {
        this.character = character;
    }

    public VoiceSpeakerGenerationInput getVoiceSpeaker() {
        return this.voiceSpeaker;
    }
    
    public void setVoiceSpeaker(VoiceSpeakerGenerationInput voiceSpeaker) {
        this.voiceSpeaker = voiceSpeaker;
    }

    public AudioEffectGenerationInput getAudioEffect() {
        return this.audioEffect;
    }
    
    public void setAudioEffect(AudioEffectGenerationInput audioEffect) {
        this.audioEffect = audioEffect;
    }

    public BaseGenerationInput getInput() {
        return this.input;
    }
    
    public void setInput(BaseGenerationInput input) {
        this.input = input;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
