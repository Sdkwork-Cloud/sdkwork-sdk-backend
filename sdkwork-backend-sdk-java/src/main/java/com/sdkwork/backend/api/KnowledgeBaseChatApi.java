package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class KnowledgeBaseChatApi {
    private final HttpClient client;
    
    public KnowledgeBaseChatApi(HttpClient client) {
        this.client = client;
    }

    public PlusApiResultBoolean stop(Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/knowledge_base/chat/stop"), null, params, headers);
    }

    /** Create a chat completion with Knowledge base */
    public ChatCompletionChunk create(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/knowledge_base/chat/completions"), body, params, headers);
    }
}
