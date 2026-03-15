import Foundation

public class RbacApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update user-role relationship
    public func update(body: PlusUserRoleForm) async throws -> PlusApiResultPlusUserRoleVO? {
        let response = try await client.put(ApiPaths.backendPath("/rbac/user/role"), body: body)
        return response as? PlusApiResultPlusUserRoleVO
    }

    /// Create user-role relationship
    public func create(body: PlusUserRoleForm) async throws -> PlusApiResultPlusUserRoleVO? {
        let response = try await client.post(ApiPaths.backendPath("/rbac/user/role"), body: body)
        return response as? PlusApiResultPlusUserRoleVO
    }

    /// Get user-role relationships by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusUserRoleVO? {
        let response = try await client.post(ApiPaths.backendPath("/rbac/user/role/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusUserRoleVO
    }

    /// Get all user-role relationships
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusUserRoleVO? {
        let response = try await client.post(ApiPaths.backendPath("/rbac/user/role/list/all"), body: body)
        return response as? PlusApiResultListPlusUserRoleVO
    }

    /// Get user-role relationship by ID
    public func getById(id: String) async throws -> PlusApiResultPlusUserRoleVO? {
        let response = try await client.get(ApiPaths.backendPath("/rbac/user/role/\(id)"))
        return response as? PlusApiResultPlusUserRoleVO
    }

    /// Delete user-role relationship
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/rbac/user/role/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
