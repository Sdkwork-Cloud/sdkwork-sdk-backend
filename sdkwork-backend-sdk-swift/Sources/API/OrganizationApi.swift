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

    /// Update an existing position
    public func updatePosition(body: PlusPositionForm) async throws -> PlusApiResultPlusPositionVO? {
        let response = try await client.put(ApiPaths.backendPath("/organization/position"), body: body)
        return response as? PlusApiResultPlusPositionVO
    }

    /// Create a new position
    public func createPosition(body: PlusPositionForm) async throws -> PlusApiResultPlusPositionVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/position"), body: body)
        return response as? PlusApiResultPlusPositionVO
    }

    /// Update member relation
    public func updateMemberRelations(body: PlusMemberRelationsForm) async throws -> PlusApiResultPlusMemberRelationsVO? {
        let response = try await client.put(ApiPaths.backendPath("/organization/member-relations"), body: body)
        return response as? PlusApiResultPlusMemberRelationsVO
    }

    /// Create member relation
    public func createMemberRelations(body: PlusMemberRelationsForm) async throws -> PlusApiResultPlusMemberRelationsVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/member-relations"), body: body)
        return response as? PlusApiResultPlusMemberRelationsVO
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

    /// Get positions by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusPositionVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/position/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusPositionVO
    }

    /// Get all positions
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusPositionVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/position/list/all"), body: body)
        return response as? PlusApiResultListPlusPositionVO
    }

    /// Get member relations by page
    public func createListByPageMemberRelations(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusMemberRelationsVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/member-relations/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusMemberRelationsVO
    }

    /// Get all member relations
    public func createListAllEntitiesMemberRelations(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusMemberRelationsVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/member-relations/list/all"), body: body)
        return response as? PlusApiResultListPlusMemberRelationsVO
    }

    /// Get organizations by page
    public func createListByPageOrganization(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusOrganizationVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusOrganizationVO
    }

    /// Get all organizations
    public func createListAllEntitiesOrganization(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusOrganizationVO? {
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

    /// Get child organizations
    public func getChildren(id: String) async throws -> PlusApiResultListPlusOrganizationVO? {
        let response = try await client.get(ApiPaths.backendPath("/organization/\(id)/children"))
        return response as? PlusApiResultListPlusOrganizationVO
    }

    /// Get a position by ID
    public func getByIdPosition(id: String) async throws -> PlusApiResultPlusPositionVO? {
        let response = try await client.get(ApiPaths.backendPath("/organization/position/\(id)"))
        return response as? PlusApiResultPlusPositionVO
    }

    /// Delete a position
    public func deletePosition(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/organization/position/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get member relation by ID
    public func getByIdMemberRelations(id: String) async throws -> PlusApiResultPlusMemberRelationsVO? {
        let response = try await client.get(ApiPaths.backendPath("/organization/member-relations/\(id)"))
        return response as? PlusApiResultPlusMemberRelationsVO
    }

    /// Delete member relation
    public func deleteMemberRelations(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/organization/member-relations/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
