package com.sdkwork.backend.model;

public class MsgLocationContent {
    private String content;
    private GeoPoint location;
    private String address;
    private String name;
    private Double radius;

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Double getRadius() {
        return this.radius;
    }
    
    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
