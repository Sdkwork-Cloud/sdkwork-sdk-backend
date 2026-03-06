import Foundation

public class AgentApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing AI agent
    public func update(body: PlusAiAgentForm) async throws -> PlusApiResultPlusAiAgentVO? {
        let response = try await client.put(ApiPaths.backendPath("/agent"), body: body)
        return response as? PlusApiResultPlusAiAgentVO
    }

    /// Create a new AI agent
    public func create(body: PlusAiAgentForm) async throws -> PlusApiResultPlusAiAgentVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent"), body: body)
        return response as? PlusApiResultPlusAiAgentVO
    }

    /// Get public AI agents by page
    public func listPublic(body: PlusAiAgentQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiAgentVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/list_public"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiAgentVO
    }

    /// Get AI agents by page
    public func listByPage(body: PlusAiAgentQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiAgentVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiAgentVO
    }

    /// Get all AI agents
    public func listAllEntities(body: PlusAiAgentQueryListForm? = nil) async throws -> PlusApiResultListPlusAiAgentVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/list/all"), body: body)
        return response as? PlusApiResultListPlusAiAgentVO
    }

    /// Get an AI agent by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAiAgentVO? {
        let response = try await client.get(ApiPaths.backendPath("/agent/\(id)"))
        return response as? PlusApiResultPlusAiAgentVO
    }

    /// Delete an AI agent
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/agent/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
