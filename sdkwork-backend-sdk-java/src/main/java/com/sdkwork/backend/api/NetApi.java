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

    /** 分页获取域名 */
    public PlusApiResultPagePlusHostDomainVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusHostDomainVO) client.post(ApiPaths.backendPath("/net/host/domain/list"), body, params);
    }

    /** 获取所有域名 */
    public PlusApiResultListPlusHostDomainVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusHostDomainVO) client.post(ApiPaths.backendPath("/net/host/domain/list/all"), body);
    }

    /** 获取域名详情 */
    public PlusApiResultPlusHostDomainVO getById(String id) throws Exception {
        return (PlusApiResultPlusHostDomainVO) client.get(ApiPaths.backendPath("/net/host/domain/" + id + ""));
    }

    /** 删除域名 */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/net/host/domain/" + id + ""));
    }
}
