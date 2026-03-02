package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class DiskMemberApi(private val client: HttpClient) {

    /** Update an existing disk member */
    suspend fun update(body: PlusDiskMemberForm): PlusApiResultPlusDiskMemberVO? {
        return client.put(ApiPaths.backendPath("/disk/member"), body) as? PlusApiResultPlusDiskMemberVO
    }

    /** Create a new disk member */
    suspend fun create(body: PlusDiskMemberForm): PlusApiResultPlusDiskMemberVO? {
        return client.post(ApiPaths.backendPath("/disk/member"), body) as? PlusApiResultPlusDiskMemberVO
    }

    /** Get disk members by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusDiskMemberVO? {
        return client.post(ApiPaths.backendPath("/disk/member/list"), body, params) as? PlusApiResultPagePlusDiskMemberVO
    }

    /** Get all disk members */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusDiskMemberVO? {
        return client.post(ApiPaths.backendPath("/disk/member/list/all"), body) as? PlusApiResultListPlusDiskMemberVO
    }

    /** Get a disk member by ID */
    suspend fun getById(id: String): PlusApiResultPlusDiskMemberVO? {
        return client.get(ApiPaths.backendPath("/disk/member/$id")) as? PlusApiResultPlusDiskMemberVO
    }

    /** Delete a disk member */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/disk/member/$id")) as? PlusApiResultBoolean
    }
}
