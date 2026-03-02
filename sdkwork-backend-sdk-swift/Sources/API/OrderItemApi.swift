import Foundation

public class OrderItemApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing order item
    public func update(body: PlusOrderItemForm) async throws -> PlusApiResultPlusOrderItemVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/order/item"), body: body)
        return response as? PlusApiResultPlusOrderItemVO
    }

    /// Create a new order item
    public func create(body: PlusOrderItemForm) async throws -> PlusApiResultPlusOrderItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/item"), body: body)
        return response as? PlusApiResultPlusOrderItemVO
    }

    /// Get order items by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusOrderItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/item/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusOrderItemVO
    }

    /// Get all order items
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusOrderItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/item/list/all"), body: body)
        return response as? PlusApiResultListPlusOrderItemVO
    }

    /// Get an order item by ID
    public func getById(id: String) async throws -> PlusApiResultPlusOrderItemVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/order/item/\(id)"))
        return response as? PlusApiResultPlusOrderItemVO
    }

    /// Delete an order item
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/order/item/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
