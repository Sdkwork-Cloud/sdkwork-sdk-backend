package com.sdkwork.backend.model;

public class PlusUserProfileVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private ImageMediaResource faceImage;
    private VideoMediaResource faceVideo;
    private String username;
    private String nickname;
    private String email;
    private String phone;
    private String gender;
    private String status;
    private String countryCode;
    private String provinceCode;
    private String cityCode;
    private String districtCode;
    private String address;
    private String bio;
    private String birthDate;
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

    public VideoMediaResource getFaceVideo() {
        return this.faceVideo;
    }
    
    public void setFaceVideo(VideoMediaResource faceVideo) {
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

    public String getCountryCode() {
        return this.countryCode;
    }
    
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }
    
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return this.cityCode;
    }
    
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrictCode() {
        return this.districtCode;
    }
    
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getBio() {
        return this.bio;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBirthDate() {
        return this.birthDate;
    }
    
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public SocialInfoList getSocialInfoList() {
        return this.socialInfoList;
    }
    
    public void setSocialInfoList(SocialInfoList socialInfoList) {
        this.socialInfoList = socialInfoList;
    }
}
