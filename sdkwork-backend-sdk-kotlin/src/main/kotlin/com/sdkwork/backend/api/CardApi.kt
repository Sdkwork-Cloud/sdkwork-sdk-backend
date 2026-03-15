package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class CardApi(private val client: HttpClient) {

    /** Update an existing membership card */
    suspend fun update(body: PlusCardForm): PlusApiResultPlusCardVO? {
        return client.put(ApiPaths.backendPath("/card"), body) as? PlusApiResultPlusCardVO
    }

    /** Create a new membership card */
    suspend fun create(body: PlusCardForm): PlusApiResultPlusCardVO? {
        return client.post(ApiPaths.backendPath("/card"), body) as? PlusApiResultPlusCardVO
    }

    /** Update an existing card template */
    suspend fun updateTemplate(body: PlusCardTemplateForm): PlusApiResultPlusCardTemplateVO? {
        return client.put(ApiPaths.backendPath("/card/template"), body) as? PlusApiResultPlusCardTemplateVO
    }

    /** Create a new card template */
    suspend fun createTemplate(body: PlusCardTemplateForm): PlusApiResultPlusCardTemplateVO? {
        return client.post(ApiPaths.backendPath("/card/template"), body) as? PlusApiResultPlusCardTemplateVO
    }

    /** Get card templates by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCardTemplateVO? {
        return client.post(ApiPaths.backendPath("/card/template/list"), body, params) as? PlusApiResultPagePlusCardTemplateVO
    }

    /** Get all card templates */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusCardTemplateVO? {
        return client.post(ApiPaths.backendPath("/card/template/list/all"), body) as? PlusApiResultListPlusCardTemplateVO
    }

    /** Get membership cards by page */
    suspend fun createListByPageCard(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCardVO? {
        return client.post(ApiPaths.backendPath("/card/list"), body, params) as? PlusApiResultPagePlusCardVO
    }

    /** Get all membership cards */
    suspend fun createListAllEntitiesCard(body: QueryListForm? = null): PlusApiResultListPlusCardVO? {
        return client.post(ApiPaths.backendPath("/card/list/all"), body) as? PlusApiResultListPlusCardVO
    }

    /** Get a membership card by ID */
    suspend fun getById(id: String): PlusApiResultPlusCardVO? {
        return client.get(ApiPaths.backendPath("/card/$id")) as? PlusApiResultPlusCardVO
    }

    /** Delete a membership card */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/card/$id")) as? PlusApiResultBoolean
    }

    /** Get a card template by ID */
    suspend fun getByIdTemplate(id: String): PlusApiResultPlusCardTemplateVO? {
        return client.get(ApiPaths.backendPath("/card/template/$id")) as? PlusApiResultPlusCardTemplateVO
    }

    /** Delete a card template */
    suspend fun deleteTemplate(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/card/template/$id")) as? PlusApiResultBoolean
    }
}
