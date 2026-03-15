import Foundation

public class RoleApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing system role
    public func update(body: PlusRoleForm) async throws -> PlusApiResultPlusRoleVO? {
        let response = try await client.put(ApiPaths.backendPath("/role"), body: body)
        return response as? PlusApiResultPlusRoleVO
    }

    /// Create a new system role
    public func create(body: PlusRoleForm) async throws -> PlusApiResultPlusRoleVO? {
        let response = try await client.post(ApiPaths.backendPath("/role"), body: body)
        return response as? PlusApiResultPlusRoleVO
    }

    /// Update role-permission association
    public func updatePermission(body: PlusRolePermissionForm) async throws -> PlusApiResultPlusRolePermissionVO? {
        let response = try await client.put(ApiPaths.backendPath("/role/permission"), body: body)
        return response as? PlusApiResultPlusRolePermissionVO
    }

    /// Create role-permission association
    public func createPermission(body: PlusRolePermissionForm) async throws -> PlusApiResultPlusRolePermissionVO? {
        let response = try await client.post(ApiPaths.backendPath("/role/permission"), body: body)
        return response as? PlusApiResultPlusRolePermissionVO
    }

    /// Get role-permission associations by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusRolePermissionVO? {
        let response = try await client.post(ApiPaths.backendPath("/role/permission/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusRolePermissionVO
    }

    /// Get all role-permission associations
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusRolePermissionVO? {
        let response = try await client.post(ApiPaths.backendPath("/role/permission/list/all"), body: body)
        return response as? PlusApiResultListPlusRolePermissionVO
    }

    /// Get system roles by page
    public func createListByPageRole(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusRoleVO? {
        let response = try await client.post(ApiPaths.backendPath("/role/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusRoleVO
    }

    /// Get all system roles
    public func createListAllEntitiesRole(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusRoleVO? {
        let response = try await client.post(ApiPaths.backendPath("/role/list/all"), body: body)
        return response as? PlusApiResultListPlusRoleVO
    }

    /// Get a system role by ID
    public func getById(id: String) async throws -> PlusApiResultPlusRoleVO? {
        let response = try await client.get(ApiPaths.backendPath("/role/\(id)"))
        return response as? PlusApiResultPlusRoleVO
    }

    /// Delete a system role
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/role/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get role-permission association by ID
    public func getByIdPermission(id: String) async throws -> PlusApiResultPlusRolePermissionVO? {
        let response = try await client.get(ApiPaths.backendPath("/role/permission/\(id)"))
        return response as? PlusApiResultPlusRolePermissionVO
    }

    /// Delete role-permission association
    public func deletePermission(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/role/permission/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
