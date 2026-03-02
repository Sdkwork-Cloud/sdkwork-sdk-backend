import Foundation

public class TenantApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing tenant
    public func update(body: PlusTenantForm) async throws -> PlusApiResultPlusTenantVO? {
        let response = try await client.put(ApiPaths.backendPath("/tenant"), body: body)
        return response as? PlusApiResultPlusTenantVO
    }

    /// Create a new tenant
    public func create(body: PlusTenantForm) async throws -> PlusApiResultPlusTenantVO? {
        let response = try await client.post(ApiPaths.backendPath("/tenant"), body: body)
        return response as? PlusApiResultPlusTenantVO
    }

    /// Uninstall app from tenant
    public func uninstall(id: String, body: PlusTenantForm) async throws -> PlusApiResultPlusTenantVO? {
        let response = try await client.post(ApiPaths.backendPath("/tenant/\(id)/uninstall"), body: body)
        return response as? PlusApiResultPlusTenantVO
    }

    /// Install app for tenant
    public func install(id: String, body: PlusTenantForm) async throws -> PlusApiResultPlusTenantVO? {
        let response = try await client.post(ApiPaths.backendPath("/tenant/\(id)/install"), body: body)
        return response as? PlusApiResultPlusTenantVO
    }

    /// Get tenants by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusTenantVO? {
        let response = try await client.post(ApiPaths.backendPath("/tenant/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusTenantVO
    }

    /// Get all tenants
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusTenantVO? {
        let response = try await client.post(ApiPaths.backendPath("/tenant/list/all"), body: body)
        return response as? PlusApiResultListPlusTenantVO
    }

    /// Get access tokens
    public func getAccessTokens(body: GetAccessTokenForm) async throws -> PlusApiResultListTokenResult? {
        let response = try await client.post(ApiPaths.backendPath("/tenant/get_access_tokens"), body: body)
        return response as? PlusApiResultListTokenResult
    }

    /// Get a tenant by ID
    public func getById(id: String) async throws -> PlusApiResultPlusTenantVO? {
        let response = try await client.get(ApiPaths.backendPath("/tenant/\(id)"))
        return response as? PlusApiResultPlusTenantVO
    }

    /// Delete a tenant
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/tenant/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
