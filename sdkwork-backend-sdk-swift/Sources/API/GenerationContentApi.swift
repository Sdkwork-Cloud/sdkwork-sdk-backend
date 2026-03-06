import Foundation

public class GenerationContentApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update AI generated content
    public func update(body: PlusAiGenerationContentForm) async throws -> PlusApiResultPlusAiGenerationContentVO? {
        let response = try await client.put(ApiPaths.backendPath("/generation/content"), body: body)
        return response as? PlusApiResultPlusAiGenerationContentVO
    }

    /// Create new AI generated content
    public func create(body: PlusAiGenerationContentForm) async throws -> PlusApiResultPlusAiGenerationContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/content"), body: body)
        return response as? PlusApiResultPlusAiGenerationContentVO
    }

    /// Get AI generated content by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiGenerationContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/content/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiGenerationContentVO
    }

    /// Get all AI generated content
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAiGenerationContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/content/list/all"), body: body)
        return response as? PlusApiResultListPlusAiGenerationContentVO
    }

    /// Get AI generated content by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAiGenerationContentVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/content/\(id)"))
        return response as? PlusApiResultPlusAiGenerationContentVO
    }

    /// Delete AI generated content
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/generation/content/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
