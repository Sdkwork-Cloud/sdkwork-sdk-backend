import Foundation

public class ProductSkuApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing SKU
    public func update(body: PlusSkuForm) async throws -> PlusApiResultPlusSkuVO? {
        let response = try await client.put(ApiPaths.backendPath("/sku"), body: body)
        return response as? PlusApiResultPlusSkuVO
    }

    /// Create a new SKU
    public func create(body: PlusSkuForm) async throws -> PlusApiResultPlusSkuVO? {
        let response = try await client.post(ApiPaths.backendPath("/sku"), body: body)
        return response as? PlusApiResultPlusSkuVO
    }

    /// Get SKUs by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusSkuVO? {
        let response = try await client.post(ApiPaths.backendPath("/sku/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusSkuVO
    }

    /// Get all SKUs
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusSkuVO? {
        let response = try await client.post(ApiPaths.backendPath("/sku/list/all"), body: body)
        return response as? PlusApiResultListPlusSkuVO
    }

    /// Get an SKU by ID
    public func getById(id: String) async throws -> PlusApiResultPlusSkuVO? {
        let response = try await client.get(ApiPaths.backendPath("/sku/\(id)"))
        return response as? PlusApiResultPlusSkuVO
    }

    /// Delete an SKU
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/sku/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
