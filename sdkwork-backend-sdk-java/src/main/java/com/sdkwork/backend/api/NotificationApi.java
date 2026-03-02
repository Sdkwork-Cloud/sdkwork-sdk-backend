package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class NotificationApi {
    private final HttpClient client;
    
    public NotificationApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing notification */
    public PlusApiResultPlusNotificationVO update(PlusNotificationForm body) throws Exception {
        return (PlusApiResultPlusNotificationVO) client.put(ApiPaths.backendPath("/notification"), body);
    }

    /** Create a new notification */
    public PlusApiResultPlusNotificationVO create(PlusNotificationForm body) throws Exception {
        return (PlusApiResultPlusNotificationVO) client.post(ApiPaths.backendPath("/notification"), body);
    }

    /** Get notifications by page */
    public PlusApiResultPagePlusNotificationVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusNotificationVO) client.post(ApiPaths.backendPath("/notification/list"), body, params);
    }

    /** Get all notifications */
    public PlusApiResultListPlusNotificationVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusNotificationVO) client.post(ApiPaths.backendPath("/notification/list/all"), body);
    }

    /** Get a notification by ID */
    public PlusApiResultPlusNotificationVO getById(String id) throws Exception {
        return (PlusApiResultPlusNotificationVO) client.get(ApiPaths.backendPath("/notification/" + id + ""));
    }

    /** Delete a notification */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/notification/" + id + ""));
    }
}
