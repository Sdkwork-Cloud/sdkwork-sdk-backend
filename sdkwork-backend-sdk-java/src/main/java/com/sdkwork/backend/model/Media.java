package com.sdkwork.backend.model;

public class Media {
    private String id;
    private MimeType mimeType;
    private Object data;
    private String name;
    private String dataAsByteArray;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public MimeType getMimeType() {
        return this.mimeType;
    }
    
    public void setMimeType(MimeType mimeType) {
        this.mimeType = mimeType;
    }

    public Object getData() {
        return this.data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDataAsByteArray() {
        return this.dataAsByteArray;
    }
    
    public void setDataAsByteArray(String dataAsByteArray) {
        this.dataAsByteArray = dataAsByteArray;
    }
}
