import Foundation

public class CollectionItemApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing collection item
    public func update(body: PlusCollectionItemForm) async throws -> PlusApiResultPlusCollectionItemVO? {
        let response = try await client.put(ApiPaths.backendPath("/collection-item"), body: body)
        return response as? PlusApiResultPlusCollectionItemVO
    }

    /// Create a new collection item
    public func create(body: PlusCollectionItemForm) async throws -> PlusApiResultPlusCollectionItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/collection-item"), body: body)
        return response as? PlusApiResultPlusCollectionItemVO
    }

    /// Get collection items by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCollectionItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/collection-item/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCollectionItemVO
    }

    /// Get all collection items
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCollectionItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/collection-item/list/all"), body: body)
        return response as? PlusApiResultListPlusCollectionItemVO
    }

    /// Get a collection item by ID
    public func getById(id: String) async throws -> PlusApiResultPlusCollectionItemVO? {
        let response = try await client.get(ApiPaths.backendPath("/collection-item/\(id)"))
        return response as? PlusApiResultPlusCollectionItemVO
    }

    /// Delete a collection item
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/collection-item/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
