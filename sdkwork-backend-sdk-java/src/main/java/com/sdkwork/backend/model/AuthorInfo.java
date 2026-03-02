package com.sdkwork.backend.model;

public class AuthorInfo {
    private Integer id;
    private ImageMediaResource faceImage;
    private String name;
    private String email;
    private String bio;
    private String website;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public ImageMediaResource getFaceImage() {
        return this.faceImage;
    }
    
    public void setFaceImage(ImageMediaResource faceImage) {
        this.faceImage = faceImage;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return this.bio;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
}
