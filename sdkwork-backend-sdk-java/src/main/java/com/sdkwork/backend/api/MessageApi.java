package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class MessageApi {
    private final HttpClient client;
    
    public MessageApi(HttpClient client) {
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

    /** Get chat messages by page */
    public PlusApiResultPagePlusChatMessageContentVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChatMessageContentVO) client.post(ApiPaths.backendPath("/message/list"), body, params);
    }

    /** Get all chat messages */
    public PlusApiResultListPlusChatMessageContentVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusChatMessageContentVO) client.post(ApiPaths.backendPath("/message/list/all"), body);
    }

    /** Get chat message by ID */
    public PlusApiResultPlusChatMessageContentVO getById(String id) throws Exception {
        return (PlusApiResultPlusChatMessageContentVO) client.get(ApiPaths.backendPath("/message/" + id + ""));
    }

    /** Delete a chat message */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/message/" + id + ""));
    }
}
