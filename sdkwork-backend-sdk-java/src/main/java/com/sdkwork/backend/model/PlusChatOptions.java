package com.sdkwork.backend.model;

public class PlusChatOptions {
    private Boolean streamUsage;
    private String model;
    private Double frequencyPenalty;
    private Map<String, Integer> logitBias;
    private Boolean logprobs;
    private Integer topLogprobs;
    private Integer maxTokens;
    private Integer maxCompletionTokens;
    private Integer n;
    private List<String> modalities;
    private AudioParameters audio;
    private Double presencePenalty;
    private ResponseFormat responseFormat;
    private StreamOptions streamOptions;
    private Boolean stream;
    private Integer seed;
    private List<String> stop;
    private Double temperature;
    private Double topP;
    private List<FunctionTool> tools;
    private Object toolChoice;
    private String user;
    private Boolean parallelToolCalls;
    private Boolean store;
    private Map<String, String> metadata;
    private String reasoningEffort;
    private String verbosity;
    private WebSearchOptions webSearchOptions;

    public Boolean getStreamUsage() {
        return this.streamUsage;
    }
    
    public void setStreamUsage(Boolean streamUsage) {
        this.streamUsage = streamUsage;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Double getFrequencyPenalty() {
        return this.frequencyPenalty;
    }
    
    public void setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    public Map<String, Integer> getLogitBias() {
        return this.logitBias;
    }
    
    public void setLogitBias(Map<String, Integer> logitBias) {
        this.logitBias = logitBias;
    }

    public Boolean getLogprobs() {
        return this.logprobs;
    }
    
    public void setLogprobs(Boolean logprobs) {
        this.logprobs = logprobs;
    }

    public Integer getTopLogprobs() {
        return this.topLogprobs;
    }
    
    public void setTopLogprobs(Integer topLogprobs) {
        this.topLogprobs = topLogprobs;
    }

    public Integer getMaxTokens() {
        return this.maxTokens;
    }
    
    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public Integer getMaxCompletionTokens() {
        return this.maxCompletionTokens;
    }
    
    public void setMaxCompletionTokens(Integer maxCompletionTokens) {
        this.maxCompletionTokens = maxCompletionTokens;
    }

    public Integer getN() {
        return this.n;
    }
    
    public void setN(Integer n) {
        this.n = n;
    }

    public List<String> getModalities() {
        return this.modalities;
    }
    
    public void setModalities(List<String> modalities) {
        this.modalities = modalities;
    }

    public AudioParameters getAudio() {
        return this.audio;
    }
    
    public void setAudio(AudioParameters audio) {
        this.audio = audio;
    }

    public Double getPresencePenalty() {
        return this.presencePenalty;
    }
    
    public void setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    public ResponseFormat getResponseFormat() {
        return this.responseFormat;
    }
    
    public void setResponseFormat(ResponseFormat responseFormat) {
        this.responseFormat = responseFormat;
    }

    public StreamOptions getStreamOptions() {
        return this.streamOptions;
    }
    
    public void setStreamOptions(StreamOptions streamOptions) {
        this.streamOptions = streamOptions;
    }

    public Boolean getStream() {
        return this.stream;
    }
    
    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public Integer getSeed() {
        return this.seed;
    }
    
    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public List<String> getStop() {
        return this.stop;
    }
    
    public void setStop(List<String> stop) {
        this.stop = stop;
    }

    public Double getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getTopP() {
        return this.topP;
    }
    
    public void setTopP(Double topP) {
        this.topP = topP;
    }

    public List<FunctionTool> getTools() {
        return this.tools;
    }
    
    public void setTools(List<FunctionTool> tools) {
        this.tools = tools;
    }

    public Object getToolChoice() {
        return this.toolChoice;
    }
    
    public void setToolChoice(Object toolChoice) {
        this.toolChoice = toolChoice;
    }

    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public Boolean getParallelToolCalls() {
        return this.parallelToolCalls;
    }
    
    public void setParallelToolCalls(Boolean parallelToolCalls) {
        this.parallelToolCalls = parallelToolCalls;
    }

    public Boolean getStore() {
        return this.store;
    }
    
    public void setStore(Boolean store) {
        this.store = store;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public String getReasoningEffort() {
        return this.reasoningEffort;
    }
    
    public void setReasoningEffort(String reasoningEffort) {
        this.reasoningEffort = reasoningEffort;
    }

    public String getVerbosity() {
        return this.verbosity;
    }
    
    public void setVerbosity(String verbosity) {
        this.verbosity = verbosity;
    }

    public WebSearchOptions getWebSearchOptions() {
        return this.webSearchOptions;
    }
    
    public void setWebSearchOptions(WebSearchOptions webSearchOptions) {
        this.webSearchOptions = webSearchOptions;
    }
}
