package com.sdkwork.backend.model;

public class TeamAgentMembers {
    private Integer id;
    private String uuid;
    private String type;
    private String bizType;
    private String description;
    private List<Object> agents;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getBizType() {
        return this.bizType;
    }
    
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getAgents() {
        return this.agents;
    }
    
    public void setAgents(List<Object> agents) {
        this.agents = agents;
    }
}
