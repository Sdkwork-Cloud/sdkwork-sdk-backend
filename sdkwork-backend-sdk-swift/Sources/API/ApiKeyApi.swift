import Foundation

public class ApiKeyApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing API key
    public func update(body: PlusApiKeyForm) async throws -> PlusApiResultPlusApiKeyVO? {
        let response = try await client.put(ApiPaths.backendPath("/apikey"), body: body)
        return response as? PlusApiResultPlusApiKeyVO
    }

    /// Create a new API key
    public func create(body: PlusApiKeyForm) async throws -> PlusApiResultPlusApiKeyVO? {
        let response = try await client.post(ApiPaths.backendPath("/apikey"), body: body)
        return response as? PlusApiResultPlusApiKeyVO
    }

    /// Get API keys by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusApiKeyVO? {
        let response = try await client.post(ApiPaths.backendPath("/apikey/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusApiKeyVO
    }

    /// Get all API keys
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusApiKeyVO? {
        let response = try await client.post(ApiPaths.backendPath("/apikey/list/all"), body: body)
        return response as? PlusApiResultListPlusApiKeyVO
    }

    /// Get an API key by ID
    public func getById(id: String) async throws -> PlusApiResultPlusApiKeyVO? {
        let response = try await client.get(ApiPaths.backendPath("/apikey/\(id)"))
        return response as? PlusApiResultPlusApiKeyVO
    }

    /// Delete an API key
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/apikey/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
