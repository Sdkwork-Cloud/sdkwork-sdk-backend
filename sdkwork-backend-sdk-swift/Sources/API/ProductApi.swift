import Foundation

public class ProductApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing product
    public func update(body: PlusProductForm) async throws -> PlusApiResultPlusProductVO? {
        let response = try await client.put(ApiPaths.backendPath("/product"), body: body)
        return response as? PlusApiResultPlusProductVO
    }

    /// Create a new product
    public func create(body: PlusProductForm) async throws -> PlusApiResultPlusProductVO? {
        let response = try await client.post(ApiPaths.backendPath("/product"), body: body)
        return response as? PlusApiResultPlusProductVO
    }

    /// Get all products
    public func mallHome(body: QueryListForm? = nil) async throws -> PlusApiResultPlusMallHomeVO? {
        let response = try await client.post(ApiPaths.backendPath("/product/mall_home"), body: body)
        return response as? PlusApiResultPlusMallHomeVO
    }

    /// Get products by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusProductVO? {
        let response = try await client.post(ApiPaths.backendPath("/product/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusProductVO
    }

    /// Get all products
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusProductVO? {
        let response = try await client.post(ApiPaths.backendPath("/product/list/all"), body: body)
        return response as? PlusApiResultListPlusProductVO
    }

    /// Get a product by ID
    public func getById(id: String) async throws -> PlusApiResultPlusProductVO? {
        let response = try await client.get(ApiPaths.backendPath("/product/\(id)"))
        return response as? PlusApiResultPlusProductVO
    }

    /// Delete a product
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/product/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a product by ID
    public func getDetail(params: [String: Any]? = nil) async throws -> PlusApiResultPlusProductVO? {
        let response = try await client.get(ApiPaths.backendPath("/product/detail"), params: params)
        return response as? PlusApiResultPlusProductVO
    }
}
