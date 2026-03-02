import Foundation

public class ShortUrlApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update short URL
    public func update(body: ShortUrlForm) async throws -> PlusApiResultShortUrlVO? {
        let response = try await client.put(ApiPaths.backendPath("/short_url"), body: body)
        return response as? PlusApiResultShortUrlVO
    }

    /// Create short URL
    public func create(body: ShortUrlForm) async throws -> PlusApiResultShortUrlVO? {
        let response = try await client.post(ApiPaths.backendPath("/short_url"), body: body)
        return response as? PlusApiResultShortUrlVO
    }

    /// Get short URLs by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPageShortUrlVO? {
        let response = try await client.post(ApiPaths.backendPath("/short_url/list"), body: body, params: params)
        return response as? PlusApiResultPageShortUrlVO
    }

    /// Get all short URLs
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListShortUrlVO? {
        let response = try await client.post(ApiPaths.backendPath("/short_url/list/all"), body: body)
        return response as? PlusApiResultListShortUrlVO
    }

    /// Get short URL details
    public func getById(id: String) async throws -> PlusApiResultShortUrlVO? {
        let response = try await client.get(ApiPaths.backendPath("/short_url/\(id)"))
        return response as? PlusApiResultShortUrlVO
    }

    /// Delete short URL
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/short_url/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
