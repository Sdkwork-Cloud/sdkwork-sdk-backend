package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private final HttpClient client;
    
    public SearchApi(HttpClient client) {
        this.client = client;
    }

    public PlusApiResultBoolean stop(Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/search/chat/stop"), null, params, headers);
    }

    /** Create a chat completion with Search */
    public ChatCompletionChunk create(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/search/chat/completions"), body, params, headers);
    }
}
