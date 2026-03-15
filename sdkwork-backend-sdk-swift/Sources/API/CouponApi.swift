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

    /// Update an existing coupon template
    public func updateTemplate(body: PlusCouponTemplateForm) async throws -> PlusApiResultPlusCouponTemplateVO? {
        let response = try await client.put(ApiPaths.backendPath("/coupon/template"), body: body)
        return response as? PlusApiResultPlusCouponTemplateVO
    }

    /// Create a new coupon template
    public func createTemplate(body: PlusCouponTemplateForm) async throws -> PlusApiResultPlusCouponTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/template"), body: body)
        return response as? PlusApiResultPlusCouponTemplateVO
    }

    /// Exchange coupon by points
    public func exchangeByPoints(couponId: String, body: CouponPointsExchangeForm) async throws -> PlusApiResultPlusUserCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/\(couponId)/exchange/points"), body: body)
        return response as? PlusApiResultPlusUserCouponVO
    }

    /// Get coupon templates by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCouponTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/template/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCouponTemplateVO
    }

    /// Get all coupon templates
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCouponTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/template/list/all"), body: body)
        return response as? PlusApiResultListPlusCouponTemplateVO
    }

    /// Redeem coupon
    public func redeem(body: CouponRedeemForm) async throws -> PlusApiResultPlusUserCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/redeem"), body: body)
        return response as? PlusApiResultPlusUserCouponVO
    }

    /// Rollback points exchange coupon
    public func rollbackPointsExchange(userCouponId: String, body: CouponRollbackForm? = nil) async throws -> PlusApiResultPlusUserCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/my/\(userCouponId)/rollback"), body: body)
        return response as? PlusApiResultPlusUserCouponVO
    }

    /// Get coupon templates by page
    public func createListByPageCoupon(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/coupon/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCouponVO
    }

    /// Get all coupon templates
    public func createListAllEntitiesCoupon(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCouponVO? {
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

    /// Get a coupon template by ID
    public func getByIdTemplate(id: String) async throws -> PlusApiResultPlusCouponTemplateVO? {
        let response = try await client.get(ApiPaths.backendPath("/coupon/template/\(id)"))
        return response as? PlusApiResultPlusCouponTemplateVO
    }

    /// Delete a coupon template
    public func deleteTemplate(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/coupon/template/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
