package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class SystemApi {
    private final HttpClient client;
    
    public SystemApi(HttpClient client) {
        this.client = client;
    }

    /** Apply invoice */
    public PlusApiResultPlusSystemInvoiceVO apply(PlusSystemInvoiceApplyForm body) throws Exception {
        return (PlusApiResultPlusSystemInvoiceVO) client.post(ApiPaths.backendPath("/system/invoice/apply"), body);
    }

    /** Query invoice page */
    public PlusApiResultPagePlusSystemInvoiceVO listByPage(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusSystemInvoiceVO) client.get(ApiPaths.backendPath("/system/invoice/page"), params);
    }
}
