package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class CollectionItemApi(private val client: HttpClient) {

    /** Update an existing collection item */
    suspend fun update(body: PlusCollectionItemForm): PlusApiResultPlusCollectionItemVO? {
        return client.put(ApiPaths.backendPath("/collection-item"), body) as? PlusApiResultPlusCollectionItemVO
    }

    /** Create a new collection item */
    suspend fun create(body: PlusCollectionItemForm): PlusApiResultPlusCollectionItemVO? {
        return client.post(ApiPaths.backendPath("/collection-item"), body) as? PlusApiResultPlusCollectionItemVO
    }

    /** Get collection items by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCollectionItemVO? {
        return client.post(ApiPaths.backendPath("/collection-item/list"), body, params) as? PlusApiResultPagePlusCollectionItemVO
    }

    /** Get all collection items */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusCollectionItemVO? {
        return client.post(ApiPaths.backendPath("/collection-item/list/all"), body) as? PlusApiResultListPlusCollectionItemVO
    }

    /** Get a collection item by ID */
    suspend fun getById(id: String): PlusApiResultPlusCollectionItemVO? {
        return client.get(ApiPaths.backendPath("/collection-item/$id")) as? PlusApiResultPlusCollectionItemVO
    }

    /** Delete a collection item */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/collection-item/$id")) as? PlusApiResultBoolean
    }
}
