package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ChannelApi {
    private final HttpClient client;
    
    public ChannelApi(HttpClient client) {
        this.client = client;
    }

    /** Update channel */
    public PlusApiResultPlusChannelVO update(PlusChannelForm body) throws Exception {
        return (PlusApiResultPlusChannelVO) client.put(ApiPaths.backendPath("/channel"), body);
    }

    /** Create channel */
    public PlusApiResultPlusChannelVO create(PlusChannelForm body) throws Exception {
        return (PlusApiResultPlusChannelVO) client.post(ApiPaths.backendPath("/channel"), body);
    }

    /** Update an existing channel resource */
    public PlusApiResultPlusChannelResourceVO updateResource(PlusChannelResourceForm body) throws Exception {
        return (PlusApiResultPlusChannelResourceVO) client.put(ApiPaths.backendPath("/channel/resource"), body);
    }

    /** Create a new channel resource */
    public PlusApiResultPlusChannelResourceVO createResource(PlusChannelResourceForm body) throws Exception {
        return (PlusApiResultPlusChannelResourceVO) client.post(ApiPaths.backendPath("/channel/resource"), body);
    }

    /** Update channel proxy */
    public PlusApiResultPlusChannelProxyVO updateProxy(PlusChannelProxyForm body) throws Exception {
        return (PlusApiResultPlusChannelProxyVO) client.put(ApiPaths.backendPath("/channel/proxy"), body);
    }

    /** Create channel proxy */
    public PlusApiResultPlusChannelProxyVO createProxy(PlusChannelProxyForm body) throws Exception {
        return (PlusApiResultPlusChannelProxyVO) client.post(ApiPaths.backendPath("/channel/proxy"), body);
    }

    /** Update channel account */
    public PlusApiResultPlusChannelAccountVO updateAccount(PlusChannelAccountForm body) throws Exception {
        return (PlusApiResultPlusChannelAccountVO) client.put(ApiPaths.backendPath("/channel/account"), body);
    }

    /** Create channel account */
    public PlusApiResultPlusChannelAccountVO createAccount(PlusChannelAccountForm body) throws Exception {
        return (PlusApiResultPlusChannelAccountVO) client.post(ApiPaths.backendPath("/channel/account"), body);
    }

    /** Get channel resources by page */
    public PlusApiResultPagePlusChannelResourceVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChannelResourceVO) client.post(ApiPaths.backendPath("/channel/resource/list"), body, params);
    }

    /** Get all channel resources */
    public PlusApiResultListPlusChannelResourceVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusChannelResourceVO) client.post(ApiPaths.backendPath("/channel/resource/list/all"), body);
    }

    /** List channel proxies by page */
    public PlusApiResultPagePlusChannelProxyVO createListByPageProxy(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChannelProxyVO) client.post(ApiPaths.backendPath("/channel/proxy/list"), body, params);
    }

    /** List all channel proxies */
    public PlusApiResultListPlusChannelProxyVO createListAllEntitiesProxy(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusChannelProxyVO) client.post(ApiPaths.backendPath("/channel/proxy/list/all"), body);
    }

    /** List channels by page */
    public PlusApiResultPagePlusChannelVO createListByPageChannel(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChannelVO) client.post(ApiPaths.backendPath("/channel/list"), body, params);
    }

    /** List all channels */
    public PlusApiResultListPlusChannelVO createListAllEntitiesChannel(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusChannelVO) client.post(ApiPaths.backendPath("/channel/list/all"), body);
    }

    /** Get SMS channel accounts */
    public PlusApiResultListPlusChannelAccountVO listSms(PlusChannelAccountQueryForm body) throws Exception {
        return (PlusApiResultListPlusChannelAccountVO) client.post(ApiPaths.backendPath("/channel/account/list_sms"), body);
    }

    /** Get payment channel accounts */
    public PlusApiResultListPlusChannelAccountVO listPayment(PlusChannelAccountQueryForm body) throws Exception {
        return (PlusApiResultListPlusChannelAccountVO) client.post(ApiPaths.backendPath("/channel/account/list_payment"), body);
    }

    /** Get OSS channel accounts */
    public PlusApiResultListPlusChannelAccountVO listOss(PlusChannelAccountQueryForm body) throws Exception {
        return (PlusApiResultListPlusChannelAccountVO) client.post(ApiPaths.backendPath("/channel/account/list_oss"), body);
    }

    /** Get official account channel accounts */
    public PlusApiResultListPlusChannelAccountVO listOfficialAccount(PlusChannelAccountQueryForm body) throws Exception {
        return (PlusApiResultListPlusChannelAccountVO) client.post(ApiPaths.backendPath("/channel/account/list_official_account"), body);
    }

    /** Get mini program channel accounts */
    public PlusApiResultListPlusChannelAccountVO listMiniProgram(PlusChannelAccountQueryForm body) throws Exception {
        return (PlusApiResultListPlusChannelAccountVO) client.post(ApiPaths.backendPath("/channel/account/list_mini_program"), body);
    }

    /** Get channel accounts by page */
    public PlusApiResultPagePlusChannelAccountVO createListByPageAccount(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChannelAccountVO) client.post(ApiPaths.backendPath("/channel/account/list"), body, params);
    }

    /** Get all channel accounts */
    public PlusApiResultListPlusChannelAccountVO createListAllEntitiesAccount(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusChannelAccountVO) client.post(ApiPaths.backendPath("/channel/account/list/all"), body);
    }

    /** Get channel by ID */
    public PlusApiResultPlusChannelVO getById(String id) throws Exception {
        return (PlusApiResultPlusChannelVO) client.get(ApiPaths.backendPath("/channel/" + id + ""));
    }

    /** Delete channel */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/channel/" + id + ""));
    }

    /** Get a channel resource by ID */
    public PlusApiResultPlusChannelResourceVO getByIdResource(String id) throws Exception {
        return (PlusApiResultPlusChannelResourceVO) client.get(ApiPaths.backendPath("/channel/resource/" + id + ""));
    }

    /** Delete a channel resource */
    public PlusApiResultBoolean deleteResource(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/channel/resource/" + id + ""));
    }

    /** Get channel proxy by ID */
    public PlusApiResultPlusChannelProxyVO getByIdProxy(String id) throws Exception {
        return (PlusApiResultPlusChannelProxyVO) client.get(ApiPaths.backendPath("/channel/proxy/" + id + ""));
    }

    /** Delete channel proxy */
    public PlusApiResultBoolean deleteProxy(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/channel/proxy/" + id + ""));
    }

    /** Get channel account by ID */
    public PlusApiResultPlusChannelAccountVO getByIdAccount(String id) throws Exception {
        return (PlusApiResultPlusChannelAccountVO) client.get(ApiPaths.backendPath("/channel/account/" + id + ""));
    }

    /** Delete channel account */
    public PlusApiResultBoolean deleteAccount(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/channel/account/" + id + ""));
    }
}
