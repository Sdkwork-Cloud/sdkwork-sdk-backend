import Foundation

public class AiGenerationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing AI generation record
    public func update(body: PlusAiGenerationForm) async throws -> PlusApiResultPlusAiGenerationVO? {
        let response = try await client.put(ApiPaths.backendPath("/generation"), body: body)
        return response as? PlusApiResultPlusAiGenerationVO
    }

    /// Create a new AI generation record
    public func create(body: PlusAiGenerationForm) async throws -> PlusApiResultPlusAiGenerationVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation"), body: body)
        return response as? PlusApiResultPlusAiGenerationVO
    }

    /// Get AI generation records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiGenerationVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiGenerationVO
    }

    /// Get all AI generation records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAiGenerationVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/list/all"), body: body)
        return response as? PlusApiResultListPlusAiGenerationVO
    }

    /// Get an AI generation record by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAiGenerationVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/\(id)"))
        return response as? PlusApiResultPlusAiGenerationVO
    }

    /// Delete an AI generation record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/generation/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
