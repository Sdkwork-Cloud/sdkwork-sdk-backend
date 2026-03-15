package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ShardingApi(private val client: HttpClient) {

    /** Update Sharding Key */
    suspend fun update(body: PlusShardingKeyForm): PlusApiResultPlusShardingKeyVO? {
        return client.put(ApiPaths.backendPath("/sharding/key"), body) as? PlusApiResultPlusShardingKeyVO
    }

    /** Create Sharding Key */
    suspend fun create(body: PlusShardingKeyForm): PlusApiResultPlusShardingKeyVO? {
        return client.post(ApiPaths.backendPath("/sharding/key"), body) as? PlusApiResultPlusShardingKeyVO
    }

    /** List Sharding Keys by Page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusShardingKeyVO? {
        return client.post(ApiPaths.backendPath("/sharding/key/list"), body, params) as? PlusApiResultPagePlusShardingKeyVO
    }

    /** List All Sharding Keys */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusShardingKeyVO? {
        return client.post(ApiPaths.backendPath("/sharding/key/list/all"), body) as? PlusApiResultListPlusShardingKeyVO
    }

    /** Get Sharding Key by ID */
    suspend fun getById(id: String): PlusApiResultPlusShardingKeyVO? {
        return client.get(ApiPaths.backendPath("/sharding/key/$id")) as? PlusApiResultPlusShardingKeyVO
    }

    /** Delete Sharding Key */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/sharding/key/$id")) as? PlusApiResultBoolean
    }
}
