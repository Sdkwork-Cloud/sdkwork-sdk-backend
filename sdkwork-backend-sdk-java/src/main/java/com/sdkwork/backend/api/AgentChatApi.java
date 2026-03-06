package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AgentChatApi {
    private final HttpClient client;
    
    public AgentChatApi(HttpClient client) {
        this.client = client;
    }

    /** Create a chat completion with agent */
    public ChatCompletionChunk withContext(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/agent/chat/with_context"), body, params, headers);
    }

    /** Stop a chat completion stream */
    public PlusApiResult stop(Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (PlusApiResult) client.post(ApiPaths.backendPath("/agent/chat/stop"), null, params, headers);
    }

    /** Create a chat completion with agent */
    public ChatCompletionChunk resumeStream(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/agent/chat/resume_stream"), body, params, headers);
    }

    /** Create a chat completion with agent */
    public ChatCompletionChunk create(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/agent/chat/completions"), body, params, headers);
    }
}
