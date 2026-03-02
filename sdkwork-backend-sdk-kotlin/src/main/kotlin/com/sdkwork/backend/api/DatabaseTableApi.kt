package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class DatabaseTableApi(private val client: HttpClient) {

    /** Update an existing database table */
    suspend fun update(body: PlusTableForm): PlusApiResultPlusTableVO? {
        return client.put(ApiPaths.backendPath("/table"), body) as? PlusApiResultPlusTableVO
    }

    /** Create a new database table */
    suspend fun create(body: PlusTableForm): PlusApiResultPlusTableVO? {
        return client.post(ApiPaths.backendPath("/table"), body) as? PlusApiResultPlusTableVO
    }

    /** Get database tables by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusTableVO? {
        return client.post(ApiPaths.backendPath("/table/list"), body, params) as? PlusApiResultPagePlusTableVO
    }

    /** Get all database tables */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusTableVO? {
        return client.post(ApiPaths.backendPath("/table/list/all"), body) as? PlusApiResultListPlusTableVO
    }

    /** Get a database table by ID */
    suspend fun getById(id: String): PlusApiResultPlusTableVO? {
        return client.get(ApiPaths.backendPath("/table/$id")) as? PlusApiResultPlusTableVO
    }

    /** Delete a database table */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/table/$id")) as? PlusApiResultBoolean
    }
}
