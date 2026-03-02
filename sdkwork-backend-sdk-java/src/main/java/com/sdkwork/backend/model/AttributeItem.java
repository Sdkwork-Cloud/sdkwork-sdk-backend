package com.sdkwork.backend.model;

public class AttributeItem {
    private Integer id;
    private String name;
    private List<String> values;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValues() {
        return this.values;
    }
    
    public void setValues(List<String> values) {
        this.values = values;
    }
}
