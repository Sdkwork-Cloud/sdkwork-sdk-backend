package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class PartnerApi(private val client: HttpClient) {

    /** Update a partner */
    suspend fun update(body: PlusPartnerForm): PlusApiResultPlusPartnerVO? {
        return client.put(ApiPaths.backendPath("/partner"), body) as? PlusApiResultPlusPartnerVO
    }

    /** Create a new partner */
    suspend fun create(body: PlusPartnerForm): PlusApiResultPlusPartnerVO? {
        return client.post(ApiPaths.backendPath("/partner"), body) as? PlusApiResultPlusPartnerVO
    }

    /** Get partners by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusPartnerVO? {
        return client.post(ApiPaths.backendPath("/partner/list"), body, params) as? PlusApiResultPagePlusPartnerVO
    }

    /** Get all partners */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusPartnerVO? {
        return client.post(ApiPaths.backendPath("/partner/list/all"), body) as? PlusApiResultListPlusPartnerVO
    }

    /** Get a partner by ID */
    suspend fun getById(id: String): PlusApiResultPlusPartnerVO? {
        return client.get(ApiPaths.backendPath("/partner/$id")) as? PlusApiResultPlusPartnerVO
    }

    /** Delete a partner */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/partner/$id")) as? PlusApiResultBoolean
    }
}
