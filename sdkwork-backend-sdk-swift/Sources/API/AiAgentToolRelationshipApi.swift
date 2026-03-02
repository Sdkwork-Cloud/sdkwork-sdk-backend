import Foundation

public class AiAgentToolRelationshipApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing agent-tool relationship
    public func update(body: PlusAiAgentToolForm) async throws -> PlusApiResultPlusAiAgentToolVO? {
        let response = try await client.put(ApiPaths.backendPath("/agent/tool"), body: body)
        return response as? PlusApiResultPlusAiAgentToolVO
    }

    /// Create a new agent-tool relationship
    public func create(body: PlusAiAgentToolForm) async throws -> PlusApiResultPlusAiAgentToolVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/tool"), body: body)
        return response as? PlusApiResultPlusAiAgentToolVO
    }

    /// Get agent-tool relationships by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiAgentToolVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/tool/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiAgentToolVO
    }

    /// Get all agent-tool relationships
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAiAgentToolVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/tool/list/all"), body: body)
        return response as? PlusApiResultListPlusAiAgentToolVO
    }

    /// Get an agent-tool relationship by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAiAgentToolVO? {
        let response = try await client.get(ApiPaths.backendPath("/agent/tool/\(id)"))
        return response as? PlusApiResultPlusAiAgentToolVO
    }

    /// Delete an agent-tool relationship
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/agent/tool/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
