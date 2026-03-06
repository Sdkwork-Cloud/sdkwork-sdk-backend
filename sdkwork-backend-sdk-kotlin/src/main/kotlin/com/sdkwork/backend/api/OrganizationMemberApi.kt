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

    /** Transfer member position */
    suspend fun transferPosition(id: String, params: Map<String, Any>? = null): PlusApiResultBoolean? {
        return client.put(ApiPaths.backendPath("/organization-member/$id/positions/transfer"), null, params) as? PlusApiResultBoolean
    }

    /** Set member primary department */
    suspend fun setPrimaryDepartment(id: String, departmentId: String): PlusApiResultBoolean? {
        return client.put(ApiPaths.backendPath("/organization-member/$id/departments/$departmentId/primary"), null) as? PlusApiResultBoolean
    }

    /** Transfer member department */
    suspend fun transferDepartment(id: String, params: Map<String, Any>? = null): PlusApiResultBoolean? {
        return client.put(ApiPaths.backendPath("/organization-member/$id/departments/transfer"), null, params) as? PlusApiResultBoolean
    }

    /** Deactivate member */
    suspend fun deactivateMember(id: String): PlusApiResultBoolean? {
        return client.put(ApiPaths.backendPath("/organization-member/$id/deactivate"), null) as? PlusApiResultBoolean
    }

    /** Activate member */
    suspend fun activateMember(id: String): PlusApiResultBoolean? {
        return client.put(ApiPaths.backendPath("/organization-member/$id/activate"), null) as? PlusApiResultBoolean
    }

    /** Bind member to department */
    suspend fun addToDepartment(id: String, departmentId: String, params: Map<String, Any>? = null): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/organization-member/$id/departments/$departmentId"), null, params) as? PlusApiResultBoolean
    }

    /** Unbind member from department */
    suspend fun removeFromDepartment(id: String, departmentId: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/organization-member/$id/departments/$departmentId")) as? PlusApiResultBoolean
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

    /** Get member role ids */
    suspend fun getMemberRoleIds(id: String): PlusApiResultListLong? {
        return client.get(ApiPaths.backendPath("/organization-member/$id/roles")) as? PlusApiResultListLong
    }

    /** Get member positions */
    suspend fun getMemberPositions(id: String): PlusApiResultListPlusPositionVO? {
        return client.get(ApiPaths.backendPath("/organization-member/$id/positions")) as? PlusApiResultListPlusPositionVO
    }

    /** Get member departments */
    suspend fun getMemberDepartments(id: String): PlusApiResultListPlusDepartmentVO? {
        return client.get(ApiPaths.backendPath("/organization-member/$id/departments")) as? PlusApiResultListPlusDepartmentVO
    }
}
