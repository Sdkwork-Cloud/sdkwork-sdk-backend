package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class NetApi {
    private final HttpClient client;
    
    public NetApi(HttpClient client) {
        this.client = client;
    }

    /** 更新域名 */
    public PlusApiResultPlusHostDomainVO update(PlusHostDomainForm body) throws Exception {
        return (PlusApiResultPlusHostDomainVO) client.put(ApiPaths.backendPath("/net/host/domain"), body);
    }

    /** 创建域名 */
    public PlusApiResultPlusHostDomainVO create(PlusHostDomainForm body) throws Exception {
        return (PlusApiResultPlusHostDomainVO) client.post(ApiPaths.backendPath("/net/host/domain"), body);
    }

    /** Update an existing DNS record */
    public PlusApiResultPlusDnsRecordVO updateRecord(PlusDnsRecordForm body) throws Exception {
        return (PlusApiResultPlusDnsRecordVO) client.put(ApiPaths.backendPath("/net/dns/record"), body);
    }

    /** Create a new DNS record */
    public PlusApiResultPlusDnsRecordVO createRecord(PlusDnsRecordForm body) throws Exception {
        return (PlusApiResultPlusDnsRecordVO) client.post(ApiPaths.backendPath("/net/dns/record"), body);
    }

    /** 分页获取域名 */
    public PlusApiResultPagePlusHostDomainVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusHostDomainVO) client.post(ApiPaths.backendPath("/net/host/domain/list"), body, params);
    }

    /** 获取所有域名 */
    public PlusApiResultListPlusHostDomainVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusHostDomainVO) client.post(ApiPaths.backendPath("/net/host/domain/list/all"), body);
    }

    /** Get DNS records by page */
    public PlusApiResultPagePlusDnsRecordVO createListByPageRecord(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusDnsRecordVO) client.post(ApiPaths.backendPath("/net/dns/record/list"), body, params);
    }

    /** Get all DNS records */
    public PlusApiResultListPlusDnsRecordVO createListAllEntitiesRecord(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusDnsRecordVO) client.post(ApiPaths.backendPath("/net/dns/record/list/all"), body);
    }

    /** 获取域名详情 */
    public PlusApiResultPlusHostDomainVO getById(String id) throws Exception {
        return (PlusApiResultPlusHostDomainVO) client.get(ApiPaths.backendPath("/net/host/domain/" + id + ""));
    }

    /** 删除域名 */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/net/host/domain/" + id + ""));
    }

    /** Get a DNS record by ID */
    public PlusApiResultPlusDnsRecordVO getByIdRecord(String id) throws Exception {
        return (PlusApiResultPlusDnsRecordVO) client.get(ApiPaths.backendPath("/net/dns/record/" + id + ""));
    }

    /** Delete a DNS record */
    public PlusApiResultBoolean deleteRecord(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/net/dns/record/" + id + ""));
    }
}
