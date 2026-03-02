package com.sdkwork.backend.model;

public class PlusVipBenefitForm {
    private String name;
    private String description;
    private String benefitKey;
    private String type;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getBenefitKey() {
        return this.benefitKey;
    }
    
    public void setBenefitKey(String benefitKey) {
        this.benefitKey = benefitKey;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
