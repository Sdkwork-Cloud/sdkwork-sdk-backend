import Foundation

public class InvitationRelationApi {
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

    /// Get invitation relations by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPageInvitationRelationVO? {
        let response = try await client.post(ApiPaths.backendPath("/invitation/relation/list"), body: body, params: params)
        return response as? PlusApiResultPageInvitationRelationVO
    }

    /// Get all invitation relations
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListInvitationRelationVO? {
        let response = try await client.post(ApiPaths.backendPath("/invitation/relation/list/all"), body: body)
        return response as? PlusApiResultListInvitationRelationVO
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
}
