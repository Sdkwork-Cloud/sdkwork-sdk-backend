import Foundation

public class ShopApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing shop
    public func update(body: PlusShopForm) async throws -> PlusApiResultPlusShopVO? {
        let response = try await client.put(ApiPaths.backendPath("/shop"), body: body)
        return response as? PlusApiResultPlusShopVO
    }

    /// Create a new shop
    public func create(body: PlusShopForm) async throws -> PlusApiResultPlusShopVO? {
        let response = try await client.post(ApiPaths.backendPath("/shop"), body: body)
        return response as? PlusApiResultPlusShopVO
    }

    /// Get shops by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusShopVO? {
        let response = try await client.post(ApiPaths.backendPath("/shop/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusShopVO
    }

    /// Get all shops
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusShopVO? {
        let response = try await client.post(ApiPaths.backendPath("/shop/list/all"), body: body)
        return response as? PlusApiResultListPlusShopVO
    }

    /// Get a shop by ID
    public func getById(id: String) async throws -> PlusApiResultPlusShopVO? {
        let response = try await client.get(ApiPaths.backendPath("/shop/\(id)"))
        return response as? PlusApiResultPlusShopVO
    }

    /// Delete a shop
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/shop/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
