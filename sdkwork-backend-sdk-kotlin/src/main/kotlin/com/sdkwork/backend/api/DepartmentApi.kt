package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class DepartmentApi(private val client: HttpClient) {

    /** Update an existing department */
    suspend fun update(body: PlusDepartmentForm): PlusApiResultPlusDepartmentVO? {
        return client.put(ApiPaths.backendPath("/department"), body) as? PlusApiResultPlusDepartmentVO
    }

    /** Create a new department */
    suspend fun create(body: PlusDepartmentForm): PlusApiResultPlusDepartmentVO? {
        return client.post(ApiPaths.backendPath("/department"), body) as? PlusApiResultPlusDepartmentVO
    }

    /** Move department */
    suspend fun move(id: String, params: Map<String, Any>? = null): PlusApiResultPlusDepartmentVO? {
        return client.put(ApiPaths.backendPath("/department/$id/move"), null, params) as? PlusApiResultPlusDepartmentVO
    }

    /** Set primary department */
    suspend fun setPrimary(id: String, memberId: String): PlusApiResultBoolean? {
        return client.put(ApiPaths.backendPath("/department/$id/members/$memberId/primary"), null) as? PlusApiResultBoolean
    }

    /** Add member to department */
    suspend fun addMemberTo(id: String, memberId: String, params: Map<String, Any>? = null): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/department/$id/members/$memberId"), null, params) as? PlusApiResultBoolean
    }

    /** Remove member from department */
    suspend fun removeMemberFrom(id: String, memberId: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/department/$id/members/$memberId")) as? PlusApiResultBoolean
    }

    /** Get departments by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusDepartmentVO? {
        return client.post(ApiPaths.backendPath("/department/list"), body, params) as? PlusApiResultPagePlusDepartmentVO
    }

    /** Get all departments */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusDepartmentVO? {
        return client.post(ApiPaths.backendPath("/department/list/all"), body) as? PlusApiResultListPlusDepartmentVO
    }

    /** Get a department by ID */
    suspend fun getById(id: String): PlusApiResultPlusDepartmentVO? {
        return client.get(ApiPaths.backendPath("/department/$id")) as? PlusApiResultPlusDepartmentVO
    }

    /** Delete a department */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/department/$id")) as? PlusApiResultBoolean
    }

    /** Get department members */
    suspend fun getDepartmentMembers(id: String, params: Map<String, Any>? = null): PlusApiResultListPlusOrganizationMemberVO? {
        return client.get(ApiPaths.backendPath("/department/$id/members"), params) as? PlusApiResultListPlusOrganizationMemberVO
    }
}
