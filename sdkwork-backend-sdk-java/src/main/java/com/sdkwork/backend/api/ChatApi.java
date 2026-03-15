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

    /** Update an existing chat message */
    public PlusApiResultPlusChatMessageVO updateMessage(PlusChatMessageForm body) throws Exception {
        return (PlusApiResultPlusChatMessageVO) client.put(ApiPaths.backendPath("/chat/message"), body);
    }

    /** Create a new chat message */
    public PlusApiResultPlusChatMessageVO createMessage(PlusChatMessageForm body) throws Exception {
        return (PlusApiResultPlusChatMessageVO) client.post(ApiPaths.backendPath("/chat/message"), body);
    }

    /** Stop a chat completion stream */
    public PlusApiResult stop(Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (PlusApiResult) client.post(ApiPaths.backendPath("/chat/stop"), null, params, headers);
    }

    /** Get chat messages by page */
    public PlusApiResultPagePlusChatMessageVO loadMore(ChatMessageQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChatMessageVO) client.post(ApiPaths.backendPath("/chat/message/load_more"), body, params);
    }

    /** Get chat messages by page */
    public PlusApiResultPagePlusChatMessageVO createListByPage(ChatMessageQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChatMessageVO) client.post(ApiPaths.backendPath("/chat/message/list"), body, params);
    }

    /** Get all chat messages */
    public PlusApiResultListPlusChatMessageVO createListAllEntities(ChatMessageQueryListForm body) throws Exception {
        return (PlusApiResultListPlusChatMessageVO) client.post(ApiPaths.backendPath("/chat/message/list/all"), body);
    }

    /** Create a chat completion */
    public ChatCompletionChunk create(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/chat/completions"), body, params, headers);
    }

    /** Get a chat message by ID */
    public PlusApiResultPlusChatMessageVO getByIdMessage(String id) throws Exception {
        return (PlusApiResultPlusChatMessageVO) client.get(ApiPaths.backendPath("/chat/message/" + id + ""));
    }

    /** Delete a chat message */
    public PlusApiResultBoolean deleteMessage(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/chat/message/" + id + ""));
    }
}
