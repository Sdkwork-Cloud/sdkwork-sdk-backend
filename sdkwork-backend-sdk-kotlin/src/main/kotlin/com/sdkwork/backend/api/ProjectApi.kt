package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ProjectApi(private val client: HttpClient) {

    /** Update an existing project */
    suspend fun update(body: PlusProjectForm): PlusApiResultPlusProjectVO? {
        return client.put(ApiPaths.backendPath("/project"), body) as? PlusApiResultPlusProjectVO
    }

    /** Create a new project */
    suspend fun create(body: PlusProjectForm): PlusApiResultPlusProjectVO? {
        return client.post(ApiPaths.backendPath("/project"), body) as? PlusApiResultPlusProjectVO
    }

    /** Get projects by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusProjectVO? {
        return client.post(ApiPaths.backendPath("/project/list"), body, params) as? PlusApiResultPagePlusProjectVO
    }

    /** Get all projects */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusProjectVO? {
        return client.post(ApiPaths.backendPath("/project/list/all"), body) as? PlusApiResultListPlusProjectVO
    }

    /** Get a project by ID */
    suspend fun getById(id: String): PlusApiResultPlusProjectVO? {
        return client.get(ApiPaths.backendPath("/project/$id")) as? PlusApiResultPlusProjectVO
    }

    /** Delete a project */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/project/$id")) as? PlusApiResultBoolean
    }
}
