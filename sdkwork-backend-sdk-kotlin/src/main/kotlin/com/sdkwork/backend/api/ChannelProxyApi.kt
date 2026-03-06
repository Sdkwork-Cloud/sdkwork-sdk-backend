package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ChannelProxyApi(private val client: HttpClient) {

    /** Update channel proxy */
    suspend fun update(body: PlusChannelProxyForm): PlusApiResultPlusChannelProxyVO? {
        return client.put(ApiPaths.backendPath("/channel/proxy"), body) as? PlusApiResultPlusChannelProxyVO
    }

    /** Create channel proxy */
    suspend fun create(body: PlusChannelProxyForm): PlusApiResultPlusChannelProxyVO? {
        return client.post(ApiPaths.backendPath("/channel/proxy"), body) as? PlusApiResultPlusChannelProxyVO
    }

    /** List channel proxies by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChannelProxyVO? {
        return client.post(ApiPaths.backendPath("/channel/proxy/list"), body, params) as? PlusApiResultPagePlusChannelProxyVO
    }

    /** List all channel proxies */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusChannelProxyVO? {
        return client.post(ApiPaths.backendPath("/channel/proxy/list/all"), body) as? PlusApiResultListPlusChannelProxyVO
    }

    /** Get channel proxy by ID */
    suspend fun getById(id: String): PlusApiResultPlusChannelProxyVO? {
        return client.get(ApiPaths.backendPath("/channel/proxy/$id")) as? PlusApiResultPlusChannelProxyVO
    }

    /** Delete channel proxy */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/channel/proxy/$id")) as? PlusApiResultBoolean
    }
}
