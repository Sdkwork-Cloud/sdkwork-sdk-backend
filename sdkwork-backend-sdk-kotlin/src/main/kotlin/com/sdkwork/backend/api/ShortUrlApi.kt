package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ShortUrlApi(private val client: HttpClient) {

    /** Update short URL */
    suspend fun update(body: ShortUrlForm): PlusApiResultShortUrlVO? {
        return client.put(ApiPaths.backendPath("/short_url"), body) as? PlusApiResultShortUrlVO
    }

    /** Create short URL */
    suspend fun create(body: ShortUrlForm): PlusApiResultShortUrlVO? {
        return client.post(ApiPaths.backendPath("/short_url"), body) as? PlusApiResultShortUrlVO
    }

    /** Get short URLs by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPageShortUrlVO? {
        return client.post(ApiPaths.backendPath("/short_url/list"), body, params) as? PlusApiResultPageShortUrlVO
    }

    /** Get all short URLs */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListShortUrlVO? {
        return client.post(ApiPaths.backendPath("/short_url/list/all"), body) as? PlusApiResultListShortUrlVO
    }

    /** Get short URL details */
    suspend fun getById(id: String): PlusApiResultShortUrlVO? {
        return client.get(ApiPaths.backendPath("/short_url/$id")) as? PlusApiResultShortUrlVO
    }

    /** Delete short URL */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/short_url/$id")) as? PlusApiResultBoolean
    }
}
