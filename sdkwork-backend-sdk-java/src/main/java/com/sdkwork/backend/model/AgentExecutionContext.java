package com.sdkwork.backend.model;

public class AgentExecutionContext {
    private String id;
    private String bizType;
    private String uuid;
    private Integer maxFlowSteps;
    private Integer flowSteps;
    private Integer threads;
    private String createAt;
    private Integer maxDuration;
    private List<ChatMessageListener> listeners;
    private String state;
    private ChatContext chatContext;
    private ShardingContext shardingContext;
    private Flow flow;
    private AgentExecutionContext root;
    private AgentExecutionContext parent;
    private PlusAgent pre;
    private PlusAgent current;
    private ChatResponseHandler responseHandler;
    private PlusProjectObject project;
    private PlusDiskObject disk;
    private PlusFileObject diskRootFile;
    private Boolean completed;
    private Boolean expired;
    private Map<String, AgentScope> agentSCOPES;
    private Boolean overSteps;
    private Boolean paused;
    private Boolean running;
    private Boolean failed;
    private Boolean waiting;
    private Boolean init;
    private Boolean end;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getBizType() {
        return this.bizType;
    }
    
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getMaxFlowSteps() {
        return this.maxFlowSteps;
    }
    
    public void setMaxFlowSteps(Integer maxFlowSteps) {
        this.maxFlowSteps = maxFlowSteps;
    }

    public Integer getFlowSteps() {
        return this.flowSteps;
    }
    
    public void setFlowSteps(Integer flowSteps) {
        this.flowSteps = flowSteps;
    }

    public Integer getThreads() {
        return this.threads;
    }
    
    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    public String getCreateAt() {
        return this.createAt;
    }
    
    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public Integer getMaxDuration() {
        return this.maxDuration;
    }
    
    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    public List<ChatMessageListener> getListeners() {
        return this.listeners;
    }
    
    public void setListeners(List<ChatMessageListener> listeners) {
        this.listeners = listeners;
    }

    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public ChatContext getChatContext() {
        return this.chatContext;
    }
    
    public void setChatContext(ChatContext chatContext) {
        this.chatContext = chatContext;
    }

    public ShardingContext getShardingContext() {
        return this.shardingContext;
    }
    
    public void setShardingContext(ShardingContext shardingContext) {
        this.shardingContext = shardingContext;
    }

    public Flow getFlow() {
        return this.flow;
    }
    
    public void setFlow(Flow flow) {
        this.flow = flow;
    }

    public AgentExecutionContext getRoot() {
        return this.root;
    }
    
    public void setRoot(AgentExecutionContext root) {
        this.root = root;
    }

    public AgentExecutionContext getParent() {
        return this.parent;
    }
    
    public void setParent(AgentExecutionContext parent) {
        this.parent = parent;
    }

    public PlusAgent getPre() {
        return this.pre;
    }
    
    public void setPre(PlusAgent pre) {
        this.pre = pre;
    }

    public PlusAgent getCurrent() {
        return this.current;
    }
    
    public void setCurrent(PlusAgent current) {
        this.current = current;
    }

    public ChatResponseHandler getResponseHandler() {
        return this.responseHandler;
    }
    
    public void setResponseHandler(ChatResponseHandler responseHandler) {
        this.responseHandler = responseHandler;
    }

    public PlusProjectObject getProject() {
        return this.project;
    }
    
    public void setProject(PlusProjectObject project) {
        this.project = project;
    }

    public PlusDiskObject getDisk() {
        return this.disk;
    }
    
    public void setDisk(PlusDiskObject disk) {
        this.disk = disk;
    }

    public PlusFileObject getDiskRootFile() {
        return this.diskRootFile;
    }
    
    public void setDiskRootFile(PlusFileObject diskRootFile) {
        this.diskRootFile = diskRootFile;
    }

    public Boolean getCompleted() {
        return this.completed;
    }
    
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Boolean getExpired() {
        return this.expired;
    }
    
    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Map<String, AgentScope> getAgentSCOPES() {
        return this.agentSCOPES;
    }
    
    public void setAgentSCOPES(Map<String, AgentScope> agentSCOPES) {
        this.agentSCOPES = agentSCOPES;
    }

    public Boolean getOverSteps() {
        return this.overSteps;
    }
    
    public void setOverSteps(Boolean overSteps) {
        this.overSteps = overSteps;
    }

    public Boolean getPaused() {
        return this.paused;
    }
    
    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    public Boolean getRunning() {
        return this.running;
    }
    
    public void setRunning(Boolean running) {
        this.running = running;
    }

    public Boolean getFailed() {
        return this.failed;
    }
    
    public void setFailed(Boolean failed) {
        this.failed = failed;
    }

    public Boolean getWaiting() {
        return this.waiting;
    }
    
    public void setWaiting(Boolean waiting) {
        this.waiting = waiting;
    }

    public Boolean getInit() {
        return this.init;
    }
    
    public void setInit(Boolean init) {
        this.init = init;
    }

    public Boolean getEnd() {
        return this.end;
    }
    
    public void setEnd(Boolean end) {
        this.end = end;
    }
}
