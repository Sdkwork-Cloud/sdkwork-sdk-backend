package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class FavoriteApi(private val client: HttpClient) {

    /** Update an existing favorite */
    suspend fun update(body: PlusFavoriteForm): PlusApiResultPlusFavoriteVO? {
        return client.put(ApiPaths.backendPath("/favorite"), body) as? PlusApiResultPlusFavoriteVO
    }

    /** Create a new favorite */
    suspend fun create(body: PlusFavoriteForm): PlusApiResultPlusFavoriteVO? {
        return client.post(ApiPaths.backendPath("/favorite"), body) as? PlusApiResultPlusFavoriteVO
    }

    /** Get favorites by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusFavoriteVO? {
        return client.post(ApiPaths.backendPath("/favorite/list"), body, params) as? PlusApiResultPagePlusFavoriteVO
    }

    /** Get all favorites */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusFavoriteVO? {
        return client.post(ApiPaths.backendPath("/favorite/list/all"), body) as? PlusApiResultListPlusFavoriteVO
    }

    /** Get a favorite by ID */
    suspend fun getById(id: String): PlusApiResultPlusFavoriteVO? {
        return client.get(ApiPaths.backendPath("/favorite/$id")) as? PlusApiResultPlusFavoriteVO
    }

    /** Delete a favorite */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/favorite/$id")) as? PlusApiResultBoolean
    }
}
