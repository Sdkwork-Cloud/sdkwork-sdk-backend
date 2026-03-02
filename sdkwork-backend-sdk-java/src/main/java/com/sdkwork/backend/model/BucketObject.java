package com.sdkwork.backend.model;

public class BucketObject {
    private String name;
    private String region;
    private String creationDate;
    private String arn;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }

    public String getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getArn() {
        return this.arn;
    }
    
    public void setArn(String arn) {
        this.arn = arn;
    }
}
