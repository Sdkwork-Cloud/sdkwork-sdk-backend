package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class UserAddressApi {
    private final HttpClient client;
    
    public UserAddressApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing user address */
    public PlusApiResultPlusUserAddressVO update(PlusUserAddressForm body) throws Exception {
        return (PlusApiResultPlusUserAddressVO) client.put(ApiPaths.backendPath("/user/address"), body);
    }

    /** Create a new user address */
    public PlusApiResultPlusUserAddressVO create(PlusUserAddressForm body) throws Exception {
        return (PlusApiResultPlusUserAddressVO) client.post(ApiPaths.backendPath("/user/address"), body);
    }

    /** Get addresses by page */
    public PlusApiResultPagePlusUserAddressVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusUserAddressVO) client.post(ApiPaths.backendPath("/user/address/list"), body, params);
    }

    /** Get all user addresses */
    public PlusApiResultListPlusUserAddressVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusUserAddressVO) client.post(ApiPaths.backendPath("/user/address/list/all"), body);
    }

    /** Get address by ID */
    public PlusApiResultPlusUserAddressVO getById(String id) throws Exception {
        return (PlusApiResultPlusUserAddressVO) client.get(ApiPaths.backendPath("/user/address/" + id + ""));
    }

    /** Delete a user address */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/user/address/" + id + ""));
    }
}
