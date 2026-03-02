package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class MusicApi(private val client: HttpClient) {

    /** Update music */
    suspend fun update(body: PlusMusicForm): PlusApiResultPlusMusicVO? {
        return client.put(ApiPaths.backendPath("/music"), body) as? PlusApiResultPlusMusicVO
    }

    /** Create new music */
    suspend fun create(body: PlusMusicForm): PlusApiResultPlusMusicVO? {
        return client.post(ApiPaths.backendPath("/music"), body) as? PlusApiResultPlusMusicVO
    }

    /** Get music records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusMusicVO? {
        return client.post(ApiPaths.backendPath("/music/list"), body, params) as? PlusApiResultPagePlusMusicVO
    }

    /** Get all music records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusMusicVO? {
        return client.post(ApiPaths.backendPath("/music/list/all"), body) as? PlusApiResultListPlusMusicVO
    }

    /** Get music by ID */
    suspend fun getById(id: String): PlusApiResultPlusMusicVO? {
        return client.get(ApiPaths.backendPath("/music/$id")) as? PlusApiResultPlusMusicVO
    }

    /** Delete music */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/music/$id")) as? PlusApiResultBoolean
    }
}
