package com.sdkwork.backend.model;

public class PlusNotesPublishArticleForm {
    private Integer noteId;
    private String noteUuid;
    private String title;
    private String content;
    private String digest;
    private String author;
    private String thumbMediaId;
    private String contentSourceUrl;
    private Integer showCoverPic;
    private Integer needOpenComment;
    private Integer onlyFansCanComment;

    public Integer getNoteId() {
        return this.noteId;
    }
    
    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getNoteUuid() {
        return this.noteUuid;
    }
    
    public void setNoteUuid(String noteUuid) {
        this.noteUuid = noteUuid;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getDigest() {
        return this.digest;
    }
    
    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getThumbMediaId() {
        return this.thumbMediaId;
    }
    
    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    public String getContentSourceUrl() {
        return this.contentSourceUrl;
    }
    
    public void setContentSourceUrl(String contentSourceUrl) {
        this.contentSourceUrl = contentSourceUrl;
    }

    public Integer getShowCoverPic() {
        return this.showCoverPic;
    }
    
    public void setShowCoverPic(Integer showCoverPic) {
        this.showCoverPic = showCoverPic;
    }

    public Integer getNeedOpenComment() {
        return this.needOpenComment;
    }
    
    public void setNeedOpenComment(Integer needOpenComment) {
        this.needOpenComment = needOpenComment;
    }

    public Integer getOnlyFansCanComment() {
        return this.onlyFansCanComment;
    }
    
    public void setOnlyFansCanComment(Integer onlyFansCanComment) {
        this.onlyFansCanComment = onlyFansCanComment;
    }
}
