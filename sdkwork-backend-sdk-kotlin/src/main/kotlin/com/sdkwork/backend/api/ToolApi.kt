package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ToolApi(private val client: HttpClient) {

    /** Update an existing AI tool */
    suspend fun update(body: PlusAiToolForm): PlusApiResultPlusAiToolVO? {
        return client.put(ApiPaths.backendPath("/tool"), body) as? PlusApiResultPlusAiToolVO
    }

    /** Create a new AI tool */
    suspend fun create(body: PlusAiToolForm): PlusApiResultPlusAiToolVO? {
        return client.post(ApiPaths.backendPath("/tool"), body) as? PlusApiResultPlusAiToolVO
    }

    /** Get AI tools by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiToolVO? {
        return client.post(ApiPaths.backendPath("/tool/list"), body, params) as? PlusApiResultPagePlusAiToolVO
    }

    /** Get all AI tools */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAiToolVO? {
        return client.post(ApiPaths.backendPath("/tool/list/all"), body) as? PlusApiResultListPlusAiToolVO
    }

    /** Get an AI tool by ID */
    suspend fun getById(id: String): PlusApiResultPlusAiToolVO? {
        return client.get(ApiPaths.backendPath("/tool/$id")) as? PlusApiResultPlusAiToolVO
    }

    /** Delete an AI tool */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/tool/$id")) as? PlusApiResultBoolean
    }
}
