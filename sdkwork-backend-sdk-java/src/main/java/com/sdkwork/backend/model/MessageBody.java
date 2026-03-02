package com.sdkwork.backend.model;

public class MessageBody {
    private String id;
    private ChatCompletion completion;
    private MsgPayload payload;
    private ChatCompletionChunk chunk;
    private AudioMediaResource audioFrame;
    private Map<String, GroupInfo> groupInfos;
    private Map<String, List<ChatCompletionChunk>> groups;
    private Integer thinkStart;
    private Integer thinkEnd;
    private ChatState state;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public ChatCompletion getCompletion() {
        return this.completion;
    }
    
    public void setCompletion(ChatCompletion completion) {
        this.completion = completion;
    }

    public MsgPayload getPayload() {
        return this.payload;
    }
    
    public void setPayload(MsgPayload payload) {
        this.payload = payload;
    }

    public ChatCompletionChunk getChunk() {
        return this.chunk;
    }
    
    public void setChunk(ChatCompletionChunk chunk) {
        this.chunk = chunk;
    }

    public AudioMediaResource getAudioFrame() {
        return this.audioFrame;
    }
    
    public void setAudioFrame(AudioMediaResource audioFrame) {
        this.audioFrame = audioFrame;
    }

    public Map<String, GroupInfo> getGroupInfos() {
        return this.groupInfos;
    }
    
    public void setGroupInfos(Map<String, GroupInfo> groupInfos) {
        this.groupInfos = groupInfos;
    }

    public Map<String, List<ChatCompletionChunk>> getGroups() {
        return this.groups;
    }
    
    public void setGroups(Map<String, List<ChatCompletionChunk>> groups) {
        this.groups = groups;
    }

    public Integer getThinkStart() {
        return this.thinkStart;
    }
    
    public void setThinkStart(Integer thinkStart) {
        this.thinkStart = thinkStart;
    }

    public Integer getThinkEnd() {
        return this.thinkEnd;
    }
    
    public void setThinkEnd(Integer thinkEnd) {
        this.thinkEnd = thinkEnd;
    }

    public ChatState getState() {
        return this.state;
    }
    
    public void setState(ChatState state) {
        this.state = state;
    }
}
