import Foundation

public class ShoppingCartApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update shopping cart
    public func update(body: PlusShoppingCartForm) async throws -> PlusApiResultPlusShoppingCartVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/shopping/cart"), body: body)
        return response as? PlusApiResultPlusShoppingCartVO
    }

    /// Create shopping cart
    public func create(body: PlusShoppingCartForm) async throws -> PlusApiResultPlusShoppingCartVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart"), body: body)
        return response as? PlusApiResultPlusShoppingCartVO
    }

    /// Get shopping carts by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusShoppingCartVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusShoppingCartVO
    }

    /// Get all shopping carts
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusShoppingCartVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart/list/all"), body: body)
        return response as? PlusApiResultListPlusShoppingCartVO
    }

    /// Get shopping cart by ID
    public func getById(id: String) async throws -> PlusApiResultPlusShoppingCartVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/shopping/cart/\(id)"))
        return response as? PlusApiResultPlusShoppingCartVO
    }

    /// Delete shopping cart
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/shopping/cart/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
