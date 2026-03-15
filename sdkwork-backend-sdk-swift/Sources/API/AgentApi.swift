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

    /// Update an existing agent-tool relationship
    public func updateTool(body: PlusAiAgentToolForm) async throws -> PlusApiResultPlusAiAgentToolVO? {
        let response = try await client.put(ApiPaths.backendPath("/agent/tool"), body: body)
        return response as? PlusApiResultPlusAiAgentToolVO
    }

    /// Create a new agent-tool relationship
    public func createTool(body: PlusAiAgentToolForm) async throws -> PlusApiResultPlusAiAgentToolVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/tool"), body: body)
        return response as? PlusApiResultPlusAiAgentToolVO
    }

    /// Get agent-tool relationships by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiAgentToolVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/tool/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiAgentToolVO
    }

    /// Get all agent-tool relationships
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAiAgentToolVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/tool/list/all"), body: body)
        return response as? PlusApiResultListPlusAiAgentToolVO
    }

    /// Get public AI agents by page
    public func listPublic(body: PlusAiAgentQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiAgentVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/list_public"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiAgentVO
    }

    /// Get AI agents by page
    public func createListByPageAgent(body: PlusAiAgentQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiAgentVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiAgentVO
    }

    /// Get all AI agents
    public func createListAllEntitiesAgent(body: PlusAiAgentQueryListForm? = nil) async throws -> PlusApiResultListPlusAiAgentVO? {
        let response = try await client.post(ApiPaths.backendPath("/agent/list/all"), body: body)
        return response as? PlusApiResultListPlusAiAgentVO
    }

    /// Create a chat completion with agent
    public func withContext(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/with_context"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
    }

    /// Stop a chat completion stream
    public func stop(params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> PlusApiResult? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/stop"), body: nil, params: params, headers: headers)
        return response as? PlusApiResult
    }

    /// Create a chat completion with agent
    public func resumeStream(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/resume_stream"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
    }

    /// Create a chat completion with agent
    public func createCompletions(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/completions"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
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

    /// Get an agent-tool relationship by ID
    public func getByIdTool(id: String) async throws -> PlusApiResultPlusAiAgentToolVO? {
        let response = try await client.get(ApiPaths.backendPath("/agent/tool/\(id)"))
        return response as? PlusApiResultPlusAiAgentToolVO
    }

    /// Delete an agent-tool relationship
    public func deleteTool(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/agent/tool/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
