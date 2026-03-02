import Foundation

public class UserOauthAccountApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update user OAuth account
    public func update(body: PlusUserOAuthAccountForm) async throws -> PlusApiResultPlusUserOAuthAccountVO? {
        let response = try await client.put(ApiPaths.backendPath("/user/oauth/account"), body: body)
        return response as? PlusApiResultPlusUserOAuthAccountVO
    }

    /// Create user OAuth account
    public func create(body: PlusUserOAuthAccountForm) async throws -> PlusApiResultPlusUserOAuthAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/oauth/account"), body: body)
        return response as? PlusApiResultPlusUserOAuthAccountVO
    }

    /// Get user OAuth accounts by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusUserOAuthAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/oauth/account/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusUserOAuthAccountVO
    }

    /// Get all user OAuth accounts
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusUserOAuthAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/oauth/account/list/all"), body: body)
        return response as? PlusApiResultListPlusUserOAuthAccountVO
    }

    /// Get user OAuth account by ID
    public func getById(id: String) async throws -> PlusApiResultPlusUserOAuthAccountVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/oauth/account/\(id)"))
        return response as? PlusApiResultPlusUserOAuthAccountVO
    }

    /// Delete user OAuth account
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/user/oauth/account/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
