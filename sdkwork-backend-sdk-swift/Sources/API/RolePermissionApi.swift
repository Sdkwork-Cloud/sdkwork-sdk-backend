import Foundation

public class RolePermissionApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update role-permission association
    public func update(body: PlusRolePermissionForm) async throws -> PlusApiResultPlusRolePermissionVO? {
        let response = try await client.put(ApiPaths.backendPath("/role/permission"), body: body)
        return response as? PlusApiResultPlusRolePermissionVO
    }

    /// Create role-permission association
    public func create(body: PlusRolePermissionForm) async throws -> PlusApiResultPlusRolePermissionVO? {
        let response = try await client.post(ApiPaths.backendPath("/role/permission"), body: body)
        return response as? PlusApiResultPlusRolePermissionVO
    }

    /// Get role-permission associations by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusRolePermissionVO? {
        let response = try await client.post(ApiPaths.backendPath("/role/permission/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusRolePermissionVO
    }

    /// Get all role-permission associations
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusRolePermissionVO? {
        let response = try await client.post(ApiPaths.backendPath("/role/permission/list/all"), body: body)
        return response as? PlusApiResultListPlusRolePermissionVO
    }

    /// Get role-permission association by ID
    public func getById(id: String) async throws -> PlusApiResultPlusRolePermissionVO? {
        let response = try await client.get(ApiPaths.backendPath("/role/permission/\(id)"))
        return response as? PlusApiResultPlusRolePermissionVO
    }

    /// Delete role-permission association
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/role/permission/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
