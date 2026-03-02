import Foundation

public class RbacRoleApi {
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

    /// Get system roles by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusRoleVO? {
        let response = try await client.post(ApiPaths.backendPath("/role/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusRoleVO
    }

    /// Get all system roles
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusRoleVO? {
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
}
