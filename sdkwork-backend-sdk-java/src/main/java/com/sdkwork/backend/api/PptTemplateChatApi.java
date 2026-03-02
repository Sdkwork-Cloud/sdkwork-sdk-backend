package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class PptTemplateChatApi {
    private final HttpClient client;
    
    public PptTemplateChatApi(HttpClient client) {
        this.client = client;
    }

    public PlusApiResultBoolean stop(Map<String, String> headers) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/ppt/template/chat/stop"), null, null, headers);
    }

    /** Create a chat completion with PPT template */
    public ChatCompletionChunk create(ChatCompletionCreateForm body, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/ppt/template/chat/completions"), body, null, headers);
    }
}
