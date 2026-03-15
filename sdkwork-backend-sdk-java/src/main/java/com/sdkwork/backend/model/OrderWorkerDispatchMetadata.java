package com.sdkwork.backend.model;

public class OrderWorkerDispatchMetadata {
    private List<String> enabledTaskCodes;
    private Map<String, Integer> taskConcurrentOverrides;

    public List<String> getEnabledTaskCodes() {
        return this.enabledTaskCodes;
    }
    
    public void setEnabledTaskCodes(List<String> enabledTaskCodes) {
        this.enabledTaskCodes = enabledTaskCodes;
    }

    public Map<String, Integer> getTaskConcurrentOverrides() {
        return this.taskConcurrentOverrides;
    }
    
    public void setTaskConcurrentOverrides(Map<String, Integer> taskConcurrentOverrides) {
        this.taskConcurrentOverrides = taskConcurrentOverrides;
    }
}
