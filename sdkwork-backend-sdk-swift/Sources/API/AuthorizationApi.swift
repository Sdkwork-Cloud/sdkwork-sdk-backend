import Foundation

public class AuthorizationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 检查用户角色
    public func hasRole(body: RoleCheckForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authorization/has_role"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// 检查用户权限
    public func hasPermission(body: PermissionCheckForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authorization/has_permission"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// 获取用户角色列表
    public func getRoles() async throws -> PlusApiResultListString? {
        let response = try await client.get(ApiPaths.backendPath("/auth/authorization/roles"))
        return response as? PlusApiResultListString
    }

    /// 获取用户权限列表
    public func getPermissions() async throws -> PlusApiResultListString? {
        let response = try await client.get(ApiPaths.backendPath("/auth/authorization/permissions"))
        return response as? PlusApiResultListString
    }
}
