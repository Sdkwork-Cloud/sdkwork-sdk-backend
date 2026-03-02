package com.sdkwork.backend.model;

public class Approximate {
    private String city;
    private String country;
    private String region;
    private String timezone;

    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }

    public String getTimezone() {
        return this.timezone;
    }
    
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
