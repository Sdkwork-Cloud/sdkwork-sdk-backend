import Foundation

public class AiPromptApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing AI prompt
    public func update(body: PlusAiPromptForm) async throws -> PlusApiResultPlusAiPromptVO? {
        let response = try await client.put(ApiPaths.backendPath("/prompt"), body: body)
        return response as? PlusApiResultPlusAiPromptVO
    }

    /// Create a new AI prompt
    public func create(body: PlusAiPromptForm) async throws -> PlusApiResultPlusAiPromptVO? {
        let response = try await client.post(ApiPaths.backendPath("/prompt"), body: body)
        return response as? PlusApiResultPlusAiPromptVO
    }

    /// Get AI prompts by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiPromptVO? {
        let response = try await client.post(ApiPaths.backendPath("/prompt/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiPromptVO
    }

    /// Get all AI prompts
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAiPromptVO? {
        let response = try await client.post(ApiPaths.backendPath("/prompt/list/all"), body: body)
        return response as? PlusApiResultListPlusAiPromptVO
    }

    /// Get an AI prompt by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAiPromptVO? {
        let response = try await client.get(ApiPaths.backendPath("/prompt/\(id)"))
        return response as? PlusApiResultPlusAiPromptVO
    }

    /// Delete an AI prompt
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/prompt/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
