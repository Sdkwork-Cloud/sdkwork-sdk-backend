import Foundation

public class RbacPermissionApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    public func update(body: PlusPermissionForm) async throws -> PlusApiResultPlusPermissionVO? {
        let response = try await client.put(ApiPaths.backendPath("/permission"), body: body)
        return response as? PlusApiResultPlusPermissionVO
    }

    public func create(body: PlusPermissionForm) async throws -> PlusApiResultPlusPermissionVO? {
        let response = try await client.post(ApiPaths.backendPath("/permission"), body: body)
        return response as? PlusApiResultPlusPermissionVO
    }

    /// List permissions by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusPermissionVO? {
        let response = try await client.post(ApiPaths.backendPath("/permission/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusPermissionVO
    }

    /// List all permissions
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusPermissionVO? {
        let response = try await client.post(ApiPaths.backendPath("/permission/list/all"), body: body)
        return response as? PlusApiResultListPlusPermissionVO
    }

    public func getById(id: String) async throws -> PlusApiResultPlusPermissionVO? {
        let response = try await client.get(ApiPaths.backendPath("/permission/\(id)"))
        return response as? PlusApiResultPlusPermissionVO
    }

    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/permission/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
