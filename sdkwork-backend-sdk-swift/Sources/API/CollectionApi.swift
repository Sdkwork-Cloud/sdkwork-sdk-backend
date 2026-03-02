import Foundation

public class CollectionApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing collection
    public func update(body: PlusCollectionForm) async throws -> PlusApiResultPlusCollectionVO? {
        let response = try await client.put(ApiPaths.backendPath("/collection"), body: body)
        return response as? PlusApiResultPlusCollectionVO
    }

    /// Create a new collection
    public func create(body: PlusCollectionForm) async throws -> PlusApiResultPlusCollectionVO? {
        let response = try await client.post(ApiPaths.backendPath("/collection"), body: body)
        return response as? PlusApiResultPlusCollectionVO
    }

    /// Get collections by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCollectionVO? {
        let response = try await client.post(ApiPaths.backendPath("/collection/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCollectionVO
    }

    /// Get all collections
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCollectionVO? {
        let response = try await client.post(ApiPaths.backendPath("/collection/list/all"), body: body)
        return response as? PlusApiResultListPlusCollectionVO
    }

    /// Get a collection by ID
    public func getById(id: String) async throws -> PlusApiResultPlusCollectionVO? {
        let response = try await client.get(ApiPaths.backendPath("/collection/\(id)"))
        return response as? PlusApiResultPlusCollectionVO
    }

    /// Delete a collection
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/collection/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
