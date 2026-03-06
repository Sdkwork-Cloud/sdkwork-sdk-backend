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
    suspend fun enable(id: String): PlusApiResultPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/$id/enable"), null) as? PlusApiResultPlusAgentSkillVO
    }

    /** Disable skill */
    suspend fun disable(id: String): PlusApiResultPlusAgentSkillVO? {
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

    /** Query skill list by page */
    suspend fun listByPage(body: PlusAgentSkillQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/list"), body, params) as? PlusApiResultPagePlusAgentSkillVO
    }

    /** Query all skills */
    suspend fun listAll(body: PlusAgentSkillQueryListForm? = null): PlusApiResultListPlusAgentSkillVO? {
        return client.post(ApiPaths.backendPath("/skill/list/all"), body) as? PlusApiResultListPlusAgentSkillVO
    }
}
