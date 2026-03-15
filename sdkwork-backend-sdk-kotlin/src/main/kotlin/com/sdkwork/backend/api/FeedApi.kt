package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class FeedApi(private val client: HttpClient) {

    /** Update an existing feeds entry */
    suspend fun update(body: PlusFeedsForm): PlusApiResultPlusFeedsVO? {
        return client.put(ApiPaths.backendPath("/feeds"), body) as? PlusApiResultPlusFeedsVO
    }

    /** Create a new feeds entry */
    suspend fun create(body: PlusFeedsForm): PlusApiResultPlusFeedsVO? {
        return client.post(ApiPaths.backendPath("/feeds"), body) as? PlusApiResultPlusFeedsVO
    }

    /** Get feeds entries by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusFeedsVO? {
        return client.post(ApiPaths.backendPath("/feeds/list"), body, params) as? PlusApiResultPagePlusFeedsVO
    }

    /** Get all feeds entries */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusFeedsVO? {
        return client.post(ApiPaths.backendPath("/feeds/list/all"), body) as? PlusApiResultListPlusFeedsVO
    }

    /** Get a feeds entry by ID */
    suspend fun getById(id: String): PlusApiResultPlusFeedsVO? {
        return client.get(ApiPaths.backendPath("/feeds/$id")) as? PlusApiResultPlusFeedsVO
    }

    /** Delete a feeds entry */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/feeds/$id")) as? PlusApiResultBoolean
    }
}
