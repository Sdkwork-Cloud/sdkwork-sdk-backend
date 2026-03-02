package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VideoApi(private val client: HttpClient) {

    /** Update an existing video */
    suspend fun update(body: PlusVideoForm): PlusApiResultPlusVideoVO? {
        return client.put(ApiPaths.backendPath("/video"), body) as? PlusApiResultPlusVideoVO
    }

    /** Create a new video */
    suspend fun create(body: PlusVideoForm): PlusApiResultPlusVideoVO? {
        return client.post(ApiPaths.backendPath("/video"), body) as? PlusApiResultPlusVideoVO
    }

    /** Get videos by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVideoVO? {
        return client.post(ApiPaths.backendPath("/video/list"), body, params) as? PlusApiResultPagePlusVideoVO
    }

    /** Get all videos */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVideoVO? {
        return client.post(ApiPaths.backendPath("/video/list/all"), body) as? PlusApiResultListPlusVideoVO
    }

    /** Get a video by ID */
    suspend fun getById(id: String): PlusApiResultPlusVideoVO? {
        return client.get(ApiPaths.backendPath("/video/$id")) as? PlusApiResultPlusVideoVO
    }

    /** Delete a video */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/video/$id")) as? PlusApiResultBoolean
    }
}
