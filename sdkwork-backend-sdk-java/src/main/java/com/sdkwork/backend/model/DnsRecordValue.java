package com.sdkwork.backend.model;

public class DnsRecordValue {
    private List<String> values;
    private Boolean empty;
    private String firstValue;

    public List<String> getValues() {
        return this.values;
    }
    
    public void setValues(List<String> values) {
        this.values = values;
    }

    public Boolean getEmpty() {
        return this.empty;
    }
    
    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public String getFirstValue() {
        return this.firstValue;
    }
    
    public void setFirstValue(String firstValue) {
        this.firstValue = firstValue;
    }
}
