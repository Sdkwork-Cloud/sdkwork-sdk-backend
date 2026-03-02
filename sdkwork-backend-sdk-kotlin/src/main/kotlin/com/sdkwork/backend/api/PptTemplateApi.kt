package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class PptTemplateApi(private val client: HttpClient) {

    /** Update an existing PPT template */
    suspend fun update(body: PlusPptTemplateForm): PlusApiResultPlusPptTemplateVO? {
        return client.put(ApiPaths.backendPath("/ppt/template"), body) as? PlusApiResultPlusPptTemplateVO
    }

    /** Create a new PPT template */
    suspend fun create(body: PlusPptTemplateForm): PlusApiResultPlusPptTemplateVO? {
        return client.post(ApiPaths.backendPath("/ppt/template"), body) as? PlusApiResultPlusPptTemplateVO
    }

    /** Get PPT templates by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusPptTemplateVO? {
        return client.post(ApiPaths.backendPath("/ppt/template/list"), body, params) as? PlusApiResultPagePlusPptTemplateVO
    }

    /** Get all PPT templates */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusPptTemplateVO? {
        return client.post(ApiPaths.backendPath("/ppt/template/list/all"), body) as? PlusApiResultListPlusPptTemplateVO
    }

    /** Get a PPT template by ID */
    suspend fun getById(id: String): PlusApiResultPlusPptTemplateVO? {
        return client.get(ApiPaths.backendPath("/ppt/template/$id")) as? PlusApiResultPlusPptTemplateVO
    }

    /** Delete a PPT template */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/ppt/template/$id")) as? PlusApiResultBoolean
    }
}
