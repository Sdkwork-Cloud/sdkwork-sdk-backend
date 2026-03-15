import Foundation

public class UserApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing user
    public func update(body: PlusUserForm) async throws -> PlusApiResultPlusUserVO? {
        let response = try await client.put(ApiPaths.backendPath("/user"), body: body)
        return response as? PlusApiResultPlusUserVO
    }

    /// Create a new user
    public func create(body: PlusUserForm) async throws -> PlusApiResultPlusUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/user"), body: body)
        return response as? PlusApiResultPlusUserVO
    }

    /// Update user OAuth account
    public func updateAccount(body: PlusUserOAuthAccountForm) async throws -> PlusApiResultPlusUserOAuthAccountVO? {
        let response = try await client.put(ApiPaths.backendPath("/user/oauth/account"), body: body)
        return response as? PlusApiResultPlusUserOAuthAccountVO
    }

    /// Create user OAuth account
    public func createAccount(body: PlusUserOAuthAccountForm) async throws -> PlusApiResultPlusUserOAuthAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/oauth/account"), body: body)
        return response as? PlusApiResultPlusUserOAuthAccountVO
    }

    /// Update an existing user coupon
    public func updateCoupon(body: PlusUserCouponForm) async throws -> PlusApiResultPlusUserCouponVO? {
        let response = try await client.put(ApiPaths.backendPath("/user/coupon"), body: body)
        return response as? PlusApiResultPlusUserCouponVO
    }

    /// Create a new user coupon
    public func createCoupon(body: PlusUserCouponForm) async throws -> PlusApiResultPlusUserCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/coupon"), body: body)
        return response as? PlusApiResultPlusUserCouponVO
    }

    /// Update user-card binding
    public func updateCard(body: PlusUserCardForm) async throws -> PlusApiResultPlusUserCardVO? {
        let response = try await client.put(ApiPaths.backendPath("/user/card"), body: body)
        return response as? PlusApiResultPlusUserCardVO
    }

    /// Create user-card binding
    public func createCard(body: PlusUserCardForm) async throws -> PlusApiResultPlusUserCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/card"), body: body)
        return response as? PlusApiResultPlusUserCardVO
    }

    /// Update an existing user address
    public func updateAddress(body: PlusUserAddressForm) async throws -> PlusApiResultPlusUserAddressVO? {
        let response = try await client.put(ApiPaths.backendPath("/user/address"), body: body)
        return response as? PlusApiResultPlusUserAddressVO
    }

    /// Create a new user address
    public func createAddress(body: PlusUserAddressForm) async throws -> PlusApiResultPlusUserAddressVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/address"), body: body)
        return response as? PlusApiResultPlusUserAddressVO
    }

    /// Get user OAuth accounts by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusUserOAuthAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/oauth/account/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusUserOAuthAccountVO
    }

    /// Get all user OAuth accounts
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusUserOAuthAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/oauth/account/list/all"), body: body)
        return response as? PlusApiResultListPlusUserOAuthAccountVO
    }

    /// Get users by page
    public func createListByPageUser(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusUserVO
    }

    /// Get all users
    public func createListAllEntitiesUser(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/list/all"), body: body)
        return response as? PlusApiResultListPlusUserVO
    }

    /// Get user coupons by page
    public func createListByPageCoupon(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusUserCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/coupon/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusUserCouponVO
    }

    /// Get all user coupons
    public func createListAllEntitiesCoupon(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusUserCouponVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/coupon/list/all"), body: body)
        return response as? PlusApiResultListPlusUserCouponVO
    }

    /// Get user-card bindings by page
    public func createListByPageCard(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusUserCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/card/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusUserCardVO
    }

    /// Get all user-card bindings
    public func createListAllEntitiesCard(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusUserCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/card/list/all"), body: body)
        return response as? PlusApiResultListPlusUserCardVO
    }

    /// Get addresses by page
    public func createListByPageAddress(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusUserAddressVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/address/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusUserAddressVO
    }

    /// Get all user addresses
    public func createListAllEntitiesAddress(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusUserAddressVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/address/list/all"), body: body)
        return response as? PlusApiResultListPlusUserAddressVO
    }

    /// Get a user by ID
    public func getById(id: String) async throws -> PlusApiResultPlusUserVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/\(id)"))
        return response as? PlusApiResultPlusUserVO
    }

    /// Delete a user
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/user/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get current user profile
    public func getProfile() async throws -> PlusApiResultPlusUserProfileVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/profile"))
        return response as? PlusApiResultPlusUserProfileVO
    }

    /// Get user OAuth account by ID
    public func getByIdAccount(id: String) async throws -> PlusApiResultPlusUserOAuthAccountVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/oauth/account/\(id)"))
        return response as? PlusApiResultPlusUserOAuthAccountVO
    }

    /// Delete user OAuth account
    public func deleteAccount(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/user/oauth/account/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a user coupon by ID
    public func getByIdCoupon(id: String) async throws -> PlusApiResultPlusUserCouponVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/coupon/\(id)"))
        return response as? PlusApiResultPlusUserCouponVO
    }

    /// Delete a user coupon
    public func deleteCoupon(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/user/coupon/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get user-card binding by ID
    public func getByIdCard(id: String) async throws -> PlusApiResultPlusUserCardVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/card/\(id)"))
        return response as? PlusApiResultPlusUserCardVO
    }

    /// Delete user-card binding
    public func deleteCard(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/user/card/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get address by ID
    public func getByIdAddress(id: String) async throws -> PlusApiResultPlusUserAddressVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/address/\(id)"))
        return response as? PlusApiResultPlusUserAddressVO
    }

    /// Delete a user address
    public func deleteAddress(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/user/address/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
