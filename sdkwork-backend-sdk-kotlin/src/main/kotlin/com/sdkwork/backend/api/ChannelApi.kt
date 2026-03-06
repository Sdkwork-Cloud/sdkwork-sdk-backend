package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ChannelApi(private val client: HttpClient) {

    /** Update channel */
    suspend fun update(body: PlusChannelForm): PlusApiResultPlusChannelVO? {
        return client.put(ApiPaths.backendPath("/channel"), body) as? PlusApiResultPlusChannelVO
    }

    /** Create channel */
    suspend fun create(body: PlusChannelForm): PlusApiResultPlusChannelVO? {
        return client.post(ApiPaths.backendPath("/channel"), body) as? PlusApiResultPlusChannelVO
    }

    /** List channels by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChannelVO? {
        return client.post(ApiPaths.backendPath("/channel/list"), body, params) as? PlusApiResultPagePlusChannelVO
    }

    /** List all channels */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusChannelVO? {
        return client.post(ApiPaths.backendPath("/channel/list/all"), body) as? PlusApiResultListPlusChannelVO
    }

    /** Get channel by ID */
    suspend fun getById(id: String): PlusApiResultPlusChannelVO? {
        return client.get(ApiPaths.backendPath("/channel/$id")) as? PlusApiResultPlusChannelVO
    }

    /** Delete channel */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/channel/$id")) as? PlusApiResultBoolean
    }
}
