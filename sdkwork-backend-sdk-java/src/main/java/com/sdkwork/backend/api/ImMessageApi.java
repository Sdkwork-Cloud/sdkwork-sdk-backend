package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ImMessageApi {
    private final HttpClient client;
    
    public ImMessageApi(HttpClient client) {
        this.client = client;
    }

    /** Mark conversation messages as read */
    public PlusApiResultBoolean markRead(PlusImMessageMarkReadForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/im/message/mark_read"), body);
    }

    /** Get messages by page */
    public PlusApiResultPagePlusMessage listByPage(PlusImMessageQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusMessage) client.post(ApiPaths.backendPath("/im/message/list"), body, params);
    }
}
