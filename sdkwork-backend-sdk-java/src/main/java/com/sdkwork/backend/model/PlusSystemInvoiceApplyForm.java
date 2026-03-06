package com.sdkwork.backend.model;

public class PlusSystemInvoiceApplyForm {
    private String title;
    private String taxId;
    private String type;
    private Double amount;
    private String content;
    private String email;
    private String address;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaxId() {
        return this.taxId;
    }
    
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}
