package com.sdkwork.backend.model;

public class PlusMemberCardForm {
    private PlusCard card;
    private Boolean supplyBonus;
    private Boolean supplyBalance;
    private String bonusName;
    private String balanceName;
    private String prerogative;
    private Boolean autoActivate;
    private Boolean wxActivate;
    private Integer costMoneyUnit;
    private Integer increaseBonus;
    private Integer initIncreaseBonus;
    private Integer maxIncreaseBonus;
    private Integer costBonusUnit;
    private Integer reduceMoney;
    private Integer leastMoneyToUseBonus;
    private Integer maxReduceBonus;

    public PlusCard getCard() {
        return this.card;
    }
    
    public void setCard(PlusCard card) {
        this.card = card;
    }

    public Boolean getSupplyBonus() {
        return this.supplyBonus;
    }
    
    public void setSupplyBonus(Boolean supplyBonus) {
        this.supplyBonus = supplyBonus;
    }

    public Boolean getSupplyBalance() {
        return this.supplyBalance;
    }
    
    public void setSupplyBalance(Boolean supplyBalance) {
        this.supplyBalance = supplyBalance;
    }

    public String getBonusName() {
        return this.bonusName;
    }
    
    public void setBonusName(String bonusName) {
        this.bonusName = bonusName;
    }

    public String getBalanceName() {
        return this.balanceName;
    }
    
    public void setBalanceName(String balanceName) {
        this.balanceName = balanceName;
    }

    public String getPrerogative() {
        return this.prerogative;
    }
    
    public void setPrerogative(String prerogative) {
        this.prerogative = prerogative;
    }

    public Boolean getAutoActivate() {
        return this.autoActivate;
    }
    
    public void setAutoActivate(Boolean autoActivate) {
        this.autoActivate = autoActivate;
    }

    public Boolean getWxActivate() {
        return this.wxActivate;
    }
    
    public void setWxActivate(Boolean wxActivate) {
        this.wxActivate = wxActivate;
    }

    public Integer getCostMoneyUnit() {
        return this.costMoneyUnit;
    }
    
    public void setCostMoneyUnit(Integer costMoneyUnit) {
        this.costMoneyUnit = costMoneyUnit;
    }

    public Integer getIncreaseBonus() {
        return this.increaseBonus;
    }
    
    public void setIncreaseBonus(Integer increaseBonus) {
        this.increaseBonus = increaseBonus;
    }

    public Integer getInitIncreaseBonus() {
        return this.initIncreaseBonus;
    }
    
    public void setInitIncreaseBonus(Integer initIncreaseBonus) {
        this.initIncreaseBonus = initIncreaseBonus;
    }

    public Integer getMaxIncreaseBonus() {
        return this.maxIncreaseBonus;
    }
    
    public void setMaxIncreaseBonus(Integer maxIncreaseBonus) {
        this.maxIncreaseBonus = maxIncreaseBonus;
    }

    public Integer getCostBonusUnit() {
        return this.costBonusUnit;
    }
    
    public void setCostBonusUnit(Integer costBonusUnit) {
        this.costBonusUnit = costBonusUnit;
    }

    public Integer getReduceMoney() {
        return this.reduceMoney;
    }
    
    public void setReduceMoney(Integer reduceMoney) {
        this.reduceMoney = reduceMoney;
    }

    public Integer getLeastMoneyToUseBonus() {
        return this.leastMoneyToUseBonus;
    }
    
    public void setLeastMoneyToUseBonus(Integer leastMoneyToUseBonus) {
        this.leastMoneyToUseBonus = leastMoneyToUseBonus;
    }

    public Integer getMaxReduceBonus() {
        return this.maxReduceBonus;
    }
    
    public void setMaxReduceBonus(Integer maxReduceBonus) {
        this.maxReduceBonus = maxReduceBonus;
    }
}
