package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class SkillApi {
    private final HttpClient client;
    
    public SkillApi(HttpClient client) {
        this.client = client;
    }

    /** Get one skill detail */
    public PlusApiResultPlusAgentSkillVO getById(String id) throws Exception {
        return (PlusApiResultPlusAgentSkillVO) client.get(ApiPaths.backendPath("/skill/" + id + ""));
    }

    /** Update skill */
    public PlusApiResultPlusAgentSkillVO update(String id, PlusAgentSkillForm body) throws Exception {
        return (PlusApiResultPlusAgentSkillVO) client.put(ApiPaths.backendPath("/skill/" + id + ""), body);
    }

    /** Create skill */
    public PlusApiResultPlusAgentSkillVO create(PlusAgentSkillForm body) throws Exception {
        return (PlusApiResultPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill"), body);
    }

    /** Submit skill for review */
    public PlusApiResultPlusAgentSkillVO submitForReview(String id) throws Exception {
        return (PlusApiResultPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/" + id + "/review/submit"), null);
    }

    /** Reject skill review */
    public PlusApiResultPlusAgentSkillVO rejectReview(String id, PlusAgentSkillReviewForm body) throws Exception {
        return (PlusApiResultPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/" + id + "/review/reject"), body);
    }

    /** Approve skill review */
    public PlusApiResultPlusAgentSkillVO approveReview(String id, PlusAgentSkillReviewForm body) throws Exception {
        return (PlusApiResultPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/" + id + "/review/approve"), body);
    }

    /** Publish skill */
    public PlusApiResultPlusAgentSkillVO publish(String id) throws Exception {
        return (PlusApiResultPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/" + id + "/publish"), null);
    }

    /** Offline skill */
    public PlusApiResultPlusAgentSkillVO offline(String id) throws Exception {
        return (PlusApiResultPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/" + id + "/offline"), null);
    }

    /** Update skill featured status */
    public PlusApiResultPlusAgentSkillVO updateFeature(String id, PlusAgentSkillFeatureForm body) throws Exception {
        return (PlusApiResultPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/" + id + "/feature"), body);
    }

    /** Enable skill */
    public PlusApiResultPlusAgentSkillVO enable(String id) throws Exception {
        return (PlusApiResultPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/" + id + "/enable"), null);
    }

    /** Disable skill */
    public PlusApiResultPlusAgentSkillVO disable(String id) throws Exception {
        return (PlusApiResultPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/" + id + "/disable"), null);
    }

    /** List pending review skills by page */
    public PlusApiResultPagePlusAgentSkillVO listPendingReviewByPage(PlusAgentSkillQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/review/pending/list"), body, params);
    }

    /** Batch reject skill review */
    public PlusApiResultListPlusAgentSkillVO batchRejectReview(PlusAgentSkillBatchReviewForm body) throws Exception {
        return (PlusApiResultListPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/review/batch/reject"), body);
    }

    /** Batch approve skill review */
    public PlusApiResultListPlusAgentSkillVO batchApproveReview(PlusAgentSkillBatchReviewForm body) throws Exception {
        return (PlusApiResultListPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/review/batch/approve"), body);
    }

    /** Query skill list by page */
    public PlusApiResultPagePlusAgentSkillVO listByPage(PlusAgentSkillQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/list"), body, params);
    }

    /** Query all skills */
    public PlusApiResultListPlusAgentSkillVO listAll(PlusAgentSkillQueryListForm body) throws Exception {
        return (PlusApiResultListPlusAgentSkillVO) client.post(ApiPaths.backendPath("/skill/list/all"), body);
    }
}
