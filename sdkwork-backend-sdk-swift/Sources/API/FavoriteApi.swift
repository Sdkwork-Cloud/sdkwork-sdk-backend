import Foundation

public class FavoriteApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing favorite
    public func update(body: PlusFavoriteForm) async throws -> PlusApiResultPlusFavoriteVO? {
        let response = try await client.put(ApiPaths.backendPath("/favorite"), body: body)
        return response as? PlusApiResultPlusFavoriteVO
    }

    /// Create a new favorite
    public func create(body: PlusFavoriteForm) async throws -> PlusApiResultPlusFavoriteVO? {
        let response = try await client.post(ApiPaths.backendPath("/favorite"), body: body)
        return response as? PlusApiResultPlusFavoriteVO
    }

    /// Get favorites by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusFavoriteVO? {
        let response = try await client.post(ApiPaths.backendPath("/favorite/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusFavoriteVO
    }

    /// Get all favorites
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusFavoriteVO? {
        let response = try await client.post(ApiPaths.backendPath("/favorite/list/all"), body: body)
        return response as? PlusApiResultListPlusFavoriteVO
    }

    /// Get a favorite by ID
    public func getById(id: String) async throws -> PlusApiResultPlusFavoriteVO? {
        let response = try await client.get(ApiPaths.backendPath("/favorite/\(id)"))
        return response as? PlusApiResultPlusFavoriteVO
    }

    /// Delete a favorite
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/favorite/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
