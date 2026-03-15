package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ImApi {
    private final HttpClient client;
    
    public ImApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing chat group */
    public PlusApiResultPlusImGroupVO update(PlusImGroupForm body) throws Exception {
        return (PlusApiResultPlusImGroupVO) client.put(ApiPaths.backendPath("/im/group"), body);
    }

    /** Create a new chat group */
    public PlusApiResultPlusImGroupVO create(PlusImGroupForm body) throws Exception {
        return (PlusApiResultPlusImGroupVO) client.post(ApiPaths.backendPath("/im/group"), body);
    }

    /** Mark conversation messages as read */
    public PlusApiResultBoolean markRead(PlusImMessageMarkReadForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/im/message/mark_read"), body);
    }

    /** Get messages by page */
    public PlusApiResultPagePlusMessage createListByPage(PlusImMessageQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusMessage) client.post(ApiPaths.backendPath("/im/message/list"), body, params);
    }

    /** Get chat groups by page */
    public PlusApiResultPagePlusImGroupVO createListByPageGroup(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusImGroupVO) client.post(ApiPaths.backendPath("/im/group/list"), body, params);
    }

    /** Get all chat groups */
    public PlusApiResultListPlusImGroupVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusImGroupVO) client.post(ApiPaths.backendPath("/im/group/list/all"), body);
    }

    /** Get a chat group by ID */
    public PlusApiResultPlusImGroupVO getById(String id) throws Exception {
        return (PlusApiResultPlusImGroupVO) client.get(ApiPaths.backendPath("/im/group/" + id + ""));
    }

    /** Delete a chat group */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/im/group/" + id + ""));
    }
}
