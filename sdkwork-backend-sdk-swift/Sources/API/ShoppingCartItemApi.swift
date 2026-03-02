import Foundation

public class ShoppingCartItemApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing shopping cart item
    public func update(body: PlusShoppingCartItemForm) async throws -> PlusApiResultPlusShoppingCartItemVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/shopping/cart/item"), body: body)
        return response as? PlusApiResultPlusShoppingCartItemVO
    }

    /// Create a new shopping cart item
    public func create(body: PlusShoppingCartItemForm) async throws -> PlusApiResultPlusShoppingCartItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart/item"), body: body)
        return response as? PlusApiResultPlusShoppingCartItemVO
    }

    /// Get shopping cart items by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusShoppingCartItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusShoppingCartItemVO
    }

    /// Get all shopping cart items
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusShoppingCartItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list/all"), body: body)
        return response as? PlusApiResultListPlusShoppingCartItemVO
    }

    /// Get a shopping cart item by ID
    public func getById(id: String) async throws -> PlusApiResultPlusShoppingCartItemVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/shopping/cart/item/\(id)"))
        return response as? PlusApiResultPlusShoppingCartItemVO
    }

    /// Delete a shopping cart item
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/shopping/cart/item/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
