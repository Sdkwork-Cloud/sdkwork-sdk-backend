package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class OrganizationApi(private val client: HttpClient) {

    /** Update an existing organization */
    suspend fun update(body: PlusOrganizationForm): PlusApiResultPlusOrganizationVO? {
        return client.put(ApiPaths.backendPath("/organization"), body) as? PlusApiResultPlusOrganizationVO
    }

    /** Create a new organization */
    suspend fun create(body: PlusOrganizationForm): PlusApiResultPlusOrganizationVO? {
        return client.post(ApiPaths.backendPath("/organization"), body) as? PlusApiResultPlusOrganizationVO
    }

    /** Uninstall app from organization */
    suspend fun uninstall(id: String, body: PlusOrganizationForm): PlusApiResultPlusOrganizationVO? {
        return client.post(ApiPaths.backendPath("/organization/$id/uninstall"), body) as? PlusApiResultPlusOrganizationVO
    }

    /** Install app for organization */
    suspend fun install(id: String, body: PlusOrganizationForm): PlusApiResultPlusOrganizationVO? {
        return client.post(ApiPaths.backendPath("/organization/$id/install"), body) as? PlusApiResultPlusOrganizationVO
    }

    /** Get organizations by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusOrganizationVO? {
        return client.post(ApiPaths.backendPath("/organization/list"), body, params) as? PlusApiResultPagePlusOrganizationVO
    }

    /** Get all organizations */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusOrganizationVO? {
        return client.post(ApiPaths.backendPath("/organization/list/all"), body) as? PlusApiResultListPlusOrganizationVO
    }

    /** Get access tokens */
    suspend fun getAccessTokens(body: GetAccessTokenForm): PlusApiResultListTokenResult? {
        return client.post(ApiPaths.backendPath("/organization/get_access_tokens"), body) as? PlusApiResultListTokenResult
    }

    /** Get an organization by ID */
    suspend fun getById(id: String): PlusApiResultPlusOrganizationVO? {
        return client.get(ApiPaths.backendPath("/organization/$id")) as? PlusApiResultPlusOrganizationVO
    }

    /** Delete an organization */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/organization/$id")) as? PlusApiResultBoolean
    }
}
