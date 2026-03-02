package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class WorkspaceApi(private val client: HttpClient) {

    /** Update an existing workspace */
    suspend fun update(body: PlusWorkspaceForm): PlusApiResultPlusWorkspaceVO? {
        return client.put(ApiPaths.backendPath("/workspace"), body) as? PlusApiResultPlusWorkspaceVO
    }

    /** Create a new workspace */
    suspend fun create(body: PlusWorkspaceForm): PlusApiResultPlusWorkspaceVO? {
        return client.post(ApiPaths.backendPath("/workspace"), body) as? PlusApiResultPlusWorkspaceVO
    }

    /** Get workspaces by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusWorkspaceVO? {
        return client.post(ApiPaths.backendPath("/workspace/list"), body, params) as? PlusApiResultPagePlusWorkspaceVO
    }

    /** Get all workspaces */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusWorkspaceVO? {
        return client.post(ApiPaths.backendPath("/workspace/list/all"), body) as? PlusApiResultListPlusWorkspaceVO
    }

    /** Get a workspace by ID */
    suspend fun getById(id: String): PlusApiResultPlusWorkspaceVO? {
        return client.get(ApiPaths.backendPath("/workspace/$id")) as? PlusApiResultPlusWorkspaceVO
    }

    /** Delete a workspace */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/workspace/$id")) as? PlusApiResultBoolean
    }
}
