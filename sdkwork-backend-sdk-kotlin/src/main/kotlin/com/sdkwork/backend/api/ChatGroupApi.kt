package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ChatGroupApi(private val client: HttpClient) {

    /** Update an existing chat group */
    suspend fun update(body: PlusImGroupForm): PlusApiResultPlusImGroupVO? {
        return client.put(ApiPaths.backendPath("/im/group"), body) as? PlusApiResultPlusImGroupVO
    }

    /** Create a new chat group */
    suspend fun create(body: PlusImGroupForm): PlusApiResultPlusImGroupVO? {
        return client.post(ApiPaths.backendPath("/im/group"), body) as? PlusApiResultPlusImGroupVO
    }

    /** Get chat groups by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusImGroupVO? {
        return client.post(ApiPaths.backendPath("/im/group/list"), body, params) as? PlusApiResultPagePlusImGroupVO
    }

    /** Get all chat groups */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusImGroupVO? {
        return client.post(ApiPaths.backendPath("/im/group/list/all"), body) as? PlusApiResultListPlusImGroupVO
    }

    /** Get a chat group by ID */
    suspend fun getById(id: String): PlusApiResultPlusImGroupVO? {
        return client.get(ApiPaths.backendPath("/im/group/$id")) as? PlusApiResultPlusImGroupVO
    }

    /** Delete a chat group */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/im/group/$id")) as? PlusApiResultBoolean
    }
}
