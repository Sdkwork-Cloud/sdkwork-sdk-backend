package com.sdkwork.backend.model;

public class FileListVO {
    private List<FileItemVO> data;
    private String object;

    public List<FileItemVO> getData() {
        return this.data;
    }
    
    public void setData(List<FileItemVO> data) {
        this.data = data;
    }

    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }
}
