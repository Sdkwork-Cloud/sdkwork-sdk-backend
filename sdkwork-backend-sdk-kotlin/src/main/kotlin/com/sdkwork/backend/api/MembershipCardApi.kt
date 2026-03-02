package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class MembershipCardApi(private val client: HttpClient) {

    /** Update an existing membership card */
    suspend fun update(body: PlusCardForm): PlusApiResultPlusCardVO? {
        return client.put(ApiPaths.backendPath("/card"), body) as? PlusApiResultPlusCardVO
    }

    /** Create a new membership card */
    suspend fun create(body: PlusCardForm): PlusApiResultPlusCardVO? {
        return client.post(ApiPaths.backendPath("/card"), body) as? PlusApiResultPlusCardVO
    }

    /** Get membership cards by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCardVO? {
        return client.post(ApiPaths.backendPath("/card/list"), body, params) as? PlusApiResultPagePlusCardVO
    }

    /** Get all membership cards */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusCardVO? {
        return client.post(ApiPaths.backendPath("/card/list/all"), body) as? PlusApiResultListPlusCardVO
    }

    /** Get a membership card by ID */
    suspend fun getById(id: String): PlusApiResultPlusCardVO? {
        return client.get(ApiPaths.backendPath("/card/$id")) as? PlusApiResultPlusCardVO
    }

    /** Delete a membership card */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/card/$id")) as? PlusApiResultBoolean
    }
}
