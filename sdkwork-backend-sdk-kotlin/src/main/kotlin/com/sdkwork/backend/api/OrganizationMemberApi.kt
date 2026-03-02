package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class OrganizationMemberApi(private val client: HttpClient) {

    /** Update organization member */
    suspend fun update(body: PlusOrganizationMemberForm): PlusApiResultPlusOrganizationMemberVO? {
        return client.put(ApiPaths.backendPath("/organization-member"), body) as? PlusApiResultPlusOrganizationMemberVO
    }

    /** Create organization member */
    suspend fun create(body: PlusOrganizationMemberForm): PlusApiResultPlusOrganizationMemberVO? {
        return client.post(ApiPaths.backendPath("/organization-member"), body) as? PlusApiResultPlusOrganizationMemberVO
    }

    /** Get organization members by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusOrganizationMemberVO? {
        return client.post(ApiPaths.backendPath("/organization-member/list"), body, params) as? PlusApiResultPagePlusOrganizationMemberVO
    }

    /** Get all organization members */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusOrganizationMemberVO? {
        return client.post(ApiPaths.backendPath("/organization-member/list/all"), body) as? PlusApiResultListPlusOrganizationMemberVO
    }

    /** Get organization member by ID */
    suspend fun getById(id: String): PlusApiResultPlusOrganizationMemberVO? {
        return client.get(ApiPaths.backendPath("/organization-member/$id")) as? PlusApiResultPlusOrganizationMemberVO
    }

    /** Delete organization member */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/organization-member/$id")) as? PlusApiResultBoolean
    }
}
