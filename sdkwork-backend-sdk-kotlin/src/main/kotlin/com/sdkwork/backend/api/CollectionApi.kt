package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class CollectionApi(private val client: HttpClient) {

    /** Update an existing collection */
    suspend fun update(body: PlusCollectionForm): PlusApiResultPlusCollectionVO? {
        return client.put(ApiPaths.backendPath("/collection"), body) as? PlusApiResultPlusCollectionVO
    }

    /** Create a new collection */
    suspend fun create(body: PlusCollectionForm): PlusApiResultPlusCollectionVO? {
        return client.post(ApiPaths.backendPath("/collection"), body) as? PlusApiResultPlusCollectionVO
    }

    /** Get collections by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCollectionVO? {
        return client.post(ApiPaths.backendPath("/collection/list"), body, params) as? PlusApiResultPagePlusCollectionVO
    }

    /** Get all collections */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusCollectionVO? {
        return client.post(ApiPaths.backendPath("/collection/list/all"), body) as? PlusApiResultListPlusCollectionVO
    }

    /** Get a collection by ID */
    suspend fun getById(id: String): PlusApiResultPlusCollectionVO? {
        return client.get(ApiPaths.backendPath("/collection/$id")) as? PlusApiResultPlusCollectionVO
    }

    /** Delete a collection */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/collection/$id")) as? PlusApiResultBoolean
    }
}
