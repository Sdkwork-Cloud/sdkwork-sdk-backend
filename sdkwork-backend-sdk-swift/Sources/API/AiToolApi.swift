import Foundation

public class AiToolApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing AI tool
    public func update(body: PlusAiToolForm) async throws -> PlusApiResultPlusAiToolVO? {
        let response = try await client.put(ApiPaths.backendPath("/tool"), body: body)
        return response as? PlusApiResultPlusAiToolVO
    }

    /// Create a new AI tool
    public func create(body: PlusAiToolForm) async throws -> PlusApiResultPlusAiToolVO? {
        let response = try await client.post(ApiPaths.backendPath("/tool"), body: body)
        return response as? PlusApiResultPlusAiToolVO
    }

    /// Get AI tools by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiToolVO? {
        let response = try await client.post(ApiPaths.backendPath("/tool/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiToolVO
    }

    /// Get all AI tools
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAiToolVO? {
        let response = try await client.post(ApiPaths.backendPath("/tool/list/all"), body: body)
        return response as? PlusApiResultListPlusAiToolVO
    }

    /// Get an AI tool by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAiToolVO? {
        let response = try await client.get(ApiPaths.backendPath("/tool/\(id)"))
        return response as? PlusApiResultPlusAiToolVO
    }

    /// Delete an AI tool
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/tool/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
