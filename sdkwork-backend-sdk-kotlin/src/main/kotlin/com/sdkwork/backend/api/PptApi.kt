package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class PptApi(private val client: HttpClient) {

    /** Update an existing PPT template */
    suspend fun update(body: PlusPptTemplateForm): PlusApiResultPlusPptTemplateVO? {
        return client.put(ApiPaths.backendPath("/ppt/template"), body) as? PlusApiResultPlusPptTemplateVO
    }

    /** Create a new PPT template */
    suspend fun create(body: PlusPptTemplateForm): PlusApiResultPlusPptTemplateVO? {
        return client.post(ApiPaths.backendPath("/ppt/template"), body) as? PlusApiResultPlusPptTemplateVO
    }

    /** Update an existing PPT template slide */
    suspend fun updateSlide(body: PlusPptTemplateSlideForm): PlusApiResultPlusPptTemplateSlideVO? {
        return client.put(ApiPaths.backendPath("/ppt/template/slide"), body) as? PlusApiResultPlusPptTemplateSlideVO
    }

    /** Create a new PPT template slide */
    suspend fun createSlide(body: PlusPptTemplateSlideForm): PlusApiResultPlusPptTemplateSlideVO? {
        return client.post(ApiPaths.backendPath("/ppt/template/slide"), body) as? PlusApiResultPlusPptTemplateSlideVO
    }

    /** Get PPT template slides by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusPptTemplateSlideVO? {
        return client.post(ApiPaths.backendPath("/ppt/template/slide/list"), body, params) as? PlusApiResultPagePlusPptTemplateSlideVO
    }

    /** Get all PPT template slides */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusPptTemplateSlideVO? {
        return client.post(ApiPaths.backendPath("/ppt/template/slide/list/all"), body) as? PlusApiResultListPlusPptTemplateSlideVO
    }

    /** Render PPT template */
    suspend fun render(body: PlusPptTemplateRenderForm): PlusApiResult? {
        return client.post(ApiPaths.backendPath("/ppt/template/render"), body) as? PlusApiResult
    }

    /** Get PPT templates by page */
    suspend fun createListByPageTemplate(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusPptTemplateVO? {
        return client.post(ApiPaths.backendPath("/ppt/template/list"), body, params) as? PlusApiResultPagePlusPptTemplateVO
    }

    /** Get all PPT templates */
    suspend fun createListAllEntitiesTemplate(body: QueryListForm? = null): PlusApiResultListPlusPptTemplateVO? {
        return client.post(ApiPaths.backendPath("/ppt/template/list/all"), body) as? PlusApiResultListPlusPptTemplateVO
    }

    suspend fun stop(params: Map<String, Any>? = null, headers: Map<String, String>? = null): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/ppt/template/chat/stop"), null, params, headers) as? PlusApiResultBoolean
    }

    /** Create a chat completion with PPT template */
    suspend fun createCompletions(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/ppt/template/chat/completions"), body, params, headers) as? ChatCompletionChunk
    }

    /** Get a PPT template by ID */
    suspend fun getById(id: String): PlusApiResultPlusPptTemplateVO? {
        return client.get(ApiPaths.backendPath("/ppt/template/$id")) as? PlusApiResultPlusPptTemplateVO
    }

    /** Delete a PPT template */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/ppt/template/$id")) as? PlusApiResultBoolean
    }

    /** Get a PPT template slide by ID */
    suspend fun getByIdSlide(id: String): PlusApiResultPlusPptTemplateSlideVO? {
        return client.get(ApiPaths.backendPath("/ppt/template/slide/$id")) as? PlusApiResultPlusPptTemplateSlideVO
    }

    /** Delete a PPT template slide */
    suspend fun deleteSlide(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/ppt/template/slide/$id")) as? PlusApiResultBoolean
    }
}
