package com.sdkwork.backend.model;

public class PlusUserVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private ImageMediaResource faceImage;
    private ImageMediaResource faceVideo;
    private String username;
    private String nickname;
    private String email;
    private String phone;
    private String gender;
    private String status;
    private List<Integer> roleIds;
    private List<String> roleNames;
    private SocialInfoList socialInfoList;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ImageMediaResource getFaceImage() {
        return this.faceImage;
    }
    
    public void setFaceImage(ImageMediaResource faceImage) {
        this.faceImage = faceImage;
    }

    public ImageMediaResource getFaceVideo() {
        return this.faceVideo;
    }
    
    public void setFaceVideo(ImageMediaResource faceVideo) {
        this.faceVideo = faceVideo;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public List<Integer> getRoleIds() {
        return this.roleIds;
    }
    
    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    public List<String> getRoleNames() {
        return this.roleNames;
    }
    
    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }

    public SocialInfoList getSocialInfoList() {
        return this.socialInfoList;
    }
    
    public void setSocialInfoList(SocialInfoList socialInfoList) {
        this.socialInfoList = socialInfoList;
    }
}
