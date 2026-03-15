package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ParticipantApi {
    private final HttpClient client;
    
    public ParticipantApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing chat participant */
    public PlusApiResultPlusParticipantVO update(PlusParticipantForm body) throws Exception {
        return (PlusApiResultPlusParticipantVO) client.put(ApiPaths.backendPath("/participant"), body);
    }

    /** Create a new chat participant */
    public PlusApiResultPlusParticipantVO create(PlusParticipantForm body) throws Exception {
        return (PlusApiResultPlusParticipantVO) client.post(ApiPaths.backendPath("/participant"), body);
    }

    /** Get chat participants by page */
    public PlusApiResultPagePlusParticipantVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusParticipantVO) client.post(ApiPaths.backendPath("/participant/list"), body, params);
    }

    /** Get all chat participants */
    public PlusApiResultListPlusParticipantVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusParticipantVO) client.post(ApiPaths.backendPath("/participant/list/all"), body);
    }

    /** Get a chat participant by ID */
    public PlusApiResultPlusParticipantVO getById(String id) throws Exception {
        return (PlusApiResultPlusParticipantVO) client.get(ApiPaths.backendPath("/participant/" + id + ""));
    }

    /** Delete a chat participant */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/participant/" + id + ""));
    }
}
