import Foundation

public class SkillApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get one skill detail
    public func getById(id: String) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.get(ApiPaths.backendPath("/skill/\(id)"))
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// Update skill
    public func update(id: String, body: PlusAgentSkillForm) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.put(ApiPaths.backendPath("/skill/\(id)"), body: body)
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// Create skill
    public func create(body: PlusAgentSkillForm) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill"), body: body)
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// Submit skill for review
    public func submitForReview(id: String) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/\(id)/review/submit"), body: nil)
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// Reject skill review
    public func rejectReview(id: String, body: PlusAgentSkillReviewForm? = nil) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/\(id)/review/reject"), body: body)
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// Approve skill review
    public func approveReview(id: String, body: PlusAgentSkillReviewForm? = nil) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/\(id)/review/approve"), body: body)
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// Publish skill
    public func publish(id: String) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/\(id)/publish"), body: nil)
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// Offline skill
    public func offline(id: String) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/\(id)/offline"), body: nil)
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// Update skill featured status
    public func updateFeature(id: String, body: PlusAgentSkillFeatureForm) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/\(id)/feature"), body: body)
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// Enable skill
    public func enable(id: String) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/\(id)/enable"), body: nil)
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// Disable skill
    public func disable(id: String) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/\(id)/disable"), body: nil)
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// List pending review skills by page
    public func listPendingReviewByPage(body: PlusAgentSkillQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/review/pending/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAgentSkillVO
    }

    /// Batch reject skill review
    public func batchRejectReview(body: PlusAgentSkillBatchReviewForm) async throws -> PlusApiResultListPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/review/batch/reject"), body: body)
        return response as? PlusApiResultListPlusAgentSkillVO
    }

    /// Batch approve skill review
    public func batchApproveReview(body: PlusAgentSkillBatchReviewForm) async throws -> PlusApiResultListPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/review/batch/approve"), body: body)
        return response as? PlusApiResultListPlusAgentSkillVO
    }

    /// Query skill list by page
    public func listByPage(body: PlusAgentSkillQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAgentSkillVO
    }

    /// Query all skills
    public func listAll(body: PlusAgentSkillQueryListForm? = nil) async throws -> PlusApiResultListPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/list/all"), body: body)
        return response as? PlusApiResultListPlusAgentSkillVO
    }
}
