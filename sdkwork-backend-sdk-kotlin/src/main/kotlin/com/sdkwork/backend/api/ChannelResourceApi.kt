package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ChannelResourceApi(private val client: HttpClient) {

    /** Update an existing channel resource */
    suspend fun update(body: PlusChannelResourceForm): PlusApiResultPlusChannelResourceVO? {
        return client.put(ApiPaths.backendPath("/channel/resource"), body) as? PlusApiResultPlusChannelResourceVO
    }

    /** Create a new channel resource */
    suspend fun create(body: PlusChannelResourceForm): PlusApiResultPlusChannelResourceVO? {
        return client.post(ApiPaths.backendPath("/channel/resource"), body) as? PlusApiResultPlusChannelResourceVO
    }

    /** Get channel resources by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChannelResourceVO? {
        return client.post(ApiPaths.backendPath("/channel/resource/list"), body, params) as? PlusApiResultPagePlusChannelResourceVO
    }

    /** Get all channel resources */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusChannelResourceVO? {
        return client.post(ApiPaths.backendPath("/channel/resource/list/all"), body) as? PlusApiResultListPlusChannelResourceVO
    }

    /** Get a channel resource by ID */
    suspend fun getById(id: String): PlusApiResultPlusChannelResourceVO? {
        return client.get(ApiPaths.backendPath("/channel/resource/$id")) as? PlusApiResultPlusChannelResourceVO
    }

    /** Delete a channel resource */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/channel/resource/$id")) as? PlusApiResultBoolean
    }
}
