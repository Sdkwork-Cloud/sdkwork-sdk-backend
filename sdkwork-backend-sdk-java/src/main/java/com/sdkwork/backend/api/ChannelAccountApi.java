package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ChannelAccountApi {
    private final HttpClient client;
    
    public ChannelAccountApi(HttpClient client) {
        this.client = client;
    }

    /** Update channel account */
    public PlusApiResultPlusChannelAccountVO update(PlusChannelAccountForm body) throws Exception {
        return (PlusApiResultPlusChannelAccountVO) client.put(ApiPaths.backendPath("/channel/account"), body);
    }

    /** Create channel account */
    public PlusApiResultPlusChannelAccountVO create(PlusChannelAccountForm body) throws Exception {
        return (PlusApiResultPlusChannelAccountVO) client.post(ApiPaths.backendPath("/channel/account"), body);
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
    public PlusApiResultPagePlusChannelAccountVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChannelAccountVO) client.post(ApiPaths.backendPath("/channel/account/list"), body, params);
    }

    /** Get all channel accounts */
    public PlusApiResultListPlusChannelAccountVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusChannelAccountVO) client.post(ApiPaths.backendPath("/channel/account/list/all"), body);
    }

    /** Get channel account by ID */
    public PlusApiResultPlusChannelAccountVO getById(String id) throws Exception {
        return (PlusApiResultPlusChannelAccountVO) client.get(ApiPaths.backendPath("/channel/account/" + id + ""));
    }

    /** Delete channel account */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/channel/account/" + id + ""));
    }
}
