import Foundation

public class FeedApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing feeds entry
    public func update(body: PlusFeedsForm) async throws -> PlusApiResultPlusFeedsVO? {
        let response = try await client.put(ApiPaths.backendPath("/feeds"), body: body)
        return response as? PlusApiResultPlusFeedsVO
    }

    /// Create a new feeds entry
    public func create(body: PlusFeedsForm) async throws -> PlusApiResultPlusFeedsVO? {
        let response = try await client.post(ApiPaths.backendPath("/feeds"), body: body)
        return response as? PlusApiResultPlusFeedsVO
    }

    /// Get feeds entries by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusFeedsVO? {
        let response = try await client.post(ApiPaths.backendPath("/feeds/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusFeedsVO
    }

    /// Get all feeds entries
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusFeedsVO? {
        let response = try await client.post(ApiPaths.backendPath("/feeds/list/all"), body: body)
        return response as? PlusApiResultListPlusFeedsVO
    }

    /// Get a feeds entry by ID
    public func getById(id: String) async throws -> PlusApiResultPlusFeedsVO? {
        let response = try await client.get(ApiPaths.backendPath("/feeds/\(id)"))
        return response as? PlusApiResultPlusFeedsVO
    }

    /// Delete a feeds entry
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/feeds/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
