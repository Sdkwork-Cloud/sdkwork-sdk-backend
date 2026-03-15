package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class SkillApi(private val client: HttpClient) {

    /** Get one skill detail */
    suspend fun getById(id: String): PlusApiResultPlusAgentSkillVO? {
        return client.get(ApiPaths.backendPath("/skill/$id")) as? PlusApiResultPlusAgentSkillVO
    }

    /** Update skill */
    suspend fun update(id: String, body: PlusAgentSkillForm): PlusApiResultPlusAgentSkillVO? {
        return client.put(ApiPaths.backendPath("/skill/$id"), body) as? PlusApiResultPlusAgentSkillVO
    }

    /** Get skill package detail */
    suspend fun getByIdPackage(id: String): PlusApiResultPlusAgentSkillPackageVO? {
        return client.get(ApiPaths.backendPath("/skill/package/$id")) as? PlusApiResultPlusAgentSkillPackageVO
    }

    /** Update skill package */
    suspend fun updatePackage(id: String, body: PlusAgentSkillPackageForm): PlusApiResultPlusAgentSkillPackageVO? {
        return client.put(ApiPaths.backendPath("/skill/package/$id"), body) as? PlusApiResultPlusAgentSkillPackageVO
    }

    /** Delete skill package */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/skill/package/$id")) as? PlusApiResultBoolean
    }

    /** Create skill */
    suspend fun create(body: PlusAgentSkillForm): PlusApiResultPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill"), body) as? PlusApiResultPlusAgentSkillVO
    }

    /** Submit skill for review */
    suspend fun submitForReview(id: String): PlusApiResultPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/$id/review/submit"), null) as? PlusApiResultPlusAgentSkillVO
    }

    /** Reject skill review */
    suspend fun rejectReview(id: String, body: PlusAgentSkillReviewForm? = null): PlusApiResultPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/$id/review/reject"), body) as? PlusApiResultPlusAgentSkillVO
    }

    /** Approve skill review */
    suspend fun approveReview(id: String, body: PlusAgentSkillReviewForm? = null): PlusApiResultPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/$id/review/approve"), body) as? PlusApiResultPlusAgentSkillVO
    }

    /** Publish skill */
    suspend fun publish(id: String): PlusApiResultPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/$id/publish"), null) as? PlusApiResultPlusAgentSkillVO
    }

    /** Offline skill */
    suspend fun offline(id: String): PlusApiResultPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/$id/offline"), null) as? PlusApiResultPlusAgentSkillVO
    }

    /** Update skill featured status */
    suspend fun updateFeature(id: String, body: PlusAgentSkillFeatureForm): PlusApiResultPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/$id/feature"), body) as? PlusApiResultPlusAgentSkillVO
    }

    /** Enable skill */
    suspend fun createEnable(id: String): PlusApiResultPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/$id/enable"), null) as? PlusApiResultPlusAgentSkillVO
    }

    /** Disable skill */
    suspend fun createDisable(id: String): PlusApiResultPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/$id/disable"), null) as? PlusApiResultPlusAgentSkillVO
    }

    /** List pending review skills by page */
    suspend fun listPendingReviewByPage(body: PlusAgentSkillQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/review/pending/list"), body, params) as? PlusApiResultPagePlusAgentSkillVO
    }

    /** Batch reject skill review */
    suspend fun batchRejectReview(body: PlusAgentSkillBatchReviewForm): PlusApiResultListPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/review/batch/reject"), body) as? PlusApiResultListPlusAgentSkillVO
    }

    /** Batch approve skill review */
    suspend fun batchApproveReview(body: PlusAgentSkillBatchReviewForm): PlusApiResultListPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/review/batch/approve"), body) as? PlusApiResultListPlusAgentSkillVO
    }

    /** Create skill package */
    suspend fun createPackage(body: PlusAgentSkillPackageForm): PlusApiResultPlusAgentSkillPackageVO? {
        return client.post(ApiPaths.backendPath("/skill/package"), body) as? PlusApiResultPlusAgentSkillPackageVO
    }

    /** Enable skill package */
    suspend fun createEnablePackage(id: String): PlusApiResultPlusAgentSkillPackageVO? {
        return client.post(ApiPaths.backendPath("/skill/package/$id/enable"), null) as? PlusApiResultPlusAgentSkillPackageVO
    }

    /** Disable skill package */
    suspend fun createDisablePackage(id: String): PlusApiResultPlusAgentSkillPackageVO? {
        return client.post(ApiPaths.backendPath("/skill/package/$id/disable"), null) as? PlusApiResultPlusAgentSkillPackageVO
    }

    /** Query skill package list by page */
    suspend fun createListByPage(body: PlusAgentSkillPackageQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAgentSkillPackageVO? {
        return client.post(ApiPaths.backendPath("/skill/package/list"), body, params) as? PlusApiResultPagePlusAgentSkillPackageVO
    }

    /** Query all skill packages */
    suspend fun createListAll(body: PlusAgentSkillPackageQueryListForm? = null): PlusApiResultListPlusAgentSkillPackageVO? {
        return client.post(ApiPaths.backendPath("/skill/package/list/all"), body) as? PlusApiResultListPlusAgentSkillPackageVO
    }

    /** Query skill list by page */
    suspend fun createListByPageSkill(body: PlusAgentSkillQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/list"), body, params) as? PlusApiResultPagePlusAgentSkillVO
    }

    /** Query all skills */
    suspend fun createListAllSkill(body: PlusAgentSkillQueryListForm? = null): PlusApiResultListPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/list/all"), body) as? PlusApiResultListPlusAgentSkillVO
    }
}
