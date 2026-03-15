package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class MemberApi(private val client: HttpClient) {

    /** Update an existing member level */
    suspend fun update(body: PlusMemberLevelForm): PlusApiResultPlusMemberLevelVO? {
        return client.put(ApiPaths.backendPath("/member/level"), body) as? PlusApiResultPlusMemberLevelVO
    }

    /** Create a new member level */
    suspend fun create(body: PlusMemberLevelForm): PlusApiResultPlusMemberLevelVO? {
        return client.post(ApiPaths.backendPath("/member/level"), body) as? PlusApiResultPlusMemberLevelVO
    }

    /** Update an existing member card */
    suspend fun updateCard(body: PlusMemberCardForm): PlusApiResultPlusMemberCardVO? {
        return client.put(ApiPaths.backendPath("/member/card"), body) as? PlusApiResultPlusMemberCardVO
    }

    /** Create a new member card */
    suspend fun createCard(body: PlusMemberCardForm): PlusApiResultPlusMemberCardVO? {
        return client.post(ApiPaths.backendPath("/member/card"), body) as? PlusApiResultPlusMemberCardVO
    }

    /** Get member levels by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusMemberLevelVO? {
        return client.post(ApiPaths.backendPath("/member/level/list"), body, params) as? PlusApiResultPagePlusMemberLevelVO
    }

    /** Get all member levels */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusMemberLevelVO? {
        return client.post(ApiPaths.backendPath("/member/level/list/all"), body) as? PlusApiResultListPlusMemberLevelVO
    }

    /** Get member cards by page */
    suspend fun createListByPageCard(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusMemberCardVO? {
        return client.post(ApiPaths.backendPath("/member/card/list"), body, params) as? PlusApiResultPagePlusMemberCardVO
    }

    /** Get all member cards */
    suspend fun createListAllEntitiesCard(body: QueryListForm? = null): PlusApiResultListPlusMemberCardVO? {
        return client.post(ApiPaths.backendPath("/member/card/list/all"), body) as? PlusApiResultListPlusMemberCardVO
    }

    /** Get a member level by ID */
    suspend fun getById(id: String): PlusApiResultPlusMemberLevelVO? {
        return client.get(ApiPaths.backendPath("/member/level/$id")) as? PlusApiResultPlusMemberLevelVO
    }

    /** Delete a member level */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/member/level/$id")) as? PlusApiResultBoolean
    }

    /** Get a member card by ID */
    suspend fun getByIdCard(id: String): PlusApiResultPlusMemberCardVO? {
        return client.get(ApiPaths.backendPath("/member/card/$id")) as? PlusApiResultPlusMemberCardVO
    }

    /** Delete a member card */
    suspend fun deleteCard(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/member/card/$id")) as? PlusApiResultBoolean
    }
}
