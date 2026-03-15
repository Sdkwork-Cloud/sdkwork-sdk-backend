package com.sdkwork.backend.model;

public class OrderDispatchAssignForm {
    private Integer workerUserId;
    private String remark;

    public Integer getWorkerUserId() {
        return this.workerUserId;
    }
    
    public void setWorkerUserId(Integer workerUserId) {
        this.workerUserId = workerUserId;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
