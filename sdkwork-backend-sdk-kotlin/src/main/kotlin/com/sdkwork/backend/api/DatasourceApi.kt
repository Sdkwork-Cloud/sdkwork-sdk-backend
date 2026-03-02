package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class DatasourceApi(private val client: HttpClient) {

    /** Update an existing data source */
    suspend fun update(body: PlusDatasourceForm): PlusApiResultPlusDatasourceVO? {
        return client.put(ApiPaths.backendPath("/datasource"), body) as? PlusApiResultPlusDatasourceVO
    }

    /** Create a new data source */
    suspend fun create(body: PlusDatasourceForm): PlusApiResultPlusDatasourceVO? {
        return client.post(ApiPaths.backendPath("/datasource"), body) as? PlusApiResultPlusDatasourceVO
    }

    suspend fun stop(headers: Map<String, String>? = null): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/datasource/stop"), null, null, headers) as? PlusApiResultBoolean
    }

    /** Get data sources by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusDatasourceVO? {
        return client.post(ApiPaths.backendPath("/datasource/list"), body, params) as? PlusApiResultPagePlusDatasourceVO
    }

    /** Get all data sources */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusDatasourceVO? {
        return client.post(ApiPaths.backendPath("/datasource/list/all"), body) as? PlusApiResultListPlusDatasourceVO
    }

    /** Create a chat completion with Datasource */
    suspend fun createCompletions(body: ChatCompletionCreateForm, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/datasource/chat/completions"), body, null, headers) as? ChatCompletionChunk
    }

    /** Get a data source by ID */
    suspend fun getById(id: String): PlusApiResultPlusDatasourceVO? {
        return client.get(ApiPaths.backendPath("/datasource/$id")) as? PlusApiResultPlusDatasourceVO
    }

    /** Delete a data source */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/datasource/$id")) as? PlusApiResultBoolean
    }
}
