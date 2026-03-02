package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class MemberCardApi(private val client: HttpClient) {

    /** Update an existing member card */
    suspend fun update(body: PlusMemberCardForm): PlusApiResultPlusMemberCardVO? {
        return client.put(ApiPaths.backendPath("/member/card"), body) as? PlusApiResultPlusMemberCardVO
    }

    /** Create a new member card */
    suspend fun create(body: PlusMemberCardForm): PlusApiResultPlusMemberCardVO? {
        return client.post(ApiPaths.backendPath("/member/card"), body) as? PlusApiResultPlusMemberCardVO
    }

    /** Get member cards by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusMemberCardVO? {
        return client.post(ApiPaths.backendPath("/member/card/list"), body, params) as? PlusApiResultPagePlusMemberCardVO
    }

    /** Get all member cards */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusMemberCardVO? {
        return client.post(ApiPaths.backendPath("/member/card/list/all"), body) as? PlusApiResultListPlusMemberCardVO
    }

    /** Get a member card by ID */
    suspend fun getById(id: String): PlusApiResultPlusMemberCardVO? {
        return client.get(ApiPaths.backendPath("/member/card/$id")) as? PlusApiResultPlusMemberCardVO
    }

    /** Delete a member card */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/member/card/$id")) as? PlusApiResultBoolean
    }
}
