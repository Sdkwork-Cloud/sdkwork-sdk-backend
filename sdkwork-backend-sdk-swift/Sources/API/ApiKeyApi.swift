import Foundation

public class ApikeyApi {
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

    /// Get API key detail for current user
    public func getMyApiKey(id: String) async throws -> PlusApiResultPlusApiKeyVO? {
        let response = try await client.get(ApiPaths.backendPath("/apikey/my/\(id)"))
        return response as? PlusApiResultPlusApiKeyVO
    }

    /// Update API key for current user
    public func updateMyApiKey(id: String, body: PlusApiKeySelfUpdateForm) async throws -> PlusApiResultPlusApiKeyVO? {
        let response = try await client.put(ApiPaths.backendPath("/apikey/my/\(id)"), body: body)
        return response as? PlusApiResultPlusApiKeyVO
    }

    /// Delete API key for current user
    public func deleteMyApiKey(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/apikey/my/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Create API key for current user
    public func createMyApiKey(body: PlusApiKeySelfCreateForm) async throws -> PlusApiResultPlusApiKeyVO? {
        let response = try await client.post(ApiPaths.backendPath("/apikey/my"), body: body)
        return response as? PlusApiResultPlusApiKeyVO
    }

    /// Rotate API key for current user
    public func rotateMyApiKey(id: String) async throws -> PlusApiResultPlusApiKeyVO? {
        let response = try await client.post(ApiPaths.backendPath("/apikey/my/\(id)/rotate"), body: nil)
        return response as? PlusApiResultPlusApiKeyVO
    }

    /// Enable API key for current user
    public func enableMyApiKey(id: String) async throws -> PlusApiResultPlusApiKeyVO? {
        let response = try await client.post(ApiPaths.backendPath("/apikey/my/\(id)/enable"), body: nil)
        return response as? PlusApiResultPlusApiKeyVO
    }

    /// Disable API key for current user
    public func disableMyApiKey(id: String) async throws -> PlusApiResultPlusApiKeyVO? {
        let response = try await client.post(ApiPaths.backendPath("/apikey/my/\(id)/disable"), body: nil)
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

    /// List API keys for current user
    public func listMyApiKeys() async throws -> PlusApiResultListPlusApiKeyVO? {
        let response = try await client.get(ApiPaths.backendPath("/apikey/my/list"))
        return response as? PlusApiResultListPlusApiKeyVO
    }
}
