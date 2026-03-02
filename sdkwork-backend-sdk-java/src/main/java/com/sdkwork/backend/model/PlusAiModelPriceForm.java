package com.sdkwork.backend.model;

public class PlusAiModelPriceForm {
    private String objectId;
    private String model;
    private String unit;
    private Double price;
    private Double inputPrice;
    private Double batchInputPrice;
    private Double cachedInputPrice;
    private Double batchCachedInputPrice;
    private Double outputPrice;
    private Double batchOutputPrice;
    private String currency;

    public String getObjectId() {
        return this.objectId;
    }
    
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getInputPrice() {
        return this.inputPrice;
    }
    
    public void setInputPrice(Double inputPrice) {
        this.inputPrice = inputPrice;
    }

    public Double getBatchInputPrice() {
        return this.batchInputPrice;
    }
    
    public void setBatchInputPrice(Double batchInputPrice) {
        this.batchInputPrice = batchInputPrice;
    }

    public Double getCachedInputPrice() {
        return this.cachedInputPrice;
    }
    
    public void setCachedInputPrice(Double cachedInputPrice) {
        this.cachedInputPrice = cachedInputPrice;
    }

    public Double getBatchCachedInputPrice() {
        return this.batchCachedInputPrice;
    }
    
    public void setBatchCachedInputPrice(Double batchCachedInputPrice) {
        this.batchCachedInputPrice = batchCachedInputPrice;
    }

    public Double getOutputPrice() {
        return this.outputPrice;
    }
    
    public void setOutputPrice(Double outputPrice) {
        this.outputPrice = outputPrice;
    }

    public Double getBatchOutputPrice() {
        return this.batchOutputPrice;
    }
    
    public void setBatchOutputPrice(Double batchOutputPrice) {
        this.batchOutputPrice = batchOutputPrice;
    }

    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
