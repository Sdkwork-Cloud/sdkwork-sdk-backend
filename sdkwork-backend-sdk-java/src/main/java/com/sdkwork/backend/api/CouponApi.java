package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class CouponApi {
    private final HttpClient client;
    
    public CouponApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing coupon template */
    public PlusApiResultPlusCouponVO update(PlusCouponForm body) throws Exception {
        return (PlusApiResultPlusCouponVO) client.put(ApiPaths.backendPath("/coupon"), body);
    }

    /** Create a new coupon template */
    public PlusApiResultPlusCouponVO create(PlusCouponForm body) throws Exception {
        return (PlusApiResultPlusCouponVO) client.post(ApiPaths.backendPath("/coupon"), body);
    }

    /** Exchange coupon by points */
    public PlusApiResultPlusUserCouponVO exchangeByPoints(String couponId, CouponPointsExchangeForm body) throws Exception {
        return (PlusApiResultPlusUserCouponVO) client.post(ApiPaths.backendPath("/coupon/" + couponId + "/exchange/points"), body);
    }

    /** Redeem coupon */
    public PlusApiResultPlusUserCouponVO redeem(CouponRedeemForm body) throws Exception {
        return (PlusApiResultPlusUserCouponVO) client.post(ApiPaths.backendPath("/coupon/redeem"), body);
    }

    /** Rollback points exchange coupon */
    public PlusApiResultPlusUserCouponVO rollbackPointsExchange(String userCouponId, CouponRollbackForm body) throws Exception {
        return (PlusApiResultPlusUserCouponVO) client.post(ApiPaths.backendPath("/coupon/my/" + userCouponId + "/rollback"), body);
    }

    /** Get coupon templates by page */
    public PlusApiResultPagePlusCouponVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusCouponVO) client.post(ApiPaths.backendPath("/coupon/list"), body, params);
    }

    /** Get all coupon templates */
    public PlusApiResultListPlusCouponVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusCouponVO) client.post(ApiPaths.backendPath("/coupon/list/all"), body);
    }

    /** Get a coupon template by ID */
    public PlusApiResultPlusCouponVO getById(String id) throws Exception {
        return (PlusApiResultPlusCouponVO) client.get(ApiPaths.backendPath("/coupon/" + id + ""));
    }

    /** Delete a coupon template */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/coupon/" + id + ""));
    }
}
