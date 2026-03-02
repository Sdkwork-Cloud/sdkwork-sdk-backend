package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class MemberRelationsApi(private val client: HttpClient) {

    /** Update member relation */
    suspend fun update(body: PlusMemberRelationsForm): PlusApiResultPlusMemberRelationsVO? {
        return client.put(ApiPaths.backendPath("/organization/member-relations"), body) as? PlusApiResultPlusMemberRelationsVO
    }

    /** Create member relation */
    suspend fun create(body: PlusMemberRelationsForm): PlusApiResultPlusMemberRelationsVO? {
        return client.post(ApiPaths.backendPath("/organization/member-relations"), body) as? PlusApiResultPlusMemberRelationsVO
    }

    /** Get member relations by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusMemberRelationsVO? {
        return client.post(ApiPaths.backendPath("/organization/member-relations/list"), body, params) as? PlusApiResultPagePlusMemberRelationsVO
    }

    /** Get all member relations */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusMemberRelationsVO? {
        return client.post(ApiPaths.backendPath("/organization/member-relations/list/all"), body) as? PlusApiResultListPlusMemberRelationsVO
    }

    /** Get member relation by ID */
    suspend fun getById(id: String): PlusApiResultPlusMemberRelationsVO? {
        return client.get(ApiPaths.backendPath("/organization/member-relations/$id")) as? PlusApiResultPlusMemberRelationsVO
    }

    /** Delete member relation */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/organization/member-relations/$id")) as? PlusApiResultBoolean
    }
}
