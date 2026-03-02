package com.sdkwork.backend.model;

public class ProfileItem {
    private String name;
    private String label;
    private List<String> values;
    private Boolean custom;
    private Integer updateCount;
    private List<String> samples;
    private String description;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }

    public List<String> getValues() {
        return this.values;
    }
    
    public void setValues(List<String> values) {
        this.values = values;
    }

    public Boolean getCustom() {
        return this.custom;
    }
    
    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    public Integer getUpdateCount() {
        return this.updateCount;
    }
    
    public void setUpdateCount(Integer updateCount) {
        this.updateCount = updateCount;
    }

    public List<String> getSamples() {
        return this.samples;
    }
    
    public void setSamples(List<String> samples) {
        this.samples = samples;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
