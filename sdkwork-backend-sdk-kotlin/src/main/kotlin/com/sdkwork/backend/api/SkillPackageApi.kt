package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class SkillPackageApi(private val client: HttpClient) {

    /** Get skill package detail */
    suspend fun getById(id: String): PlusApiResultPlusAgentSkillPackageVO? {
        return client.get(ApiPaths.backendPath("/skill/package/$id")) as? PlusApiResultPlusAgentSkillPackageVO
    }

    /** Update skill package */
    suspend fun update(id: String, body: PlusAgentSkillPackageForm): PlusApiResultPlusAgentSkillPackageVO? {
        return client.put(ApiPaths.backendPath("/skill/package/$id"), body) as? PlusApiResultPlusAgentSkillPackageVO
    }

    /** Delete skill package */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/skill/package/$id")) as? PlusApiResultBoolean
    }

    /** Create skill package */
    suspend fun create(body: PlusAgentSkillPackageForm): PlusApiResultPlusAgentSkillPackageVO? {
        return client.post(ApiPaths.backendPath("/skill/package"), body) as? PlusApiResultPlusAgentSkillPackageVO
    }

    /** Enable skill package */
    suspend fun enable(id: String): PlusApiResultPlusAgentSkillPackageVO? {
        return client.post(ApiPaths.backendPath("/skill/package/$id/enable"), null) as? PlusApiResultPlusAgentSkillPackageVO
    }

    /** Disable skill package */
    suspend fun disable(id: String): PlusApiResultPlusAgentSkillPackageVO? {
        return client.post(ApiPaths.backendPath("/skill/package/$id/disable"), null) as? PlusApiResultPlusAgentSkillPackageVO
    }

    /** Query skill package list by page */
    suspend fun listByPage(body: PlusAgentSkillPackageQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAgentSkillPackageVO? {
        return client.post(ApiPaths.backendPath("/skill/package/list"), body, params) as? PlusApiResultPagePlusAgentSkillPackageVO
    }

    /** Query all skill packages */
    suspend fun listAll(body: PlusAgentSkillPackageQueryListForm? = null): PlusApiResultListPlusAgentSkillPackageVO? {
        return client.post(ApiPaths.backendPath("/skill/package/list/all"), body) as? PlusApiResultListPlusAgentSkillPackageVO
    }
}
