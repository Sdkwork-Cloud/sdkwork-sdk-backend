package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class UserApi {
    private final HttpClient client;
    
    public UserApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing user */
    public PlusApiResultPlusUserVO update(PlusUserForm body) throws Exception {
        return (PlusApiResultPlusUserVO) client.put(ApiPaths.backendPath("/user"), body);
    }

    /** Create a new user */
    public PlusApiResultPlusUserVO create(PlusUserForm body) throws Exception {
        return (PlusApiResultPlusUserVO) client.post(ApiPaths.backendPath("/user"), body);
    }

    /** Update user OAuth account */
    public PlusApiResultPlusUserOAuthAccountVO updateAccount(PlusUserOAuthAccountForm body) throws Exception {
        return (PlusApiResultPlusUserOAuthAccountVO) client.put(ApiPaths.backendPath("/user/oauth/account"), body);
    }

    /** Create user OAuth account */
    public PlusApiResultPlusUserOAuthAccountVO createAccount(PlusUserOAuthAccountForm body) throws Exception {
        return (PlusApiResultPlusUserOAuthAccountVO) client.post(ApiPaths.backendPath("/user/oauth/account"), body);
    }

    /** Update an existing user coupon */
    public PlusApiResultPlusUserCouponVO updateCoupon(PlusUserCouponForm body) throws Exception {
        return (PlusApiResultPlusUserCouponVO) client.put(ApiPaths.backendPath("/user/coupon"), body);
    }

    /** Create a new user coupon */
    public PlusApiResultPlusUserCouponVO createCoupon(PlusUserCouponForm body) throws Exception {
        return (PlusApiResultPlusUserCouponVO) client.post(ApiPaths.backendPath("/user/coupon"), body);
    }

    /** Update user-card binding */
    public PlusApiResultPlusUserCardVO updateCard(PlusUserCardForm body) throws Exception {
        return (PlusApiResultPlusUserCardVO) client.put(ApiPaths.backendPath("/user/card"), body);
    }

    /** Create user-card binding */
    public PlusApiResultPlusUserCardVO createCard(PlusUserCardForm body) throws Exception {
        return (PlusApiResultPlusUserCardVO) client.post(ApiPaths.backendPath("/user/card"), body);
    }

    /** Update an existing user address */
    public PlusApiResultPlusUserAddressVO updateAddress(PlusUserAddressForm body) throws Exception {
        return (PlusApiResultPlusUserAddressVO) client.put(ApiPaths.backendPath("/user/address"), body);
    }

    /** Create a new user address */
    public PlusApiResultPlusUserAddressVO createAddress(PlusUserAddressForm body) throws Exception {
        return (PlusApiResultPlusUserAddressVO) client.post(ApiPaths.backendPath("/user/address"), body);
    }

    /** Get user OAuth accounts by page */
    public PlusApiResultPagePlusUserOAuthAccountVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusUserOAuthAccountVO) client.post(ApiPaths.backendPath("/user/oauth/account/list"), body, params);
    }

    /** Get all user OAuth accounts */
    public PlusApiResultListPlusUserOAuthAccountVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusUserOAuthAccountVO) client.post(ApiPaths.backendPath("/user/oauth/account/list/all"), body);
    }

    /** Get users by page */
    public PlusApiResultPagePlusUserVO createListByPageUser(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusUserVO) client.post(ApiPaths.backendPath("/user/list"), body, params);
    }

    /** Get all users */
    public PlusApiResultListPlusUserVO createListAllEntitiesUser(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusUserVO) client.post(ApiPaths.backendPath("/user/list/all"), body);
    }

    /** Get user coupons by page */
    public PlusApiResultPagePlusUserCouponVO createListByPageCoupon(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusUserCouponVO) client.post(ApiPaths.backendPath("/user/coupon/list"), body, params);
    }

    /** Get all user coupons */
    public PlusApiResultListPlusUserCouponVO createListAllEntitiesCoupon(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusUserCouponVO) client.post(ApiPaths.backendPath("/user/coupon/list/all"), body);
    }

    /** Get user-card bindings by page */
    public PlusApiResultPagePlusUserCardVO createListByPageCard(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusUserCardVO) client.post(ApiPaths.backendPath("/user/card/list"), body, params);
    }

    /** Get all user-card bindings */
    public PlusApiResultListPlusUserCardVO createListAllEntitiesCard(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusUserCardVO) client.post(ApiPaths.backendPath("/user/card/list/all"), body);
    }

    /** Get addresses by page */
    public PlusApiResultPagePlusUserAddressVO createListByPageAddress(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusUserAddressVO) client.post(ApiPaths.backendPath("/user/address/list"), body, params);
    }

    /** Get all user addresses */
    public PlusApiResultListPlusUserAddressVO createListAllEntitiesAddress(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusUserAddressVO) client.post(ApiPaths.backendPath("/user/address/list/all"), body);
    }

    /** Get a user by ID */
    public PlusApiResultPlusUserVO getById(String id) throws Exception {
        return (PlusApiResultPlusUserVO) client.get(ApiPaths.backendPath("/user/" + id + ""));
    }

    /** Delete a user */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/user/" + id + ""));
    }

    /** Get current user profile */
    public PlusApiResultPlusUserProfileVO getProfile() throws Exception {
        return (PlusApiResultPlusUserProfileVO) client.get(ApiPaths.backendPath("/user/profile"));
    }

    /** Get user OAuth account by ID */
    public PlusApiResultPlusUserOAuthAccountVO getByIdAccount(String id) throws Exception {
        return (PlusApiResultPlusUserOAuthAccountVO) client.get(ApiPaths.backendPath("/user/oauth/account/" + id + ""));
    }

    /** Delete user OAuth account */
    public PlusApiResultBoolean deleteAccount(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/user/oauth/account/" + id + ""));
    }

    /** Get a user coupon by ID */
    public PlusApiResultPlusUserCouponVO getByIdCoupon(String id) throws Exception {
        return (PlusApiResultPlusUserCouponVO) client.get(ApiPaths.backendPath("/user/coupon/" + id + ""));
    }

    /** Delete a user coupon */
    public PlusApiResultBoolean deleteCoupon(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/user/coupon/" + id + ""));
    }

    /** Get user-card binding by ID */
    public PlusApiResultPlusUserCardVO getByIdCard(String id) throws Exception {
        return (PlusApiResultPlusUserCardVO) client.get(ApiPaths.backendPath("/user/card/" + id + ""));
    }

    /** Delete user-card binding */
    public PlusApiResultBoolean deleteCard(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/user/card/" + id + ""));
    }

    /** Get address by ID */
    public PlusApiResultPlusUserAddressVO getByIdAddress(String id) throws Exception {
        return (PlusApiResultPlusUserAddressVO) client.get(ApiPaths.backendPath("/user/address/" + id + ""));
    }

    /** Delete a user address */
    public PlusApiResultBoolean deleteAddress(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/user/address/" + id + ""));
    }
}
