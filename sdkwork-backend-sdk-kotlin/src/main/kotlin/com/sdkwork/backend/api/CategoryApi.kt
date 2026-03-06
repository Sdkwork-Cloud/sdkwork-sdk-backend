package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class CategoryApi(private val client: HttpClient) {

    /** Update an existing category */
    suspend fun update(body: PlusCategoryForm): PlusApiResultPlusCategoryVO? {
        return client.put(ApiPaths.backendPath("/category"), body) as? PlusApiResultPlusCategoryVO
    }

    /** Create a new category */
    suspend fun create(body: PlusCategoryForm): PlusApiResultPlusCategoryVO? {
        return client.post(ApiPaths.backendPath("/category"), body) as? PlusApiResultPlusCategoryVO
    }

    /** Get categories by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCategoryVO? {
        return client.post(ApiPaths.backendPath("/category/list"), body, params) as? PlusApiResultPagePlusCategoryVO
    }

    /** Get all categories */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusCategoryVO? {
        return client.post(ApiPaths.backendPath("/category/list/all"), body) as? PlusApiResultListPlusCategoryVO
    }

    /** Get Tree */
    suspend fun getTree(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultSetPlusTreeNodePlusCategoryVO? {
        return client.post(ApiPaths.backendPath("/category/get_tree"), body, params) as? PlusApiResultSetPlusTreeNodePlusCategoryVO
    }

    /** Get a category by ID */
    suspend fun getById(id: String): PlusApiResultPlusCategoryVO? {
        return client.get(ApiPaths.backendPath("/category/$id")) as? PlusApiResultPlusCategoryVO
    }

    /** Delete a category */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/category/$id")) as? PlusApiResultBoolean
    }
}
