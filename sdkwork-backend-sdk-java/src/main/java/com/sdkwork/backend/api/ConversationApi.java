package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ConversationApi {
    private final HttpClient client;
    
    public ConversationApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing conversation */
    public PlusApiResultPlusConversationVO update(PlusConversationForm body) throws Exception {
        return (PlusApiResultPlusConversationVO) client.put(ApiPaths.backendPath("/conversation"), body);
    }

    /** Create a new conversation */
    public PlusApiResultPlusConversationVO create(PlusConversationForm body) throws Exception {
        return (PlusApiResultPlusConversationVO) client.post(ApiPaths.backendPath("/conversation"), body);
    }

    /** Pin/Unpin a conversation */
    public PlusApiResultPlusConversationVO pin(String id, Map<String, Object> params) throws Exception {
        return (PlusApiResultPlusConversationVO) client.post(ApiPaths.backendPath("/conversation/" + id + "/pin"), null, params);
    }

    /** Get all open conversations */
    public PlusApiResultPlusConversationVO open(PlusConversationOpenForm body) throws Exception {
        return (PlusApiResultPlusConversationVO) client.post(ApiPaths.backendPath("/conversation/open"), body);
    }

    /** Update an existing conversation */
    public PlusApiResultBoolean messageFeedback(PlusMessageFeedbackForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/conversation/message_feedback"), body);
    }

    /** Get conversations by page */
    public PlusApiResultPagePlusConversationVO listByPage(PlusConversationQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusConversationVO) client.post(ApiPaths.backendPath("/conversation/list"), body, params);
    }

    /** Get all conversations */
    public PlusApiResultListPlusConversationVO listAllEntities(PlusConversationQueryListForm body) throws Exception {
        return (PlusApiResultListPlusConversationVO) client.post(ApiPaths.backendPath("/conversation/list/all"), body);
    }

    /** Get a conversation by ID */
    public PlusApiResultPlusConversationVO getById(String id) throws Exception {
        return (PlusApiResultPlusConversationVO) client.get(ApiPaths.backendPath("/conversation/" + id + ""));
    }

    /** Delete a conversation */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/conversation/" + id + ""));
    }
}
