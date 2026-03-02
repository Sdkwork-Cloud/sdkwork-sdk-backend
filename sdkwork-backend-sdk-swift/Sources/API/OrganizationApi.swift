import Foundation

public class OrganizationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing organization
    public func update(body: PlusOrganizationForm) async throws -> PlusApiResultPlusOrganizationVO? {
        let response = try await client.put(ApiPaths.backendPath("/organization"), body: body)
        return response as? PlusApiResultPlusOrganizationVO
    }

    /// Create a new organization
    public func create(body: PlusOrganizationForm) async throws -> PlusApiResultPlusOrganizationVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization"), body: body)
        return response as? PlusApiResultPlusOrganizationVO
    }

    /// Uninstall app from organization
    public func uninstall(id: String, body: PlusOrganizationForm) async throws -> PlusApiResultPlusOrganizationVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/\(id)/uninstall"), body: body)
        return response as? PlusApiResultPlusOrganizationVO
    }

    /// Install app for organization
    public func install(id: String, body: PlusOrganizationForm) async throws -> PlusApiResultPlusOrganizationVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/\(id)/install"), body: body)
        return response as? PlusApiResultPlusOrganizationVO
    }

    /// Get organizations by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusOrganizationVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusOrganizationVO
    }

    /// Get all organizations
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusOrganizationVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/list/all"), body: body)
        return response as? PlusApiResultListPlusOrganizationVO
    }

    /// Get access tokens
    public func getAccessTokens(body: GetAccessTokenForm) async throws -> PlusApiResultListTokenResult? {
        let response = try await client.post(ApiPaths.backendPath("/organization/get_access_tokens"), body: body)
        return response as? PlusApiResultListTokenResult
    }

    /// Get an organization by ID
    public func getById(id: String) async throws -> PlusApiResultPlusOrganizationVO? {
        let response = try await client.get(ApiPaths.backendPath("/organization/\(id)"))
        return response as? PlusApiResultPlusOrganizationVO
    }

    /// Delete an organization
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/organization/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
