package com.sdkwork.backend.model;

public class UserLocation {
    private String type;
    private Approximate approximate;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Approximate getApproximate() {
        return this.approximate;
    }
    
    public void setApproximate(Approximate approximate) {
        this.approximate = approximate;
    }
}
