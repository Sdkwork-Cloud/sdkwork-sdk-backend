import Foundation

public class CouponTemplateApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing coupon template
    public func update(body: PlusCouponTemplateForm) async throws -> PlusApiResultPlusCouponTemplateVO? {
        let response = try await client.put(ApiPaths.backendPath("/coupon/template"), body: body)
        return response as? PlusApiResultPlusCouponTemplateVO
    }

    /// Create a new coupon template
    public func create(body: PlusCouponTemplateForm) async throws -> PlusApiResultPlusCouponTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/template"), body: body)
        return response as? PlusApiResultPlusCouponTemplateVO
    }

    /// Get coupon templates by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCouponTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/template/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCouponTemplateVO
    }

    /// Get all coupon templates
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCouponTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/template/list/all"), body: body)
        return response as? PlusApiResultListPlusCouponTemplateVO
    }

    /// Get a coupon template by ID
    public func getById(id: String) async throws -> PlusApiResultPlusCouponTemplateVO? {
        let response = try await client.get(ApiPaths.backendPath("/coupon/template/\(id)"))
        return response as? PlusApiResultPlusCouponTemplateVO
    }

    /// Delete a coupon template
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/coupon/template/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
