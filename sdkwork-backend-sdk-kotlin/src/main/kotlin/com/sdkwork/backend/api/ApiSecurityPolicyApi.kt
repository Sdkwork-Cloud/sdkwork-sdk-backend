package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ApiSecurityPolicyApi(private val client: HttpClient) {

    suspend fun update(body: PlusApiSecurityPolicyForm): PlusApiResultPlusApiSecurityPolicyVO? {
        return client.put(ApiPaths.backendPath("/security/policy"), body) as? PlusApiResultPlusApiSecurityPolicyVO
    }

    suspend fun create(body: PlusApiSecurityPolicyForm): PlusApiResultPlusApiSecurityPolicyVO? {
        return client.post(ApiPaths.backendPath("/security/policy"), body) as? PlusApiResultPlusApiSecurityPolicyVO
    }

    /** List policies by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusApiSecurityPolicyVO? {
        return client.post(ApiPaths.backendPath("/security/policy/list"), body, params) as? PlusApiResultPagePlusApiSecurityPolicyVO
    }

    /** List all policies */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusApiSecurityPolicyVO? {
        return client.post(ApiPaths.backendPath("/security/policy/list/all"), body) as? PlusApiResultListPlusApiSecurityPolicyVO
    }

    suspend fun getById(id: String): PlusApiResultPlusApiSecurityPolicyVO? {
        return client.get(ApiPaths.backendPath("/security/policy/$id")) as? PlusApiResultPlusApiSecurityPolicyVO
    }

    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/security/policy/$id")) as? PlusApiResultBoolean
    }
}
