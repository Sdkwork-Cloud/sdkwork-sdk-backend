package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ChatMessageApi {
    private final HttpClient client;
    
    public ChatMessageApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing chat message */
    public PlusApiResultPlusChatMessageContentVO update(PlusChatMessageContentForm body) throws Exception {
        return (PlusApiResultPlusChatMessageContentVO) client.put(ApiPaths.backendPath("/message"), body);
    }

    /** Create a new chat message */
    public PlusApiResultPlusChatMessageContentVO create(PlusChatMessageContentForm body) throws Exception {
        return (PlusApiResultPlusChatMessageContentVO) client.post(ApiPaths.backendPath("/message"), body);
    }

    /** Update an existing chat message */
    public PlusApiResultPlusChatMessageVO updateMessage(PlusChatMessageForm body) throws Exception {
        return (PlusApiResultPlusChatMessageVO) client.put(ApiPaths.backendPath("/chat/message"), body);
    }

    /** Create a new chat message */
    public PlusApiResultPlusChatMessageVO createMessage(PlusChatMessageForm body) throws Exception {
        return (PlusApiResultPlusChatMessageVO) client.post(ApiPaths.backendPath("/chat/message"), body);
    }

    /** Get chat messages by page */
    public PlusApiResultPagePlusChatMessageContentVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChatMessageContentVO) client.post(ApiPaths.backendPath("/message/list"), body, params);
    }

    /** Get all chat messages */
    public PlusApiResultListPlusChatMessageContentVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusChatMessageContentVO) client.post(ApiPaths.backendPath("/message/list/all"), body);
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

    /** Get chat message by ID */
    public PlusApiResultPlusChatMessageContentVO getById(String id) throws Exception {
        return (PlusApiResultPlusChatMessageContentVO) client.get(ApiPaths.backendPath("/message/" + id + ""));
    }

    /** Delete a chat message */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/message/" + id + ""));
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
