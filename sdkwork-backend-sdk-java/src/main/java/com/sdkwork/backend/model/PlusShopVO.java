package com.sdkwork.backend.model;

public class PlusShopVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer userId;
    private String name;
    private String description;
    private ImageMediaResource logo;
    private ImageMediaResource cover;
    private String contactPhone;
    private String contactEmail;
    private GeoPoint location;
    private String address;
    private String licenseNumber;
    private List<String> tags;
    private String status;
    private String businessHours;

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

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public ImageMediaResource getLogo() {
        return this.logo;
    }
    
    public void setLogo(ImageMediaResource logo) {
        this.logo = logo;
    }

    public ImageMediaResource getCover() {
        return this.cover;
    }
    
    public void setCover(ImageMediaResource cover) {
        this.cover = cover;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }
    
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }
    
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public GeoPoint getLocation() {
        return this.location;
    }
    
    public void setLocation(GeoPoint location) {
        this.location = location;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }
    
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getBusinessHours() {
        return this.businessHours;
    }
    
    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }
}
