package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class UserApi(private val client: HttpClient) {

    /** Update an existing user */
    suspend fun update(body: PlusUserForm): PlusApiResultPlusUserVO? {
        return client.put(ApiPaths.backendPath("/user"), body) as? PlusApiResultPlusUserVO
    }

    /** Create a new user */
    suspend fun create(body: PlusUserForm): PlusApiResultPlusUserVO? {
        return client.post(ApiPaths.backendPath("/user"), body) as? PlusApiResultPlusUserVO
    }

    /** Update user OAuth account */
    suspend fun updateAccount(body: PlusUserOAuthAccountForm): PlusApiResultPlusUserOAuthAccountVO? {
        return client.put(ApiPaths.backendPath("/user/oauth/account"), body) as? PlusApiResultPlusUserOAuthAccountVO
    }

    /** Create user OAuth account */
    suspend fun createAccount(body: PlusUserOAuthAccountForm): PlusApiResultPlusUserOAuthAccountVO? {
        return client.post(ApiPaths.backendPath("/user/oauth/account"), body) as? PlusApiResultPlusUserOAuthAccountVO
    }

    /** Update an existing user coupon */
    suspend fun updateCoupon(body: PlusUserCouponForm): PlusApiResultPlusUserCouponVO? {
        return client.put(ApiPaths.backendPath("/user/coupon"), body) as? PlusApiResultPlusUserCouponVO
    }

    /** Create a new user coupon */
    suspend fun createCoupon(body: PlusUserCouponForm): PlusApiResultPlusUserCouponVO? {
        return client.post(ApiPaths.backendPath("/user/coupon"), body) as? PlusApiResultPlusUserCouponVO
    }

    /** Update user-card binding */
    suspend fun updateCard(body: PlusUserCardForm): PlusApiResultPlusUserCardVO? {
        return client.put(ApiPaths.backendPath("/user/card"), body) as? PlusApiResultPlusUserCardVO
    }

    /** Create user-card binding */
    suspend fun createCard(body: PlusUserCardForm): PlusApiResultPlusUserCardVO? {
        return client.post(ApiPaths.backendPath("/user/card"), body) as? PlusApiResultPlusUserCardVO
    }

    /** Update an existing user address */
    suspend fun updateAddress(body: PlusUserAddressForm): PlusApiResultPlusUserAddressVO? {
        return client.put(ApiPaths.backendPath("/user/address"), body) as? PlusApiResultPlusUserAddressVO
    }

    /** Create a new user address */
    suspend fun createAddress(body: PlusUserAddressForm): PlusApiResultPlusUserAddressVO? {
        return client.post(ApiPaths.backendPath("/user/address"), body) as? PlusApiResultPlusUserAddressVO
    }

    /** Get user OAuth accounts by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusUserOAuthAccountVO? {
        return client.post(ApiPaths.backendPath("/user/oauth/account/list"), body, params) as? PlusApiResultPagePlusUserOAuthAccountVO
    }

    /** Get all user OAuth accounts */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusUserOAuthAccountVO? {
        return client.post(ApiPaths.backendPath("/user/oauth/account/list/all"), body) as? PlusApiResultListPlusUserOAuthAccountVO
    }

    /** Get users by page */
    suspend fun createListByPageUser(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusUserVO? {
        return client.post(ApiPaths.backendPath("/user/list"), body, params) as? PlusApiResultPagePlusUserVO
    }

    /** Get all users */
    suspend fun createListAllEntitiesUser(body: QueryListForm? = null): PlusApiResultListPlusUserVO? {
        return client.post(ApiPaths.backendPath("/user/list/all"), body) as? PlusApiResultListPlusUserVO
    }

    /** Get user coupons by page */
    suspend fun createListByPageCoupon(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusUserCouponVO? {
        return client.post(ApiPaths.backendPath("/user/coupon/list"), body, params) as? PlusApiResultPagePlusUserCouponVO
    }

    /** Get all user coupons */
    suspend fun createListAllEntitiesCoupon(body: QueryListForm? = null): PlusApiResultListPlusUserCouponVO? {
        return client.post(ApiPaths.backendPath("/user/coupon/list/all"), body) as? PlusApiResultListPlusUserCouponVO
    }

    /** Get user-card bindings by page */
    suspend fun createListByPageCard(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusUserCardVO? {
        return client.post(ApiPaths.backendPath("/user/card/list"), body, params) as? PlusApiResultPagePlusUserCardVO
    }

    /** Get all user-card bindings */
    suspend fun createListAllEntitiesCard(body: QueryListForm? = null): PlusApiResultListPlusUserCardVO? {
        return client.post(ApiPaths.backendPath("/user/card/list/all"), body) as? PlusApiResultListPlusUserCardVO
    }

    /** Get addresses by page */
    suspend fun createListByPageAddress(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusUserAddressVO? {
        return client.post(ApiPaths.backendPath("/user/address/list"), body, params) as? PlusApiResultPagePlusUserAddressVO
    }

    /** Get all user addresses */
    suspend fun createListAllEntitiesAddress(body: QueryListForm? = null): PlusApiResultListPlusUserAddressVO? {
        return client.post(ApiPaths.backendPath("/user/address/list/all"), body) as? PlusApiResultListPlusUserAddressVO
    }

    /** Get a user by ID */
    suspend fun getById(id: String): PlusApiResultPlusUserVO? {
        return client.get(ApiPaths.backendPath("/user/$id")) as? PlusApiResultPlusUserVO
    }

    /** Delete a user */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/user/$id")) as? PlusApiResultBoolean
    }

    /** Get current user profile */
    suspend fun getProfile(): PlusApiResultPlusUserProfileVO? {
        return client.get(ApiPaths.backendPath("/user/profile")) as? PlusApiResultPlusUserProfileVO
    }

    /** Get user OAuth account by ID */
    suspend fun getByIdAccount(id: String): PlusApiResultPlusUserOAuthAccountVO? {
        return client.get(ApiPaths.backendPath("/user/oauth/account/$id")) as? PlusApiResultPlusUserOAuthAccountVO
    }

    /** Delete user OAuth account */
    suspend fun deleteAccount(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/user/oauth/account/$id")) as? PlusApiResultBoolean
    }

    /** Get a user coupon by ID */
    suspend fun getByIdCoupon(id: String): PlusApiResultPlusUserCouponVO? {
        return client.get(ApiPaths.backendPath("/user/coupon/$id")) as? PlusApiResultPlusUserCouponVO
    }

    /** Delete a user coupon */
    suspend fun deleteCoupon(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/user/coupon/$id")) as? PlusApiResultBoolean
    }

    /** Get user-card binding by ID */
    suspend fun getByIdCard(id: String): PlusApiResultPlusUserCardVO? {
        return client.get(ApiPaths.backendPath("/user/card/$id")) as? PlusApiResultPlusUserCardVO
    }

    /** Delete user-card binding */
    suspend fun deleteCard(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/user/card/$id")) as? PlusApiResultBoolean
    }

    /** Get address by ID */
    suspend fun getByIdAddress(id: String): PlusApiResultPlusUserAddressVO? {
        return client.get(ApiPaths.backendPath("/user/address/$id")) as? PlusApiResultPlusUserAddressVO
    }

    /** Delete a user address */
    suspend fun deleteAddress(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/user/address/$id")) as? PlusApiResultBoolean
    }
}
