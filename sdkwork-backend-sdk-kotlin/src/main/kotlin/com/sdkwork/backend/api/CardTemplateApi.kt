package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class CardTemplateApi(private val client: HttpClient) {

    /** Update an existing card template */
    suspend fun update(body: PlusCardTemplateForm): PlusApiResultPlusCardTemplateVO? {
        return client.put(ApiPaths.backendPath("/card/template"), body) as? PlusApiResultPlusCardTemplateVO
    }

    /** Create a new card template */
    suspend fun create(body: PlusCardTemplateForm): PlusApiResultPlusCardTemplateVO? {
        return client.post(ApiPaths.backendPath("/card/template"), body) as? PlusApiResultPlusCardTemplateVO
    }

    /** Get card templates by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCardTemplateVO? {
        return client.post(ApiPaths.backendPath("/card/template/list"), body, params) as? PlusApiResultPagePlusCardTemplateVO
    }

    /** Get all card templates */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusCardTemplateVO? {
        return client.post(ApiPaths.backendPath("/card/template/list/all"), body) as? PlusApiResultListPlusCardTemplateVO
    }

    /** Get a card template by ID */
    suspend fun getById(id: String): PlusApiResultPlusCardTemplateVO? {
        return client.get(ApiPaths.backendPath("/card/template/$id")) as? PlusApiResultPlusCardTemplateVO
    }

    /** Delete a card template */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/card/template/$id")) as? PlusApiResultBoolean
    }
}
