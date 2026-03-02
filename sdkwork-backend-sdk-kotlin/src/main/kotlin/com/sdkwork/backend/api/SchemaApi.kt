package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class SchemaApi(private val client: HttpClient) {

    /** Update an existing database schema */
    suspend fun update(body: PlusSchemaForm): PlusApiResultPlusSchemaVO? {
        return client.put(ApiPaths.backendPath("/schema"), body) as? PlusApiResultPlusSchemaVO
    }

    /** Create a new database schema */
    suspend fun create(body: PlusSchemaForm): PlusApiResultPlusSchemaVO? {
        return client.post(ApiPaths.backendPath("/schema"), body) as? PlusApiResultPlusSchemaVO
    }

    /** Get database schemas by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusSchemaVO? {
        return client.post(ApiPaths.backendPath("/schema/list"), body, params) as? PlusApiResultPagePlusSchemaVO
    }

    /** Get all database schemas */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusSchemaVO? {
        return client.post(ApiPaths.backendPath("/schema/list/all"), body) as? PlusApiResultListPlusSchemaVO
    }

    /** Get a database schema by ID */
    suspend fun getById(id: String): PlusApiResultPlusSchemaVO? {
        return client.get(ApiPaths.backendPath("/schema/$id")) as? PlusApiResultPlusSchemaVO
    }

    /** Delete a database schema */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/schema/$id")) as? PlusApiResultBoolean
    }
}
