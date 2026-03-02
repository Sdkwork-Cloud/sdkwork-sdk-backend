package com.sdkwork.backend.model;

public class PPTNoteReply {
    private String id;
    private String content;
    private Integer time;
    private String user;

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
}
