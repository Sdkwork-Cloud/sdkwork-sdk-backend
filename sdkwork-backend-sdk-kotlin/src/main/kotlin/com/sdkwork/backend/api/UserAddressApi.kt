package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class UserAddressApi(private val client: HttpClient) {

    /** Update an existing user address */
    suspend fun update(body: PlusUserAddressForm): PlusApiResultPlusUserAddressVO? {
        return client.put(ApiPaths.backendPath("/user/address"), body) as? PlusApiResultPlusUserAddressVO
    }

    /** Create a new user address */
    suspend fun create(body: PlusUserAddressForm): PlusApiResultPlusUserAddressVO? {
        return client.post(ApiPaths.backendPath("/user/address"), body) as? PlusApiResultPlusUserAddressVO
    }

    /** Get addresses by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusUserAddressVO? {
        return client.post(ApiPaths.backendPath("/user/address/list"), body, params) as? PlusApiResultPagePlusUserAddressVO
    }

    /** Get all user addresses */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusUserAddressVO? {
        return client.post(ApiPaths.backendPath("/user/address/list/all"), body) as? PlusApiResultListPlusUserAddressVO
    }

    /** Get address by ID */
    suspend fun getById(id: String): PlusApiResultPlusUserAddressVO? {
        return client.get(ApiPaths.backendPath("/user/address/$id")) as? PlusApiResultPlusUserAddressVO
    }

    /** Delete a user address */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/user/address/$id")) as? PlusApiResultBoolean
    }
}
