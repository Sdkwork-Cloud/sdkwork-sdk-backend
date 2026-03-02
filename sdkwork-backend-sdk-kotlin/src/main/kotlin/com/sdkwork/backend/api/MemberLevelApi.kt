package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class MemberLevelApi(private val client: HttpClient) {

    /** Update an existing member level */
    suspend fun update(body: PlusMemberLevelForm): PlusApiResultPlusMemberLevelVO? {
        return client.put(ApiPaths.backendPath("/member/level"), body) as? PlusApiResultPlusMemberLevelVO
    }

    /** Create a new member level */
    suspend fun create(body: PlusMemberLevelForm): PlusApiResultPlusMemberLevelVO? {
        return client.post(ApiPaths.backendPath("/member/level"), body) as? PlusApiResultPlusMemberLevelVO
    }

    /** Get member levels by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusMemberLevelVO? {
        return client.post(ApiPaths.backendPath("/member/level/list"), body, params) as? PlusApiResultPagePlusMemberLevelVO
    }

    /** Get all member levels */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusMemberLevelVO? {
        return client.post(ApiPaths.backendPath("/member/level/list/all"), body) as? PlusApiResultListPlusMemberLevelVO
    }

    /** Get a member level by ID */
    suspend fun getById(id: String): PlusApiResultPlusMemberLevelVO? {
        return client.get(ApiPaths.backendPath("/member/level/$id")) as? PlusApiResultPlusMemberLevelVO
    }

    /** Delete a member level */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/member/level/$id")) as? PlusApiResultBoolean
    }
}
