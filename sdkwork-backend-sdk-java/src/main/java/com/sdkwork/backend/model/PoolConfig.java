package com.sdkwork.backend.model;

public class PoolConfig {
    private Integer minIdle;
    private Integer maxPoolSize;
    private Integer connectionTimeout;
    private Integer idleTimeout;
    private Integer maxLifetime;
    private Boolean autoCommit;
    private String connectionTestQuery;
    private String poolName;

    public Integer getMinIdle() {
        return this.minIdle;
    }
    
    public void setMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
    }

    public Integer getMaxPoolSize() {
        return this.maxPoolSize;
    }
    
    public void setMaxPoolSize(Integer maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public Integer getConnectionTimeout() {
        return this.connectionTimeout;
    }
    
    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }
    
    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    public Integer getMaxLifetime() {
        return this.maxLifetime;
    }
    
    public void setMaxLifetime(Integer maxLifetime) {
        this.maxLifetime = maxLifetime;
    }

    public Boolean getAutoCommit() {
        return this.autoCommit;
    }
    
    public void setAutoCommit(Boolean autoCommit) {
        this.autoCommit = autoCommit;
    }

    public String getConnectionTestQuery() {
        return this.connectionTestQuery;
    }
    
    public void setConnectionTestQuery(String connectionTestQuery) {
        this.connectionTestQuery = connectionTestQuery;
    }

    public String getPoolName() {
        return this.poolName;
    }
    
    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }
}
