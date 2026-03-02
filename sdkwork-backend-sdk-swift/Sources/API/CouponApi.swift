import Foundation

public class CouponApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing coupon template
    public func update(body: PlusCouponForm) async throws -> PlusApiResultPlusCouponVO? {
        let response = try await client.put(ApiPaths.backendPath("/coupon"), body: body)
        return response as? PlusApiResultPlusCouponVO
    }

    /// Create a new coupon template
    public func create(body: PlusCouponForm) async throws -> PlusApiResultPlusCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon"), body: body)
        return response as? PlusApiResultPlusCouponVO
    }

    /// Get coupon templates by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCouponVO
    }

    /// Get all coupon templates
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/list/all"), body: body)
        return response as? PlusApiResultListPlusCouponVO
    }

    /// Get a coupon template by ID
    public func getById(id: String) async throws -> PlusApiResultPlusCouponVO? {
        let response = try await client.get(ApiPaths.backendPath("/coupon/\(id)"))
        return response as? PlusApiResultPlusCouponVO
    }

    /// Delete a coupon template
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/coupon/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
