package com.sdkwork.backend.model;

public class DatasourceConfig {
    private String type;
    private String host;
    private Integer port;
    private String database;
    private String username;
    private String password;
    private String params;
    private PoolConfig poolConfig;
    private String driverClassName;
    private String jdbcUrl;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return this.port;
    }
    
    public void setPort(Integer port) {
        this.port = port;
    }

    public String getDatabase() {
        return this.database;
    }
    
    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getParams() {
        return this.params;
    }
    
    public void setParams(String params) {
        this.params = params;
    }

    public PoolConfig getPoolConfig() {
        return this.poolConfig;
    }
    
    public void setPoolConfig(PoolConfig poolConfig) {
        this.poolConfig = poolConfig;
    }

    public String getDriverClassName() {
        return this.driverClassName;
    }
    
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getJdbcUrl() {
        return this.jdbcUrl;
    }
    
    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
