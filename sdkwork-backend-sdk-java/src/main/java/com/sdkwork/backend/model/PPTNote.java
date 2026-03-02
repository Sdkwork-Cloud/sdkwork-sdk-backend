package com.sdkwork.backend.model;

public class PPTNote {
    private String id;
    private String content;
    private Integer time;
    private String user;
    private String elId;
    private List<PPTNoteReply> replies;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTime() {
        return this.time;
    }
    
    public void setTime(Integer time) {
        this.time = time;
    }

    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public String getElId() {
        return this.elId;
    }
    
    public void setElId(String elId) {
        this.elId = elId;
    }

    public List<PPTNoteReply> getReplies() {
        return this.replies;
    }
    
    public void setReplies(List<PPTNoteReply> replies) {
        this.replies = replies;
    }
}
