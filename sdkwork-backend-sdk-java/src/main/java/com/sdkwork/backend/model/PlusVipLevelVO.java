package com.sdkwork.backend.model;

public class PlusVipLevelVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private Integer levelValue;
    private Integer requiredPoints;
    private String description;
    private List<Integer> benefitIds;
    private List<PlusVipBenefitVO> benefits;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

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

    public Integer getLevelValue() {
        return this.levelValue;
    }
    
    public void setLevelValue(Integer levelValue) {
        this.levelValue = levelValue;
    }

    public Integer getRequiredPoints() {
        return this.requiredPoints;
    }
    
    public void setRequiredPoints(Integer requiredPoints) {
        this.requiredPoints = requiredPoints;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getBenefitIds() {
        return this.benefitIds;
    }
    
    public void setBenefitIds(List<Integer> benefitIds) {
        this.benefitIds = benefitIds;
    }

    public List<PlusVipBenefitVO> getBenefits() {
        return this.benefits;
    }
    
    public void setBenefits(List<PlusVipBenefitVO> benefits) {
        this.benefits = benefits;
    }
}
