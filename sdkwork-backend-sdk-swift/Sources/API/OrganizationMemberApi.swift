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

    /// Transfer member position
    public func transferPosition(id: String, params: [String: Any]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.put(ApiPaths.backendPath("/organization-member/\(id)/positions/transfer"), body: nil, params: params)
        return response as? PlusApiResultBoolean
    }

    /// Set member primary department
    public func setPrimaryDepartment(id: String, departmentId: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.put(ApiPaths.backendPath("/organization-member/\(id)/departments/\(departmentId)/primary"), body: nil)
        return response as? PlusApiResultBoolean
    }

    /// Transfer member department
    public func transferDepartment(id: String, params: [String: Any]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.put(ApiPaths.backendPath("/organization-member/\(id)/departments/transfer"), body: nil, params: params)
        return response as? PlusApiResultBoolean
    }

    /// Deactivate member
    public func deactivateMember(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.put(ApiPaths.backendPath("/organization-member/\(id)/deactivate"), body: nil)
        return response as? PlusApiResultBoolean
    }

    /// Activate member
    public func activateMember(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.put(ApiPaths.backendPath("/organization-member/\(id)/activate"), body: nil)
        return response as? PlusApiResultBoolean
    }

    /// Bind member to department
    public func addToDepartment(id: String, departmentId: String, params: [String: Any]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/organization-member/\(id)/departments/\(departmentId)"), body: nil, params: params)
        return response as? PlusApiResultBoolean
    }

    /// Unbind member from department
    public func removeFromDepartment(id: String, departmentId: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/organization-member/\(id)/departments/\(departmentId)"))
        return response as? PlusApiResultBoolean
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

    /// Get member role ids
    public func getMemberRoleIds(id: String) async throws -> PlusApiResultListLong? {
        let response = try await client.get(ApiPaths.backendPath("/organization-member/\(id)/roles"))
        return response as? PlusApiResultListLong
    }

    /// Get member positions
    public func getMemberPositions(id: String) async throws -> PlusApiResultListPlusPositionVO? {
        let response = try await client.get(ApiPaths.backendPath("/organization-member/\(id)/positions"))
        return response as? PlusApiResultListPlusPositionVO
    }

    /// Get member departments
    public func getMemberDepartments(id: String) async throws -> PlusApiResultListPlusDepartmentVO? {
        let response = try await client.get(ApiPaths.backendPath("/organization-member/\(id)/departments"))
        return response as? PlusApiResultListPlusDepartmentVO
    }
}
