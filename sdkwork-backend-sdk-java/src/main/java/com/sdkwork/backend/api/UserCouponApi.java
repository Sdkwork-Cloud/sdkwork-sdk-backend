package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class UserCouponApi {
    private final HttpClient client;
    
    public UserCouponApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing user coupon */
    public PlusApiResultPlusUserCouponVO update(PlusUserCouponForm body) throws Exception {
        return (PlusApiResultPlusUserCouponVO) client.put(ApiPaths.backendPath("/user/coupon"), body);
    }

    /** Create a new user coupon */
    public PlusApiResultPlusUserCouponVO create(PlusUserCouponForm body) throws Exception {
        return (PlusApiResultPlusUserCouponVO) client.post(ApiPaths.backendPath("/user/coupon"), body);
    }

    /** Get user coupons by page */
    public PlusApiResultPagePlusUserCouponVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusUserCouponVO) client.post(ApiPaths.backendPath("/user/coupon/list"), body, params);
    }

    /** Get all user coupons */
    public PlusApiResultListPlusUserCouponVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusUserCouponVO) client.post(ApiPaths.backendPath("/user/coupon/list/all"), body);
    }

    /** Get a user coupon by ID */
    public PlusApiResultPlusUserCouponVO getById(String id) throws Exception {
        return (PlusApiResultPlusUserCouponVO) client.get(ApiPaths.backendPath("/user/coupon/" + id + ""));
    }

    /** Delete a user coupon */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/user/coupon/" + id + ""));
    }
}
