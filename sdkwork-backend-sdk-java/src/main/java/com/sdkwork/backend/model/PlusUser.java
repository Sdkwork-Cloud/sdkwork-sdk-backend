package com.sdkwork.backend.model;

public class PlusUser {
    private Integer tenantId;
    private Integer organizationId;
    private String dataScope;
    private Integer id;
    private String uuid;
    private String createdAt;
    private String updatedAt;
    private Integer v;
    private String username;
    private String nickname;
    private String password;
    private String platform;
    private String type;
    private String gender;
    private ImageMediaResource faceImage;
    private VideoMediaResource faceVideo;
    private String salt;
    private String scene;
    private String email;
    private String phone;
    private String countryCode;
    private String provinceCode;
    private String cityCode;
    private String districtCode;
    private String address;
    private String bio;
    private String birthDate;
    private GetUserInfoResponse oauthUserInfo;
    private String status;
    private List<PlusRole> roles;
    private UserMetadata metadata;
    private SocialInfoList socialInfoList;
    private List<String> roleCodes;
    private List<GrantedAuthority> authorities;

    public Integer getTenantId() {
        return this.tenantId;
    }
    
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getOrganizationId() {
        return this.organizationId;
    }
    
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getDataScope() {
        return this.dataScope;
    }
    
    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
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

    public Integer getV() {
        return this.v;
    }
    
    public void setV(Integer v) {
        this.v = v;
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

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
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

    public String getSalt() {
        return this.salt;
    }
    
    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getScene() {
        return this.scene;
    }
    
    public void setScene(String scene) {
        this.scene = scene;
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

    public GetUserInfoResponse getOauthUserInfo() {
        return this.oauthUserInfo;
    }
    
    public void setOauthUserInfo(GetUserInfoResponse oauthUserInfo) {
        this.oauthUserInfo = oauthUserInfo;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public List<PlusRole> getRoles() {
        return this.roles;
    }
    
    public void setRoles(List<PlusRole> roles) {
        this.roles = roles;
    }

    public UserMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(UserMetadata metadata) {
        this.metadata = metadata;
    }

    public SocialInfoList getSocialInfoList() {
        return this.socialInfoList;
    }
    
    public void setSocialInfoList(SocialInfoList socialInfoList) {
        this.socialInfoList = socialInfoList;
    }

    public List<String> getRoleCodes() {
        return this.roleCodes;
    }
    
    public void setRoleCodes(List<String> roleCodes) {
        this.roleCodes = roleCodes;
    }

    public List<GrantedAuthority> getAuthorities() {
        return this.authorities;
    }
    
    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
}
