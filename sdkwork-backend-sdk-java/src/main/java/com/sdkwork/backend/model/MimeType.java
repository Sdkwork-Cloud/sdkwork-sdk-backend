package com.sdkwork.backend.model;

public class MimeType {
    private String type;
    private String subtype;
    private Map<String, String> parameters;
    private String charset;
    private Boolean concrete;
    private Boolean wildcardSubtype;
    private Boolean wildcardType;
    private String subtypeSuffix;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return this.subtype;
    }
    
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public Map<String, String> getParameters() {
        return this.parameters;
    }
    
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public String getCharset() {
        return this.charset;
    }
    
    public void setCharset(String charset) {
        this.charset = charset;
    }

    public Boolean getConcrete() {
        return this.concrete;
    }
    
    public void setConcrete(Boolean concrete) {
        this.concrete = concrete;
    }

    public Boolean getWildcardSubtype() {
        return this.wildcardSubtype;
    }
    
    public void setWildcardSubtype(Boolean wildcardSubtype) {
        this.wildcardSubtype = wildcardSubtype;
    }

    public Boolean getWildcardType() {
        return this.wildcardType;
    }
    
    public void setWildcardType(Boolean wildcardType) {
        this.wildcardType = wildcardType;
    }

    public String getSubtypeSuffix() {
        return this.subtypeSuffix;
    }
    
    public void setSubtypeSuffix(String subtypeSuffix) {
        this.subtypeSuffix = subtypeSuffix;
    }
}
