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

    /** Update an existing position */
    suspend fun updatePosition(body: PlusPositionForm): PlusApiResultPlusPositionVO? {
        return client.put(ApiPaths.backendPath("/organization/position"), body) as? PlusApiResultPlusPositionVO
    }

    /** Create a new position */
    suspend fun createPosition(body: PlusPositionForm): PlusApiResultPlusPositionVO? {
        return client.post(ApiPaths.backendPath("/organization/position"), body) as? PlusApiResultPlusPositionVO
    }

    /** Update member relation */
    suspend fun updateMemberRelations(body: PlusMemberRelationsForm): PlusApiResultPlusMemberRelationsVO? {
        return client.put(ApiPaths.backendPath("/organization/member-relations"), body) as? PlusApiResultPlusMemberRelationsVO
    }

    /** Create member relation */
    suspend fun createMemberRelations(body: PlusMemberRelationsForm): PlusApiResultPlusMemberRelationsVO? {
        return client.post(ApiPaths.backendPath("/organization/member-relations"), body) as? PlusApiResultPlusMemberRelationsVO
    }

    /** Uninstall app from organization */
    suspend fun uninstall(id: String, body: PlusOrganizationForm): PlusApiResultPlusOrganizationVO? {
        return client.post(ApiPaths.backendPath("/organization/$id/uninstall"), body) as? PlusApiResultPlusOrganizationVO
    }

    /** Install app for organization */
    suspend fun install(id: String, body: PlusOrganizationForm): PlusApiResultPlusOrganizationVO? {
        return client.post(ApiPaths.backendPath("/organization/$id/install"), body) as? PlusApiResultPlusOrganizationVO
    }

    /** Get positions by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusPositionVO? {
        return client.post(ApiPaths.backendPath("/organization/position/list"), body, params) as? PlusApiResultPagePlusPositionVO
    }

    /** Get all positions */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusPositionVO? {
        return client.post(ApiPaths.backendPath("/organization/position/list/all"), body) as? PlusApiResultListPlusPositionVO
    }

    /** Get member relations by page */
    suspend fun createListByPageMemberRelations(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusMemberRelationsVO? {
        return client.post(ApiPaths.backendPath("/organization/member-relations/list"), body, params) as? PlusApiResultPagePlusMemberRelationsVO
    }

    /** Get all member relations */
    suspend fun createListAllEntitiesMemberRelations(body: QueryListForm? = null): PlusApiResultListPlusMemberRelationsVO? {
        return client.post(ApiPaths.backendPath("/organization/member-relations/list/all"), body) as? PlusApiResultListPlusMemberRelationsVO
    }

    /** Get organizations by page */
    suspend fun createListByPageOrganization(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusOrganizationVO? {
        return client.post(ApiPaths.backendPath("/organization/list"), body, params) as? PlusApiResultPagePlusOrganizationVO
    }

    /** Get all organizations */
    suspend fun createListAllEntitiesOrganization(body: QueryListForm? = null): PlusApiResultListPlusOrganizationVO? {
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

    /** Get child organizations */
    suspend fun getChildren(id: String): PlusApiResultListPlusOrganizationVO? {
        return client.get(ApiPaths.backendPath("/organization/$id/children")) as? PlusApiResultListPlusOrganizationVO
    }

    /** Get a position by ID */
    suspend fun getByIdPosition(id: String): PlusApiResultPlusPositionVO? {
        return client.get(ApiPaths.backendPath("/organization/position/$id")) as? PlusApiResultPlusPositionVO
    }

    /** Delete a position */
    suspend fun deletePosition(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/organization/position/$id")) as? PlusApiResultBoolean
    }

    /** Get member relation by ID */
    suspend fun getByIdMemberRelations(id: String): PlusApiResultPlusMemberRelationsVO? {
        return client.get(ApiPaths.backendPath("/organization/member-relations/$id")) as? PlusApiResultPlusMemberRelationsVO
    }

    /** Delete member relation */
    suspend fun deleteMemberRelations(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/organization/member-relations/$id")) as? PlusApiResultBoolean
    }
}
