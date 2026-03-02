package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AiAgentChatApi {
    private final HttpClient client;
    
    public AiAgentChatApi(HttpClient client) {
        this.client = client;
    }

    /** Create a chat completion with agent */
    public ChatCompletionChunk withContext(ChatCompletionCreateForm body, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/agent/chat/with_context"), body, null, headers);
    }

    /** Stop a chat completion stream */
    public PlusApiResult stop(Map<String, String> headers) throws Exception {
        return (PlusApiResult) client.post(ApiPaths.backendPath("/agent/chat/stop"), null, null, headers);
    }

    /** Create a chat completion with agent */
    public ChatCompletionChunk resumeStream(ChatCompletionCreateForm body, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/agent/chat/resume_stream"), body, null, headers);
    }

    /** Create a chat completion with agent */
    public ChatCompletionChunk create(ChatCompletionCreateForm body, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/agent/chat/completions"), body, null, headers);
    }
}
