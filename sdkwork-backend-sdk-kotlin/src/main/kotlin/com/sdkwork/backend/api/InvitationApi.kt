package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class InvitationApi(private val client: HttpClient) {

    /** Update an invitation relation */
    suspend fun update(body: InvitationRelationForm): PlusApiResultInvitationRelationVO? {
        return client.put(ApiPaths.backendPath("/invitation/relation"), body) as? PlusApiResultInvitationRelationVO
    }

    /** Create a new invitation relation */
    suspend fun create(body: InvitationRelationForm): PlusApiResultInvitationRelationVO? {
        return client.post(ApiPaths.backendPath("/invitation/relation"), body) as? PlusApiResultInvitationRelationVO
    }

    /** Update an existing invitation code */
    suspend fun updateCode(body: InvitationCodeForm): PlusApiResultInvitationCodeVO? {
        return client.put(ApiPaths.backendPath("/invitation/code"), body) as? PlusApiResultInvitationCodeVO
    }

    /** Create a new invitation code */
    suspend fun createCode(body: InvitationCodeForm): PlusApiResultInvitationCodeVO? {
        return client.post(ApiPaths.backendPath("/invitation/code"), body) as? PlusApiResultInvitationCodeVO
    }

    /** Get invitation relations by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPageInvitationRelationVO? {
        return client.post(ApiPaths.backendPath("/invitation/relation/list"), body, params) as? PlusApiResultPageInvitationRelationVO
    }

    /** Get all invitation relations */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListInvitationRelationVO? {
        return client.post(ApiPaths.backendPath("/invitation/relation/list/all"), body) as? PlusApiResultListInvitationRelationVO
    }

    /** Get invitation codes by page */
    suspend fun createListByPageCode(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPageInvitationCodeVO? {
        return client.post(ApiPaths.backendPath("/invitation/code/list"), body, params) as? PlusApiResultPageInvitationCodeVO
    }

    /** Get all invitation codes */
    suspend fun createListAllEntitiesCode(body: QueryListForm? = null): PlusApiResultListInvitationCodeVO? {
        return client.post(ApiPaths.backendPath("/invitation/code/list/all"), body) as? PlusApiResultListInvitationCodeVO
    }

    /** Get an invitation relation by ID */
    suspend fun getById(id: String): PlusApiResultInvitationRelationVO? {
        return client.get(ApiPaths.backendPath("/invitation/relation/$id")) as? PlusApiResultInvitationRelationVO
    }

    /** Delete an invitation relation */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/invitation/relation/$id")) as? PlusApiResultBoolean
    }

    /** Get an invitation code by ID */
    suspend fun getByIdCode(id: String): PlusApiResultInvitationCodeVO? {
        return client.get(ApiPaths.backendPath("/invitation/code/$id")) as? PlusApiResultInvitationCodeVO
    }

    /** Delete an invitation code */
    suspend fun deleteCode(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/invitation/code/$id")) as? PlusApiResultBoolean
    }
}
