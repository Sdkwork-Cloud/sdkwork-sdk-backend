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

    /** Get users by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusUserVO? {
        return client.post(ApiPaths.backendPath("/user/list"), body, params) as? PlusApiResultPagePlusUserVO
    }

    /** Get all users */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusUserVO? {
        return client.post(ApiPaths.backendPath("/user/list/all"), body) as? PlusApiResultListPlusUserVO
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
}
