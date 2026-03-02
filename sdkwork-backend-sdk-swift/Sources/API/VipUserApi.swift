import Foundation

public class VipUserApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing VIP user
    public func update(body: PlusVipUserForm) async throws -> PlusApiResultPlusVipUserVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/user"), body: body)
        return response as? PlusApiResultPlusVipUserVO
    }

    /// Create a new VIP user
    public func create(body: PlusVipUserForm) async throws -> PlusApiResultPlusVipUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/user"), body: body)
        return response as? PlusApiResultPlusVipUserVO
    }

    /// Get VIP users by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/user/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipUserVO
    }

    /// Get all VIP users
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/user/list/all"), body: body)
        return response as? PlusApiResultListPlusVipUserVO
    }

    /// Get a VIP user by ID
    public func getCurrentUser() async throws -> PlusApiResultPlusVipUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/user/get_current_user"), body: nil)
        return response as? PlusApiResultPlusVipUserVO
    }

    /// Get a VIP user by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVipUserVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/user/\(id)"))
        return response as? PlusApiResultPlusVipUserVO
    }

    /// Delete a VIP user
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/user/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
