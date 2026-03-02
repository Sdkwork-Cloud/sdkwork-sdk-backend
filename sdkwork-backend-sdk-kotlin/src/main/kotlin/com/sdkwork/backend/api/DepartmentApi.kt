package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class DepartmentApi(private val client: HttpClient) {

    /** Update an existing department */
    suspend fun update(body: PlusDepartmentForm): PlusApiResultPlusDepartmentVO? {
        return client.put(ApiPaths.backendPath("/department"), body) as? PlusApiResultPlusDepartmentVO
    }

    /** Create a new department */
    suspend fun create(body: PlusDepartmentForm): PlusApiResultPlusDepartmentVO? {
        return client.post(ApiPaths.backendPath("/department"), body) as? PlusApiResultPlusDepartmentVO
    }

    /** Get departments by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusDepartmentVO? {
        return client.post(ApiPaths.backendPath("/department/list"), body, params) as? PlusApiResultPagePlusDepartmentVO
    }

    /** Get all departments */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusDepartmentVO? {
        return client.post(ApiPaths.backendPath("/department/list/all"), body) as? PlusApiResultListPlusDepartmentVO
    }

    /** Get a department by ID */
    suspend fun getById(id: String): PlusApiResultPlusDepartmentVO? {
        return client.get(ApiPaths.backendPath("/department/$id")) as? PlusApiResultPlusDepartmentVO
    }

    /** Delete a department */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/department/$id")) as? PlusApiResultBoolean
    }
}
