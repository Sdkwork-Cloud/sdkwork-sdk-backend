import Foundation

public class UserCouponApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing user coupon
    public func update(body: PlusUserCouponForm) async throws -> PlusApiResultPlusUserCouponVO? {
        let response = try await client.put(ApiPaths.backendPath("/user/coupon"), body: body)
        return response as? PlusApiResultPlusUserCouponVO
    }

    /// Create a new user coupon
    public func create(body: PlusUserCouponForm) async throws -> PlusApiResultPlusUserCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/coupon"), body: body)
        return response as? PlusApiResultPlusUserCouponVO
    }

    /// Get user coupons by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusUserCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/coupon/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusUserCouponVO
    }

    /// Get all user coupons
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusUserCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/coupon/list/all"), body: body)
        return response as? PlusApiResultListPlusUserCouponVO
    }

    /// Get a user coupon by ID
    public func getById(id: String) async throws -> PlusApiResultPlusUserCouponVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/coupon/\(id)"))
        return response as? PlusApiResultPlusUserCouponVO
    }

    /// Delete a user coupon
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/user/coupon/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
