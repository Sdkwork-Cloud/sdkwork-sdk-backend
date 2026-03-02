package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class InvitationCodeApi(private val client: HttpClient) {

    /** Update an existing invitation code */
    suspend fun update(body: InvitationCodeForm): PlusApiResultInvitationCodeVO? {
        return client.put(ApiPaths.backendPath("/invitation/code"), body) as? PlusApiResultInvitationCodeVO
    }

    /** Create a new invitation code */
    suspend fun create(body: InvitationCodeForm): PlusApiResultInvitationCodeVO? {
        return client.post(ApiPaths.backendPath("/invitation/code"), body) as? PlusApiResultInvitationCodeVO
    }

    /** Get invitation codes by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPageInvitationCodeVO? {
        return client.post(ApiPaths.backendPath("/invitation/code/list"), body, params) as? PlusApiResultPageInvitationCodeVO
    }

    /** Get all invitation codes */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListInvitationCodeVO? {
        return client.post(ApiPaths.backendPath("/invitation/code/list/all"), body) as? PlusApiResultListInvitationCodeVO
    }

    /** Get an invitation code by ID */
    suspend fun getById(id: String): PlusApiResultInvitationCodeVO? {
        return client.get(ApiPaths.backendPath("/invitation/code/$id")) as? PlusApiResultInvitationCodeVO
    }

    /** Delete an invitation code */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/invitation/code/$id")) as? PlusApiResultBoolean
    }
}
