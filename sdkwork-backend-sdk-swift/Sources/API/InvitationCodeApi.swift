import Foundation

public class InvitationCodeApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing invitation code
    public func update(body: InvitationCodeForm) async throws -> PlusApiResultInvitationCodeVO? {
        let response = try await client.put(ApiPaths.backendPath("/invitation/code"), body: body)
        return response as? PlusApiResultInvitationCodeVO
    }

    /// Create a new invitation code
    public func create(body: InvitationCodeForm) async throws -> PlusApiResultInvitationCodeVO? {
        let response = try await client.post(ApiPaths.backendPath("/invitation/code"), body: body)
        return response as? PlusApiResultInvitationCodeVO
    }

    /// Get invitation codes by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPageInvitationCodeVO? {
        let response = try await client.post(ApiPaths.backendPath("/invitation/code/list"), body: body, params: params)
        return response as? PlusApiResultPageInvitationCodeVO
    }

    /// Get all invitation codes
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListInvitationCodeVO? {
        let response = try await client.post(ApiPaths.backendPath("/invitation/code/list/all"), body: body)
        return response as? PlusApiResultListInvitationCodeVO
    }

    /// Get an invitation code by ID
    public func getById(id: String) async throws -> PlusApiResultInvitationCodeVO? {
        let response = try await client.get(ApiPaths.backendPath("/invitation/code/\(id)"))
        return response as? PlusApiResultInvitationCodeVO
    }

    /// Delete an invitation code
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/invitation/code/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
