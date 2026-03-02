package com.sdkwork.backend.model;

public class SpeechTranscriptionConfig {
    private String channel;
    private String product;
    private AudioTranscriptionOptions options;

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }

    public AudioTranscriptionOptions getOptions() {
        return this.options;
    }
    
    public void setOptions(AudioTranscriptionOptions options) {
        this.options = options;
    }
}
