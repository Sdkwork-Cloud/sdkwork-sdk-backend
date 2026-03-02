package com.sdkwork.backend.model;

public class Participant {
    private Integer id;
    private String uuid;
    private String openId;
    private String unionId;
    private String name;
    private ImageMediaResource face;
    private Integer deviceId;
    private String deviceUuid;
    private Boolean device;

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

    public String getOpenId() {
        return this.openId;
    }
    
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return this.unionId;
    }
    
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public ImageMediaResource getFace() {
        return this.face;
    }
    
    public void setFace(ImageMediaResource face) {
        this.face = face;
    }

    public Integer getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceUuid() {
        return this.deviceUuid;
    }
    
    public void setDeviceUuid(String deviceUuid) {
        this.deviceUuid = deviceUuid;
    }

    public Boolean getDevice() {
        return this.device;
    }
    
    public void setDevice(Boolean device) {
        this.device = device;
    }
}
