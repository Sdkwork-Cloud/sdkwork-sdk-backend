package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class PptTemplateRenderingApi {
    private final HttpClient client;
    
    public PptTemplateRenderingApi(HttpClient client) {
        this.client = client;
    }

    /** Render PPT template */
    public PlusApiResult render(PlusPptTemplateRenderForm body) throws Exception {
        return (PlusApiResult) client.post(ApiPaths.backendPath("/ppt/template/render"), body);
    }
}
