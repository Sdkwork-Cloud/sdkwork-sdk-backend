package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class SearchChatApi {
    private final HttpClient client;
    
    public SearchChatApi(HttpClient client) {
        this.client = client;
    }

    public PlusApiResultBoolean stop(Map<String, String> headers) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/search/chat/stop"), null, null, headers);
    }

    /** Create a chat completion with Search */
    public ChatCompletionChunk create(ChatCompletionCreateForm body, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/search/chat/completions"), body, null, headers);
    }
}
