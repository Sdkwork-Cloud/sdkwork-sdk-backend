package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class DnsRecordApi {
    private final HttpClient client;
    
    public DnsRecordApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing DNS record */
    public PlusApiResultPlusDnsRecordVO update(PlusDnsRecordForm body) throws Exception {
        return (PlusApiResultPlusDnsRecordVO) client.put(ApiPaths.backendPath("/net/dns/record"), body);
    }

    /** Create a new DNS record */
    public PlusApiResultPlusDnsRecordVO create(PlusDnsRecordForm body) throws Exception {
        return (PlusApiResultPlusDnsRecordVO) client.post(ApiPaths.backendPath("/net/dns/record"), body);
    }

    /** Get DNS records by page */
    public PlusApiResultPagePlusDnsRecordVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusDnsRecordVO) client.post(ApiPaths.backendPath("/net/dns/record/list"), body, params);
    }

    /** Get all DNS records */
    public PlusApiResultListPlusDnsRecordVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusDnsRecordVO) client.post(ApiPaths.backendPath("/net/dns/record/list/all"), body);
    }

    /** Get a DNS record by ID */
    public PlusApiResultPlusDnsRecordVO getById(String id) throws Exception {
        return (PlusApiResultPlusDnsRecordVO) client.get(ApiPaths.backendPath("/net/dns/record/" + id + ""));
    }

    /** Delete a DNS record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/net/dns/record/" + id + ""));
    }
}
