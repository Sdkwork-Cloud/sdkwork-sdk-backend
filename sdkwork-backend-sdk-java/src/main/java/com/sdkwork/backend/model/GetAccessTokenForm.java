package com.sdkwork.backend.model;

public class GetAccessTokenForm {
    private Integer id;
    private List<String> platforms;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }
    
    public void setPlatforms(List<String> platforms) {
        this.platforms = platforms;
    }
}
