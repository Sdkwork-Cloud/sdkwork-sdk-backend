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

    /// Get skill package detail
    public func getByIdPackage(id: String) async throws -> PlusApiResultPlusAgentSkillPackageVO? {
        let response = try await client.get(ApiPaths.backendPath("/skill/package/\(id)"))
        return response as? PlusApiResultPlusAgentSkillPackageVO
    }

    /// Update skill package
    public func updatePackage(id: String, body: PlusAgentSkillPackageForm) async throws -> PlusApiResultPlusAgentSkillPackageVO? {
        let response = try await client.put(ApiPaths.backendPath("/skill/package/\(id)"), body: body)
        return response as? PlusApiResultPlusAgentSkillPackageVO
    }

    /// Delete skill package
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/skill/package/\(id)"))
        return response as? PlusApiResultBoolean
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
    public func createEnable(id: String) async throws -> PlusApiResultPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/\(id)/enable"), body: nil)
        return response as? PlusApiResultPlusAgentSkillVO
    }

    /// Disable skill
    public func createDisable(id: String) async throws -> PlusApiResultPlusAgentSkillVO? {
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

    /// Create skill package
    public func createPackage(body: PlusAgentSkillPackageForm) async throws -> PlusApiResultPlusAgentSkillPackageVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/package"), body: body)
        return response as? PlusApiResultPlusAgentSkillPackageVO
    }

    /// Enable skill package
    public func createEnablePackage(id: String) async throws -> PlusApiResultPlusAgentSkillPackageVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/package/\(id)/enable"), body: nil)
        return response as? PlusApiResultPlusAgentSkillPackageVO
    }

    /// Disable skill package
    public func createDisablePackage(id: String) async throws -> PlusApiResultPlusAgentSkillPackageVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/package/\(id)/disable"), body: nil)
        return response as? PlusApiResultPlusAgentSkillPackageVO
    }

    /// Query skill package list by page
    public func createListByPage(body: PlusAgentSkillPackageQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAgentSkillPackageVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/package/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAgentSkillPackageVO
    }

    /// Query all skill packages
    public func createListAll(body: PlusAgentSkillPackageQueryListForm? = nil) async throws -> PlusApiResultListPlusAgentSkillPackageVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/package/list/all"), body: body)
        return response as? PlusApiResultListPlusAgentSkillPackageVO
    }

    /// Query skill list by page
    public func createListByPageSkill(body: PlusAgentSkillQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAgentSkillVO
    }

    /// Query all skills
    public func createListAllSkill(body: PlusAgentSkillQueryListForm? = nil) async throws -> PlusApiResultListPlusAgentSkillVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/list/all"), body: body)
        return response as? PlusApiResultListPlusAgentSkillVO
    }
}
