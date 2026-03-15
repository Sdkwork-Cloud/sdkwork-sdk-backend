import Foundation

public class ParticipantApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing chat participant
    public func update(body: PlusParticipantForm) async throws -> PlusApiResultPlusParticipantVO? {
        let response = try await client.put(ApiPaths.backendPath("/participant"), body: body)
        return response as? PlusApiResultPlusParticipantVO
    }

    /// Create a new chat participant
    public func create(body: PlusParticipantForm) async throws -> PlusApiResultPlusParticipantVO? {
        let response = try await client.post(ApiPaths.backendPath("/participant"), body: body)
        return response as? PlusApiResultPlusParticipantVO
    }

    /// Get chat participants by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusParticipantVO? {
        let response = try await client.post(ApiPaths.backendPath("/participant/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusParticipantVO
    }

    /// Get all chat participants
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusParticipantVO? {
        let response = try await client.post(ApiPaths.backendPath("/participant/list/all"), body: body)
        return response as? PlusApiResultListPlusParticipantVO
    }

    /// Get a chat participant by ID
    public func getById(id: String) async throws -> PlusApiResultPlusParticipantVO? {
        let response = try await client.get(ApiPaths.backendPath("/participant/\(id)"))
        return response as? PlusApiResultPlusParticipantVO
    }

    /// Delete a chat participant
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/participant/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
