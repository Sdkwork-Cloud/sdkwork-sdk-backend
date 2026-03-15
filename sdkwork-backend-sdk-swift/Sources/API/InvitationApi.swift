import Foundation

public class InvitationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an invitation relation
    public func update(body: InvitationRelationForm) async throws -> PlusApiResultInvitationRelationVO? {
        let response = try await client.put(ApiPaths.backendPath("/invitation/relation"), body: body)
        return response as? PlusApiResultInvitationRelationVO
    }

    /// Create a new invitation relation
    public func create(body: InvitationRelationForm) async throws -> PlusApiResultInvitationRelationVO? {
        let response = try await client.post(ApiPaths.backendPath("/invitation/relation"), body: body)
        return response as? PlusApiResultInvitationRelationVO
    }

    /// Update an existing invitation code
    public func updateCode(body: InvitationCodeForm) async throws -> PlusApiResultInvitationCodeVO? {
        let response = try await client.put(ApiPaths.backendPath("/invitation/code"), body: body)
        return response as? PlusApiResultInvitationCodeVO
    }

    /// Create a new invitation code
    public func createCode(body: InvitationCodeForm) async throws -> PlusApiResultInvitationCodeVO? {
        let response = try await client.post(ApiPaths.backendPath("/invitation/code"), body: body)
        return response as? PlusApiResultInvitationCodeVO
    }

    /// Get invitation relations by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPageInvitationRelationVO? {
        let response = try await client.post(ApiPaths.backendPath("/invitation/relation/list"), body: body, params: params)
        return response as? PlusApiResultPageInvitationRelationVO
    }

    /// Get all invitation relations
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListInvitationRelationVO? {
        let response = try await client.post(ApiPaths.backendPath("/invitation/relation/list/all"), body: body)
        return response as? PlusApiResultListInvitationRelationVO
    }

    /// Get invitation codes by page
    public func createListByPageCode(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPageInvitationCodeVO? {
        let response = try await client.post(ApiPaths.backendPath("/invitation/code/list"), body: body, params: params)
        return response as? PlusApiResultPageInvitationCodeVO
    }

    /// Get all invitation codes
    public func createListAllEntitiesCode(body: QueryListForm? = nil) async throws -> PlusApiResultListInvitationCodeVO? {
        let response = try await client.post(ApiPaths.backendPath("/invitation/code/list/all"), body: body)
        return response as? PlusApiResultListInvitationCodeVO
    }

    /// Get an invitation relation by ID
    public func getById(id: String) async throws -> PlusApiResultInvitationRelationVO? {
        let response = try await client.get(ApiPaths.backendPath("/invitation/relation/\(id)"))
        return response as? PlusApiResultInvitationRelationVO
    }

    /// Delete an invitation relation
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/invitation/relation/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get an invitation code by ID
    public func getByIdCode(id: String) async throws -> PlusApiResultInvitationCodeVO? {
        let response = try await client.get(ApiPaths.backendPath("/invitation/code/\(id)"))
        return response as? PlusApiResultInvitationCodeVO
    }

    /// Delete an invitation code
    public func deleteCode(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/invitation/code/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
