package com.sdkwork.backend.model;

public class Flow {
    private String id;
    private String name;
    private String description;
    private String status;
    private List<Node> nodes;
    private List<EdgeObject> edges;
    private List<Flow> subFlows;
    private Integer parentId;
    private String startTime;
    private String endTime;
    private Flow parentFlow;
    private List<PlusAgent> allAgents;
    private Node lastNode;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public List<Node> getNodes() {
        return this.nodes;
    }
    
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<EdgeObject> getEdges() {
        return this.edges;
    }
    
    public void setEdges(List<EdgeObject> edges) {
        this.edges = edges;
    }

    public List<Flow> getSubFlows() {
        return this.subFlows;
    }
    
    public void setSubFlows(List<Flow> subFlows) {
        this.subFlows = subFlows;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Flow getParentFlow() {
        return this.parentFlow;
    }
    
    public void setParentFlow(Flow parentFlow) {
        this.parentFlow = parentFlow;
    }

    public List<PlusAgent> getAllAgents() {
        return this.allAgents;
    }
    
    public void setAllAgents(List<PlusAgent> allAgents) {
        this.allAgents = allAgents;
    }

    public Node getLastNode() {
        return this.lastNode;
    }
    
    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }
}
