package com.sdkwork.backend.model;

public class VectorAccountConfig {
    private Integer id;
    private String uuid;
    private String region;
    private Integer weight;
    private String channel;
    private String product;
    private List<String> functions;
    private AccountConfigMetadata metadata;
    private Map<String, Object> properties;
    private Integer dimension;
    private String indexType;
    private String indexName;
    private Integer embeddingConfigId;
    private String databaseName;
    private String collectionName;
    private EmbeddingAccountConfig embeddingConfig;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getWeight() {
        return this.weight;
    }
    
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }

    public List<String> getFunctions() {
        return this.functions;
    }
    
    public void setFunctions(List<String> functions) {
        this.functions = functions;
    }

    public AccountConfigMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(AccountConfigMetadata metadata) {
        this.metadata = metadata;
    }

    public Map<String, Object> getProperties() {
        return this.properties;
    }
    
    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public Integer getDimension() {
        return this.dimension;
    }
    
    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    public String getIndexType() {
        return this.indexType;
    }
    
    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    public String getIndexName() {
        return this.indexName;
    }
    
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public Integer getEmbeddingConfigId() {
        return this.embeddingConfigId;
    }
    
    public void setEmbeddingConfigId(Integer embeddingConfigId) {
        this.embeddingConfigId = embeddingConfigId;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }
    
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getCollectionName() {
        return this.collectionName;
    }
    
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public EmbeddingAccountConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }
    
    public void setEmbeddingConfig(EmbeddingAccountConfig embeddingConfig) {
        this.embeddingConfig = embeddingConfig;
    }
}
