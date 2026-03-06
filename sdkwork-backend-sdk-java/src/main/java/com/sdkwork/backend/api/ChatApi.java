package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ChatApi {
    private final HttpClient client;
    
    public ChatApi(HttpClient client) {
        this.client = client;
    }

    /** Stop a chat completion stream */
    public PlusApiResult stop(Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (PlusApiResult) client.post(ApiPaths.backendPath("/chat/stop"), null, params, headers);
    }

    /** Create a chat completion */
    public ChatCompletionChunk create(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/chat/completions"), body, params, headers);
    }
}
