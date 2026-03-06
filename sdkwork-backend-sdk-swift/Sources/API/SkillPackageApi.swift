import Foundation

public class SkillPackageApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get skill package detail
    public func getById(id: String) async throws -> PlusApiResultPlusAgentSkillPackageVO? {
        let response = try await client.get(ApiPaths.backendPath("/skill/package/\(id)"))
        return response as? PlusApiResultPlusAgentSkillPackageVO
    }

    /// Update skill package
    public func update(id: String, body: PlusAgentSkillPackageForm) async throws -> PlusApiResultPlusAgentSkillPackageVO? {
        let response = try await client.put(ApiPaths.backendPath("/skill/package/\(id)"), body: body)
        return response as? PlusApiResultPlusAgentSkillPackageVO
    }

    /// Delete skill package
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/skill/package/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Create skill package
    public func create(body: PlusAgentSkillPackageForm) async throws -> PlusApiResultPlusAgentSkillPackageVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/package"), body: body)
        return response as? PlusApiResultPlusAgentSkillPackageVO
    }

    /// Enable skill package
    public func enable(id: String) async throws -> PlusApiResultPlusAgentSkillPackageVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/package/\(id)/enable"), body: nil)
        return response as? PlusApiResultPlusAgentSkillPackageVO
    }

    /// Disable skill package
    public func disable(id: String) async throws -> PlusApiResultPlusAgentSkillPackageVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/package/\(id)/disable"), body: nil)
        return response as? PlusApiResultPlusAgentSkillPackageVO
    }

    /// Query skill package list by page
    public func listByPage(body: PlusAgentSkillPackageQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAgentSkillPackageVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/package/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAgentSkillPackageVO
    }

    /// Query all skill packages
    public func listAll(body: PlusAgentSkillPackageQueryListForm? = nil) async throws -> PlusApiResultListPlusAgentSkillPackageVO? {
        let response = try await client.post(ApiPaths.backendPath("/skill/package/list/all"), body: body)
        return response as? PlusApiResultListPlusAgentSkillPackageVO
    }
}
