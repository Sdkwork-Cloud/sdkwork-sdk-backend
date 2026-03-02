package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class UserOauthAccountApi {
    private final HttpClient client;
    
    public UserOauthAccountApi(HttpClient client) {
        this.client = client;
    }

    /** Update user OAuth account */
    public PlusApiResultPlusUserOAuthAccountVO update(PlusUserOAuthAccountForm body) throws Exception {
        return (PlusApiResultPlusUserOAuthAccountVO) client.put(ApiPaths.backendPath("/user/oauth/account"), body);
    }

    /** Create user OAuth account */
    public PlusApiResultPlusUserOAuthAccountVO create(PlusUserOAuthAccountForm body) throws Exception {
        return (PlusApiResultPlusUserOAuthAccountVO) client.post(ApiPaths.backendPath("/user/oauth/account"), body);
    }

    /** Get user OAuth accounts by page */
    public PlusApiResultPagePlusUserOAuthAccountVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusUserOAuthAccountVO) client.post(ApiPaths.backendPath("/user/oauth/account/list"), body, params);
    }

    /** Get all user OAuth accounts */
    public PlusApiResultListPlusUserOAuthAccountVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusUserOAuthAccountVO) client.post(ApiPaths.backendPath("/user/oauth/account/list/all"), body);
    }

    /** Get user OAuth account by ID */
    public PlusApiResultPlusUserOAuthAccountVO getById(String id) throws Exception {
        return (PlusApiResultPlusUserOAuthAccountVO) client.get(ApiPaths.backendPath("/user/oauth/account/" + id + ""));
    }

    /** Delete user OAuth account */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/user/oauth/account/" + id + ""));
    }
}
