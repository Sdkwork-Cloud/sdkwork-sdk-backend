package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class UserCardApi(private val client: HttpClient) {

    /** Update user-card binding */
    suspend fun update(body: PlusUserCardForm): PlusApiResultPlusUserCardVO? {
        return client.put(ApiPaths.backendPath("/user/card"), body) as? PlusApiResultPlusUserCardVO
    }

    /** Create user-card binding */
    suspend fun create(body: PlusUserCardForm): PlusApiResultPlusUserCardVO? {
        return client.post(ApiPaths.backendPath("/user/card"), body) as? PlusApiResultPlusUserCardVO
    }

    /** Get user-card bindings by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusUserCardVO? {
        return client.post(ApiPaths.backendPath("/user/card/list"), body, params) as? PlusApiResultPagePlusUserCardVO
    }

    /** Get all user-card bindings */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusUserCardVO? {
        return client.post(ApiPaths.backendPath("/user/card/list/all"), body) as? PlusApiResultListPlusUserCardVO
    }

    /** Get user-card binding by ID */
    suspend fun getById(id: String): PlusApiResultPlusUserCardVO? {
        return client.get(ApiPaths.backendPath("/user/card/$id")) as? PlusApiResultPlusUserCardVO
    }

    /** Delete user-card binding */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/user/card/$id")) as? PlusApiResultBoolean
    }
}
