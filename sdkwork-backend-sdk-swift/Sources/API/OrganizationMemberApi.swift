import Foundation

public class OrganizationMemberApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update organization member
    public func update(body: PlusOrganizationMemberForm) async throws -> PlusApiResultPlusOrganizationMemberVO? {
        let response = try await client.put(ApiPaths.backendPath("/organization-member"), body: body)
        return response as? PlusApiResultPlusOrganizationMemberVO
    }

    /// Create organization member
    public func create(body: PlusOrganizationMemberForm) async throws -> PlusApiResultPlusOrganizationMemberVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization-member"), body: body)
        return response as? PlusApiResultPlusOrganizationMemberVO
    }

    /// Get organization members by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusOrganizationMemberVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization-member/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusOrganizationMemberVO
    }

    /// Get all organization members
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusOrganizationMemberVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization-member/list/all"), body: body)
        return response as? PlusApiResultListPlusOrganizationMemberVO
    }

    /// Get organization member by ID
    public func getById(id: String) async throws -> PlusApiResultPlusOrganizationMemberVO? {
        let response = try await client.get(ApiPaths.backendPath("/organization-member/\(id)"))
        return response as? PlusApiResultPlusOrganizationMemberVO
    }

    /// Delete organization member
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/organization-member/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
