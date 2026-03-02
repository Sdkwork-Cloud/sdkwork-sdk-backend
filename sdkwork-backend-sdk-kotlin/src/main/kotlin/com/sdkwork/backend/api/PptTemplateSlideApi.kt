package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class PptTemplateSlideApi(private val client: HttpClient) {

    /** Update an existing PPT template slide */
    suspend fun update(body: PlusPptTemplateSlideForm): PlusApiResultPlusPptTemplateSlideVO? {
        return client.put(ApiPaths.backendPath("/ppt/template/slide"), body) as? PlusApiResultPlusPptTemplateSlideVO
    }

    /** Create a new PPT template slide */
    suspend fun create(body: PlusPptTemplateSlideForm): PlusApiResultPlusPptTemplateSlideVO? {
        return client.post(ApiPaths.backendPath("/ppt/template/slide"), body) as? PlusApiResultPlusPptTemplateSlideVO
    }

    /** Get PPT template slides by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusPptTemplateSlideVO? {
        return client.post(ApiPaths.backendPath("/ppt/template/slide/list"), body, params) as? PlusApiResultPagePlusPptTemplateSlideVO
    }

    /** Get all PPT template slides */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusPptTemplateSlideVO? {
        return client.post(ApiPaths.backendPath("/ppt/template/slide/list/all"), body) as? PlusApiResultListPlusPptTemplateSlideVO
    }

    /** Get a PPT template slide by ID */
    suspend fun getById(id: String): PlusApiResultPlusPptTemplateSlideVO? {
        return client.get(ApiPaths.backendPath("/ppt/template/slide/$id")) as? PlusApiResultPlusPptTemplateSlideVO
    }

    /** Delete a PPT template slide */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/ppt/template/slide/$id")) as? PlusApiResultBoolean
    }
}
