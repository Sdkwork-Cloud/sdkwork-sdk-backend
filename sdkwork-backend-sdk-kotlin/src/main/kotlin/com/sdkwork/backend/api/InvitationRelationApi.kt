package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class InvitationRelationApi(private val client: HttpClient) {

    /** Update an invitation relation */
    suspend fun update(body: InvitationRelationForm): PlusApiResultInvitationRelationVO? {
        return client.put(ApiPaths.backendPath("/invitation/relation"), body) as? PlusApiResultInvitationRelationVO
    }

    /** Create a new invitation relation */
    suspend fun create(body: InvitationRelationForm): PlusApiResultInvitationRelationVO? {
        return client.post(ApiPaths.backendPath("/invitation/relation"), body) as? PlusApiResultInvitationRelationVO
    }

    /** Get invitation relations by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPageInvitationRelationVO? {
        return client.post(ApiPaths.backendPath("/invitation/relation/list"), body, params) as? PlusApiResultPageInvitationRelationVO
    }

    /** Get all invitation relations */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListInvitationRelationVO? {
        return client.post(ApiPaths.backendPath("/invitation/relation/list/all"), body) as? PlusApiResultListInvitationRelationVO
    }

    /** Get an invitation relation by ID */
    suspend fun getById(id: String): PlusApiResultInvitationRelationVO? {
        return client.get(ApiPaths.backendPath("/invitation/relation/$id")) as? PlusApiResultInvitationRelationVO
    }

    /** Delete an invitation relation */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/invitation/relation/$id")) as? PlusApiResultBoolean
    }
}
